package com.emmett.chess.main.view;

import com.emmett.chess.main.model.Position;
import com.emmett.chess.main.model.boards.ChessBoard;
import com.emmett.chess.main.model.pieces.Piece;

import java.util.Arrays;

/**
 * Created by emmett on 10/08/15.
 */
public class ConsoleBoardRenderer implements View {
    ChessBoard board;
    String[][] representation;
    private static final int SIZE = 8;

    public ConsoleBoardRenderer(ChessBoard board) {
        this.board = board;
        representation = new String[SIZE][SIZE];
    }

    @Override
    public void update() {
        for(String[] array: representation) {
            Arrays.fill(array, "[ ]");
        }
        loadPieces();
    }

    private void loadPieces() {
        for(Piece piece : board.pawnList) {
            setRepresentation(piece, "[p]");
        }
        for(Piece piece : board.knightList) {
            setRepresentation(piece, "[k]");
        }
        for(Piece piece : board.bishopList) {
            setRepresentation(piece, "[B]");
        }
        for(Piece piece : board.rookList) {
            setRepresentation(piece, "[R]");
        }
        for(Piece piece : board.queenList) {
            setRepresentation(piece, "[Q]");
        }
        for(Piece piece : board.kingList) {
            setRepresentation(piece, "[K]");
        }
    }

    private void setRepresentation(Piece piece, String symbol) {
        Position p = piece.currentPosition;
        representation[p.x][p.y] = symbol;
    }

    @Override
    public void render() {
        printBoard();
    }

    private void printBoard() {
        for(int y = 0; y < SIZE; y++) {
            for(int x = 0; x < SIZE; x++) {
                System.out.print(representation[x][y]);
            }
            System.out.println();
        }
    }

}
