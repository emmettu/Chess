package com.emmett.chess.main.model;

import com.emmett.chess.main.model.pieces.*;

/**
 * Created by emmett on 10/08/15.
 */
public class PieceFactory {
    Board board;

    public PieceFactory(Board board) {
        this.board = board;
    }

    public void placeWhitePawn(Position position) {
        Piece pawn = new Pawn(board, Color.WHITE);
        pawn.currentPosition = position;
    }
    public void placeBlackPawn(Position position) {
        Piece pawn = new Pawn(board, Color.BLACK);
        pawn.currentPosition = position;
    }
    public void placeWhiteKnight(Position position) {
        Piece pawn = new Knight(board, Color.WHITE);
        pawn.currentPosition = position;
    }

    public void placeBlackKnight(Position position) {
        Piece pawn = new Knight(board, Color.BLACK);
        pawn.currentPosition = position;
    }

    public void placeWhiteBishop(Position position) {
        Piece pawn = new Bishop(board, Color.WHITE);
        pawn.currentPosition = position;
    }
    public void placeBlackBishop(Position position) {
        Piece pawn = new Bishop(board, Color.BLACK);
        pawn.currentPosition = position;
    }
    public void placeWhiteRook(Position position) {
        Piece pawn = new Rook(board, Color.WHITE);
        pawn.currentPosition = position;
    }
    public void placeBlackRook(Position position) {
        Piece pawn = new Rook(board, Color.BLACK);
        pawn.currentPosition = position;
    }
    public void placeWhiteQueen(Position position) {
        Piece pawn = new Queen(board, Color.WHITE);
        pawn.currentPosition = position;
    }
    public void placeBlackQueen(Position position) {
        Piece pawn = new Queen(board, Color.BLACK);
        pawn.currentPosition = position;
    }
    public void placeWhiteKing(Position position) {
        Piece pawn = new King(board, Color.WHITE);
        pawn.currentPosition = position;
    }
    public void placeBlackKing(Position position) {
        Piece pawn = new King(board, Color.BLACK);
        pawn.currentPosition = position;
    }

}
