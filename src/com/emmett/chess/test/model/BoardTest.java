package com.emmett.chess.test.model;

import com.emmett.chess.main.model.boards.Board;
import com.emmett.chess.main.model.util.Color;
import com.emmett.chess.main.model.Position;
import com.emmett.chess.main.model.pieces.Pawn;
import com.emmett.chess.main.model.pieces.Piece;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by emmett on 07/08/15.
 */
public class BoardTest {
    Board board;
    Piece whitePiece;
    Piece blackPiece;

    @Before
    public void setUp() {
        board = new Board();
        whitePiece = new Pawn(board, Color.WHITE);
        whitePiece.currentPosition = new Position(3, 3);

        blackPiece = new Pawn(board, Color.BLACK);
        blackPiece.currentPosition = new Position(4, 4);
    }

    @Test
    public void testEnemyOccupied() throws Exception {
        boolean isOccupied = board.enemyOccupied(new Position(3, 3), Color.WHITE);
        assertEquals(isOccupied, false);

        isOccupied = board.enemyOccupied(new Position(4, 4), Color.WHITE);
        assertEquals(isOccupied, true);

        isOccupied = board.enemyOccupied(new Position(2, 7), Color.WHITE);
        assertEquals(isOccupied, false);
    }

    @Test
    public void testFriendlyOccupied() throws Exception {
        boolean isOccupied = board.friendlyOccupied(new Position(3, 3), Color.WHITE);
        assertEquals(isOccupied, true);

        isOccupied = board.friendlyOccupied(new Position(4, 4), Color.WHITE);
        assertEquals(isOccupied, false);

        isOccupied = board.friendlyOccupied(new Position(2, 7), Color.WHITE);
        assertEquals(isOccupied, false);
    }

    @Test
    public void testAnyOccupied() throws Exception {
        boolean isOccupied = board.anyOccupied(new Position(3, 3));
        assertEquals(isOccupied, true);

        isOccupied = board.anyOccupied(new Position(4, 4));
        assertEquals(isOccupied, true);

        isOccupied = board.anyOccupied(new Position(2, 7));
        assertEquals(isOccupied, false);
    }
}