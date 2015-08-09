package com.emmett.chess.main.model.pieces;

import com.emmett.chess.main.model.Board;
import com.emmett.chess.main.model.Position;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by emmett on 08/08/15.
 */
public class Rook extends Piece{

    public Rook(Board board, int color) {
        super(board, color);
    }

    @Override
    protected List<Position> generatePossiblePositions() {
        List<Position> positions = new ArrayList<Position>();
        addAllForward(positions);
        addAllBackward(positions);
        addAllRight(positions);
        addAllLeft(positions);
        return positions;
    }
    private  void addAllForward(List<Position> positions) {
        Position newPosition = new Position(
                currentPosition.x,
                currentPosition.y + 1
        );
        for(int i = 2; board.contains(newPosition) && !board.friendlyOccupied(newPosition, color); i++) {
            positions.add(newPosition);
            newPosition = new Position(
                    currentPosition.x,
                    currentPosition.y + i
            );
        }
        if(board.enemyOccupied(newPosition, color)) {
            positions.add(newPosition);
        }
    }
    private  void addAllBackward(List<Position> positions) {
        Position newPosition = new Position(
                currentPosition.x,
                currentPosition.y - 1
        );
        for(int i = 2; board.contains(newPosition) && !board.friendlyOccupied(newPosition, color); i++) {
            positions.add(newPosition);
            newPosition = new Position(
                    currentPosition.x,
                    currentPosition.y - i
            );
        }
        if(board.enemyOccupied(newPosition, color)) {
            positions.add(newPosition);
        }
    }
    private  void addAllRight(List<Position> positions) {
        Position newPosition = new Position(
                currentPosition.x + 1,
                currentPosition.y
        );
        for(int i = 2; board.contains(newPosition) && !board.friendlyOccupied(newPosition, color); i++) {
            positions.add(newPosition);
            newPosition = new Position(
                    currentPosition.x + i,
                    currentPosition.y
            );
        }
        if(board.enemyOccupied(newPosition, color)) {
            positions.add(newPosition);
        }
    }
    private  void addAllLeft(List<Position> positions) {
        Position newPosition = new Position(
                currentPosition.x - 1,
                currentPosition.y
        );
        for(int i = 2; board.contains(newPosition) && !board.friendlyOccupied(newPosition, color); i++) {
            positions.add(newPosition);
            newPosition = new Position(
                    currentPosition.x - i,
                    currentPosition.y
            );
        }
        if(board.enemyOccupied(newPosition, color)) {
            positions.add(newPosition);
        }
    }
}
