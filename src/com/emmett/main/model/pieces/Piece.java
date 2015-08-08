package com.emmett.main.model.pieces;

import com.emmett.main.model.Board;
import com.emmett.main.model.Position;

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
     }

     public List<Position> getPossiblePositions() {
          return possiblePositions;
     }

     public void loadPossiblePositions() {
          possiblePositions = generatePossiblePositions();
     }

     protected abstract List<Position> generatePossiblePositions();

     public void move(Position p) {
          currentPosition = p;
     }
}
