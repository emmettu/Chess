package com.emmett.main.model.pieces;

import com.emmett.main.model.Board;
import com.emmett.main.model.Position;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by emmett on 07/08/15.
 */
public class Pawn extends Piece{

    boolean hasBeenMoved = false;

    public Pawn(Board board, int color) {
        super(board, color);
    }

    @Override
    public List<Position> generatePossiblePositions() {
        List<Position> positions = new ArrayList<Position>();

        Position leftDiagonal = new Position(
                currentPosition.x - 1,
                currentPosition.y + color
        );
        if(validDiagonalMove(leftDiagonal)) {
           positions.add(leftDiagonal);
        }

        Position rightDiagonal = new Position(
                currentPosition.x + 1,
                currentPosition.y + color
        );
        if(validDiagonalMove(rightDiagonal)) {
           positions.add(rightDiagonal);
        }

        Position straight = new Position(
                currentPosition.x,
                currentPosition.y + color
        );
        if(validStraightMove(straight)) {
            positions.add(currentPosition);
        }

        Position doubleStraight = new Position(
                currentPosition.x,
                currentPosition.y + 2*color
        );
        if(validStraightMove(doubleStraight) && !hasBeenMoved) {
            positions.add(doubleStraight);
        }

        return positions;
    }
    boolean validDiagonalMove(Position newPosition) {
        return board.enemyOccupied(newPosition, color) && board.contains(newPosition);
    }
    boolean validStraightMove(Position newPosition) {
        return (!board.anyOccupied(newPosition)) && board.contains(newPosition);
    }
    @Override
    public void move(Position p) {
        this.hasBeenMoved = true;
        currentPosition = p;
    }
}
