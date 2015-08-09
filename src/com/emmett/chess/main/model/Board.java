package com.emmett.chess.main.model;

import com.emmett.chess.main.model.pieces.Piece;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by emmett on 07/08/15.
 */
public class Board {
    public List<Piece> whitePieces = new ArrayList<Piece>();
    public List<Piece> blackPieces = new ArrayList<Piece>();

    public boolean contains(Position p) {
        return (0 <= p.x) && (p.x < 8) && (0 <= p.y) && (p.y < 8);
    }

    public boolean enemyOccupied(Position p, int color) {
        List<Piece> pieces = color == Color.WHITE ? blackPieces : whitePieces;
        return doAnyPiecesOccupy(pieces, p);
    }

    public boolean friendlyOccupied(Position p, int color) {
        List<Piece> pieces = color == Color.WHITE ? whitePieces : blackPieces;
        return doAnyPiecesOccupy(pieces, p);
    }

    public boolean anyOccupied(Position p) {
        List<Piece> pieces = whitePieces;
        pieces.addAll(blackPieces);
        return doAnyPiecesOccupy(pieces, p);
    }

    private boolean doAnyPiecesOccupy(List<Piece> pieces, Position p) {
        for(Piece piece: pieces) {
            if(piece.currentPosition.equals(p)) {
                return true;
            }
        }
        return false;
    }
    public void removePieceAt(Position p) {
        for(Piece piece : whitePieces) {
            if(piece.currentPosition.equals(p)) {
                whitePieces.remove(piece);
                return;
            }
        }
        for(Piece piece : blackPieces) {
            if(piece.currentPosition.equals(p)) {
                blackPieces.remove(piece);
                return;
            }
        }
    }
}
