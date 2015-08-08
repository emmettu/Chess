package com.emmett.model.pieces;

import com.emmett.model.Board;
import com.emmett.model.Position;

import java.util.List;

/**
 * Created by emmett on 07/08/15.
 */
public abstract class Piece {

     private Board board;
     private List<Position> possiblePositions;
     public Position currentPosition;

     Piece(Board board) {
          this.board = board;
     }

     public List<Position> getPossiblePositions() {
          return possiblePositions;
     }
     public void loadPossiblePositions() {
          possiblePositions = generatePossiblePositions();
     }
     protected abstract List<Position> generatePossiblePositions();
}
