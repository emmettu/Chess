package com.emmett.chess.test.model.pieces;

import com.emmett.chess.main.model.boards.Board;
import com.emmett.chess.main.model.util.Color;
import com.emmett.chess.main.model.Position;
import com.emmett.chess.main.model.pieces.Piece;
import com.emmett.chess.main.model.pieces.Rook;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by emmett on 08/08/15.
 */
public class RookTest {

    Board board;
    Piece mainPiece;

    @Before
    public void setUp() {
        board = new Board();
        mainPiece = new Rook(board, Color.WHITE);
        mainPiece.currentPosition = new Position(3, 3);
    }
    @Test
    public void testAllStraightMoves() {
        mainPiece.loadPossiblePositions();
        assertEquals(14, mainPiece.getPossiblePositions().size());
    }
}