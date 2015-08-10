package com.emmett.chess.main.model.pieces;

import com.emmett.chess.main.model.Board;
import com.emmett.chess.main.model.Position;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by emmett on 09/08/15.
 */
public class Knight extends Piece{

    public Knight(Board board, int color) {
        super(board, color);
    }

    @Override
    protected List<Position> generatePossiblePositions() {
        List<Position> positions = new ArrayList<Position>();
        for(Position p : getPotentialPositions()) {
            if(!board.friendlyOccupied(p, color) && board.contains(p)) {
                positions.add(p);
            }
        }
        return positions;
    }

    private Position[] getPotentialPositions() {
        return new Position[] {
               new Position(
                       currentPosition.x + 2,
                       currentPosition.y + 1
               ),
                new Position(
                       currentPosition.x - 2,
                       currentPosition.y + 1
               ),
                new Position(
                       currentPosition.x + 2,
                       currentPosition.y - 1
               ),
                new Position(
                       currentPosition.x - 2,
                       currentPosition.y - 1
               ),
                new Position(
                       currentPosition.x + 1,
                       currentPosition.y + 2
               ),
                new Position(
                       currentPosition.x - 1,
                       currentPosition.y + 2
               ),
                new Position(
                       currentPosition.x + 1,
                       currentPosition.y - 2
               ),
                new Position(
                       currentPosition.x - 1,
                       currentPosition.y - 2
               ),
        };
    }
}