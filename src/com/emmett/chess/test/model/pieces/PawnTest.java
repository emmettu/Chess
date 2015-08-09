package com.emmett.chess.test.model.pieces;

import com.emmett.chess.main.model.Board;
import com.emmett.chess.main.model.Color;
import com.emmett.chess.main.model.Position;
import com.emmett.chess.main.model.pieces.Pawn;
import com.emmett.chess.main.model.pieces.Piece;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by emmett on 08/08/15.
 */
public class PawnTest {

    Board board = new Board();
    @Before
    public void setUp() {

    }
    @Test
    public void testStraight() throws Exception {
        Piece mainPiece = new Pawn(board, Color.WHITE);
        mainPiece.currentPosition = new Position(3, 3);
        mainPiece.loadPossiblePositions();
        List<Position> positions = mainPiece.getPossiblePositions();

        assertEquals(2, positions.size());
        assertEquals(true, positions.contains(new Position(3, 4)));
        assertEquals(true, positions.contains(new Position(3, 5)));
    }

    @Test
    public void testValidDiagonalMove() throws Exception {
        Piece mainPiece = new Pawn(board, Color.WHITE);
        Piece enemyPiece = new Pawn(board, Color.BLACK);
        Piece enemyPiece2 = new Pawn(board, Color.BLACK);

        mainPiece.currentPosition = new Position(3, 3);
        enemyPiece.currentPosition = new Position(4, 4);
        enemyPiece2.currentPosition = new Position(2, 4);

        mainPiece.loadPossiblePositions();
        List<Position> positions = mainPiece.getPossiblePositions();

        assertEquals(4, positions.size());
        assertEquals(true, positions.contains(new Position(4, 4)));
        assertEquals(true, positions.contains(new Position(2, 4)));
    }

    @Test
    public void testMove() throws Exception {

    }
}