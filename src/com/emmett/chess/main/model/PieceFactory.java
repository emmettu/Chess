package com.emmett.chess.main.model;

import com.emmett.chess.main.model.boards.Board;
import com.emmett.chess.main.model.pieces.*;
import com.emmett.chess.main.model.util.Color;

/**
 * Created by emmett on 10/08/15.
 */
public class PieceFactory {
    Board board;

    public PieceFactory(Board board) {
        this.board = board;
    }

    public Piece placeWhitePawn(Position position) {
        Piece pawn = new Pawn(board, Color.WHITE);
        pawn.currentPosition = position;
        return pawn;
    }
    public Piece placeBlackPawn(Position position) {
        Piece pawn = new Pawn(board, Color.BLACK);
        pawn.currentPosition = position;
        return pawn;
    }
    public Piece placeWhiteKnight(Position position) {
        Piece pawn = new Knight(board, Color.WHITE);
        pawn.currentPosition = position;
        return pawn;
    }

    public Piece placeBlackKnight(Position position) {
        Piece pawn = new Knight(board, Color.BLACK);
        pawn.currentPosition = position;
        return pawn;
    }

    public Piece placeWhiteBishop(Position position) {
        Piece pawn = new Bishop(board, Color.WHITE);
        pawn.currentPosition = position;
        return pawn;
    }
    public Piece placeBlackBishop(Position position) {
        Piece pawn = new Bishop(board, Color.BLACK);
        pawn.currentPosition = position;
        return pawn;
    }
    public Piece placeWhiteRook(Position position) {
        Piece pawn = new Rook(board, Color.WHITE);
        pawn.currentPosition = position;
        return pawn;
    }
    public Piece placeBlackRook(Position position) {
        Piece pawn = new Rook(board, Color.BLACK);
        pawn.currentPosition = position;
        return pawn;
    }
    public Piece placeWhiteQueen(Position position) {
        Piece pawn = new Queen(board, Color.WHITE);
        pawn.currentPosition = position;
        return pawn;
    }
    public Piece placeBlackQueen(Position position) {
        Piece pawn = new Queen(board, Color.BLACK);
        pawn.currentPosition = position;
        return pawn;
    }
    public Piece placeWhiteKing(Position position) {
        Piece pawn = new King(board, Color.WHITE);
        pawn.currentPosition = position;
        return pawn;
    }
    public Piece placeBlackKing(Position position) {
        Piece pawn = new King(board, Color.BLACK);
        pawn.currentPosition = position;
        return pawn;
    }

}
