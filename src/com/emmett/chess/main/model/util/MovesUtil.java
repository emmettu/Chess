package com.emmett.chess.main.model.util;

import com.emmett.chess.main.model.boards.Board;
import com.emmett.chess.main.model.Position;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by emmett on 10/08/15.
 * Utility class to get diagonal and
 * straight moves, common for many chess pieces.
 */
public class MovesUtil {
    Position position;
    Board board;
    int color;

    public MovesUtil(Board b, Position p, int color) {
        board = b;
        position = p;
        this.color = color;
    }

    public List<Position> getAllDiagonals() {
        List<Position> positions = new ArrayList<Position>();
        positions.addAll(getContinuousOffset(1, 1));
        positions.addAll(getContinuousOffset(-1, 1));
        positions.addAll(getContinuousOffset(-1, -1));
        positions.addAll(getContinuousOffset(1, -1));

        return positions;
    }

    public List<Position> getAllStraights() {
        List<Position> positions = new ArrayList<Position>();
        positions.addAll(getContinuousOffset(1, 0));
        positions.addAll(getContinuousOffset(0, 1));
        positions.addAll(getContinuousOffset(-1, 0));
        positions.addAll(getContinuousOffset(0, -1));

        return positions;
    }

    private List<Position> getContinuousOffset(int x, int y) {
        List<Position> positions = new ArrayList<Position>();
        Position newPosition = new Position(
                position.x + x,
                position.y + y
        );
        for(int i = 2; board.contains(newPosition) && !board.friendlyOccupied(newPosition, color); i++) {
            positions.add(newPosition);
            newPosition = new Position(
                    position.x + i*x,
                    position.y + i*y
            );
        }
        if(board.enemyOccupied(newPosition, color)) {
            positions.add(newPosition);
        }
        return positions;
    }
}
