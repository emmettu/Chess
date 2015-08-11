package com.emmett.chess.main.model.pieces;

import com.emmett.chess.main.model.boards.Board;
import com.emmett.chess.main.model.Position;
import com.emmett.chess.main.model.util.MovesUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by emmett on 10/08/15.
 */
public class Queen extends Piece{
    public Queen(Board board, int color) {
        super(board, color);
    }

    @Override
    protected List<Position> generatePossiblePositions() {
        List<Position> positions = new ArrayList<Position>();
        MovesUtil movesUtil = new MovesUtil(board, currentPosition, color);
        positions.addAll(movesUtil.getAllDiagonals());
        positions.addAll(movesUtil.getAllStraights());

        return positions;
    }
}
