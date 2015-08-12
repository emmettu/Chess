package com.emmett.chess.main.view;

import com.emmett.chess.main.model.Position;
import com.emmett.chess.main.model.boards.ChessBoard;
import com.emmett.chess.main.model.pieces.Piece;
import com.emmett.chess.main.model.util.Color;

/**
 * Created by emmett on 10/08/15.
 */
public class ConsoleBoardRenderer implements View {
    ChessBoard board;
    String[][] representation;
    private static final int BOARD_SIZE = 8;
    public static final String COLOR_END = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String WHITE = "\u001B[37m";
    public static final String BLACK_SQUARE_START = BLACK + "[" + COLOR_END;
    public static final String BLACK_SQUARE_END = BLACK + "]" + COLOR_END;
    public static final String WHITE_SQUARE_START = WHITE + "[" + COLOR_END;
    public static final String WHITE_SQUARE_END = WHITE + "]" + COLOR_END;
    public static final String END_LEGEND = "a  b  c  d  e  f  g  h";

    public ConsoleBoardRenderer(ChessBoard board) {
        this.board = board;
        representation = new String[BOARD_SIZE][BOARD_SIZE];
    }

    @Override
    public void update() {
        initializeArray();
        loadPieces();
        render();
    }

    private void initializeArray() {
        for(int y = 0; y < BOARD_SIZE; y++) {
            for(int x = 0; x < BOARD_SIZE; x++) {
                if(isWhite(x, y)) {
                    representation[x][y] = WHITE_SQUARE_START + " " +
                                           WHITE_SQUARE_END;
                }
                else {
                    representation[x][y] = BLACK_SQUARE_START + " " +
                                           BLACK_SQUARE_END;
                }
            }
        }
    }

    private void loadPieces() {
        for(Piece piece : board.pawnList) {
            setRepresentation(piece, "p");
        }
        for(Piece piece : board.knightList) {
            setRepresentation(piece, "k");
        }
        for(Piece piece : board.bishopList) {
            setRepresentation(piece, "B");
        }
        for(Piece piece : board.rookList) {
            setRepresentation(piece, "R");
        }
        for(Piece piece : board.queenList) {
            setRepresentation(piece, "Q");
        }
        for(Piece piece : board.kingList) {
            setRepresentation(piece, "K");
        }
    }

    private void setRepresentation(Piece piece, String symbol) {
        Position p = piece.currentPosition;

        representation[p.x][p.y] = getSquareStart(p);

        if(piece.color == Color.WHITE) {
            representation[p.x][p.y] += (WHITE + symbol + COLOR_END);
        }
        else {
            representation[p.x][p.y] += (BLACK + symbol + COLOR_END);
        }
        representation[p.x][p.y] += getSquareEnd(p);
    }

    private String getSquareStart(Position p) {
        if(isWhite(p)) {
            return WHITE_SQUARE_START;
        }
        else {
            return BLACK_SQUARE_START;
        }
    }

    private String getSquareEnd(Position p) {
        return getSquareEnd(p.x, p.y);
    }

    private String getSquareEnd(int x, int y) {
        if(isWhite(x, y)) {
            return WHITE_SQUARE_END;
        }
        else {
            return BLACK_SQUARE_END;
        }
    }

    private boolean isWhite(Position p) {
        return isWhite(p.x, p.y);
    }

    private boolean isWhite(int x, int y) {
        if((x+y) % 2 == 0) {
            return false;
        }
        return true;
    }

    @Override
    public void render() {
        printBoard();
    }

    private void printBoard() {
        for(int y = BOARD_SIZE - 1; y >= 0; y--) {
            System.out.print(y + 1);
            for(int x = 0; x < BOARD_SIZE; x++) {
                System.out.print(representation[x][y]);
            }
            System.out.println();
        }
        System.out.println("  "+END_LEGEND);
    }
}
