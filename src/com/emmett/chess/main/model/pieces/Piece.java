package com.emmett.chess.main.model.pieces;

import com.emmett.chess.main.model.boards.Board;
import com.emmett.chess.main.model.util.Color;
import com.emmett.chess.main.model.Position;

import java.util.List;

/**
 * Created by emmett on 07/08/15.
 */
public abstract class Piece {

    private List<Position> possiblePositions;
    public Position currentPosition;
    public int color;
    protected Board board;

    Piece(Board board, int color) {
        this.board = board;
        this.color = color;
        if(color == Color.WHITE) {
            board.whitePieces.add(this);
        }
        else {
            board.blackPieces.add(this);
        }
    }

    public List<Position> getPossiblePositions() {
        return possiblePositions;
    }

    public void loadPossiblePositions() {
        possiblePositions = generatePossiblePositions();
    }

    protected abstract List<Position> generatePossiblePositions();

    public void move(Position p) throws IllegalArgumentException {
        loadPossiblePositions();
        if(!possiblePositions.contains(p)) {
            throw new IllegalArgumentException("Invalid move.");
        }
        captureAtNewPosition(p);
        currentPosition = p;

        board.renderer.update();
    }
    public void captureAtNewPosition(Position p) {
        Piece enemy = board.getPieceAt(p);
        List<Piece> pieces =
                color == Color.WHITE ? board.blackPieces : board.whitePieces;
        pieces.remove(enemy);
    }
}
