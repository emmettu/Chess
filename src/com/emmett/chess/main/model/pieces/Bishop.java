package com.emmett.chess.main.model.pieces;

import com.emmett.chess.main.model.Board;
import com.emmett.chess.main.model.Position;
import com.emmett.chess.main.model.util.MovesUtil;

import java.util.List;

/**
 * Created by emmett on 10/08/15.
 */
public class Bishop extends Piece {
    Bishop(Board board, int color) {
        super(board, color);
    }

    @Override
    protected List<Position> generatePossiblePositions() {
        return new MovesUtil(board, currentPosition, color).getAllDiagonals();
    }
}
