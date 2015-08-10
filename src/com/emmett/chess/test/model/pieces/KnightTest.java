package com.emmett.chess.test.model.pieces;

import com.emmett.chess.main.model.Board;
import com.emmett.chess.main.model.Color;
import com.emmett.chess.main.model.Position;
import com.emmett.chess.main.model.pieces.Knight;
import com.emmett.chess.main.model.pieces.Pawn;
import com.emmett.chess.main.model.pieces.Piece;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by emmett on 09/08/15.
 */
public class KnightTest {

    Board board;
    Piece mainPiece;
    @Before
    public void setUp() {
        board = new Board();
        mainPiece = new Knight(board, Color.WHITE);
    }
    @Test
    public void testGeneratePositions() {
        mainPiece.currentPosition = new Position(4, 4);
        mainPiece.loadPossiblePositions();
        int numberOfPositions = mainPiece.getPossiblePositions().size();
        assertEquals(numberOfPositions, 8);
    }
    @Test
    public void testSomeOutOfBoundsPositions() throws Exception {
        mainPiece.currentPosition = new Position(0, 0);
        mainPiece.loadPossiblePositions();
        int numberOfPositions = mainPiece.getPossiblePositions().size();
        assertEquals(numberOfPositions, 2);
    }
    @Test
    public void testFriendlyPositions() {
        Piece friendlyPiece = new Pawn(board, Color.WHITE);
        mainPiece.currentPosition = new Position(4, 4);
        friendlyPiece.currentPosition = new Position(6, 5);
        mainPiece.loadPossiblePositions();
        int numberOfPositions = mainPiece.getPossiblePositions().size();
        assertEquals(numberOfPositions, 7);
    }
}