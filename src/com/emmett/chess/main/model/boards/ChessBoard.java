package com.emmett.chess.main.model.boards;

import com.emmett.chess.main.model.PieceFactory;
import com.emmett.chess.main.model.Position;
import com.emmett.chess.main.model.pieces.Piece;


/**
 * Created by emmett on 10/08/15.
 */
public class ChessBoard extends Board {

    PieceFactory placer = new PieceFactory(this);

    public ChessBoard() {
        addPawns();
        addKnights();
        addBishops();
        addRooks();
        addQueens();
        addKings();
    }
    private void addPawns() {
        for(int i = 0; i < 8; i++) {
            placer.placeWhitePawn(new Position(i, 1));
            placer.placeBlackPawn(new Position(i, 6));
        }
    }

    private void addKnights() {
        placer.placeWhiteKnight(new Position(1, 0));
        placer.placeWhiteKnight(new Position(6, 0));
        placer.placeBlackKnight(new Position(1, 7));
        placer.placeBlackKnight(new Position(6, 7));
    }
    private void addBishops() {
        placer.placeWhiteBishop(new Position(2, 0));
        placer.placeWhiteBishop(new Position(5, 0));
        placer.placeBlackBishop(new Position(2, 7));
        placer.placeBlackBishop(new Position(5, 7));
    }
    private void addRooks() {
        placer.placeWhiteRook(new Position(0, 0));
        placer.placeWhiteRook(new Position(7, 0));
        placer.placeBlackRook(new Position(0, 7));
        placer.placeBlackRook(new Position(7, 7));
    }

    private void addQueens() {
        placer.placeWhiteQueen(new Position(4, 0));
        placer.placeBlackQueen(new Position(4, 7));
    }

    private void addKings() {
        placer.placeWhiteKing(new Position(3, 0));
        placer.placeBlackKing(new Position(3, 7));
    }

}
