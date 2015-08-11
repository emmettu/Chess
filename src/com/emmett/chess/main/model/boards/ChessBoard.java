package com.emmett.chess.main.model.boards;

import com.emmett.chess.main.model.PieceFactory;
import com.emmett.chess.main.model.Position;
import com.emmett.chess.main.model.pieces.Piece;

import java.util.List;

/**
 * Created by emmett on 10/08/15.
 */
public class ChessBoard extends Board {
    List<Piece> pawnList;
    List<Piece> knightList;
    List<Piece> bishopList;
    List<Piece> rookList;
    List<Piece> kingList;
    List<Piece> queenList;

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
            Piece whitePawn = placer.placeWhitePawn(new Position(i, 1));
            Piece blackPawn = placer.placeBlackPawn(new Position(i, 6));
            pawnList.add(whitePawn);
            pawnList.add(blackPawn);
            whitePieces.add(whitePawn);
            blackPieces.add(blackPawn);
        }
    }

    private void addKnights() {
        Piece whiteKnight1 = placer.placeWhiteKnight(new Position(1, 0));
        Piece whiteKnight2 = placer.placeWhiteKnight(new Position(6, 0));
        Piece blackKnight1 = placer.placeBlackKnight(new Position(1, 7));
        Piece blackKnight2 = placer.placeBlackKnight(new Position(6, 7));
        knightList.add(whiteKnight1);
        knightList.add(whiteKnight2);
        knightList.add(blackKnight1);
        knightList.add(blackKnight2);
        whitePieces.add(whiteKnight1);
        whitePieces.add(whiteKnight2);
        blackPieces.add(blackKnight1);
        blackPieces.add(blackKnight2);
    }
    private void addBishops() {
        Piece whiteBishop1 = placer.placeWhiteBishop(new Position(2, 0));
        Piece whiteBishop2 = placer.placeWhiteBishop(new Position(5, 0));
        Piece blackBishop1 = placer.placeBlackBishop(new Position(2, 7));
        Piece blackBishop2 = placer.placeBlackBishop(new Position(5, 7));
        bishopList.add(whiteBishop1);
        bishopList.add(whiteBishop2);
        bishopList.add(blackBishop1);
        bishopList.add(blackBishop2);
        whitePieces.add(whiteBishop1);
        whitePieces.add(whiteBishop2);
        blackPieces.add(blackBishop1);
        blackPieces.add(blackBishop2);
    }
    private void addRooks() {
        Piece whiteRook1 = placer.placeWhiteRook(new Position(0, 0));
        Piece whiteRook2 = placer.placeWhiteRook(new Position(7, 0));
        Piece blackRook1 = placer.placeBlackRook(new Position(0, 7));
        Piece blackRook2 = placer.placeBlackRook(new Position(7, 7));
        rookList.add(whiteRook1);
        rookList.add(whiteRook2);
        rookList.add(blackRook1);
        rookList.add(blackRook2);
        whitePieces.add(whiteRook1);
        whitePieces.add(whiteRook2);
        blackPieces.add(blackRook1);
        blackPieces.add(blackRook2);
    }

    private void addQueens() {
        Piece whiteQueen = placer.placeWhiteQueen(new Position(4, 0));
        Piece blackQueen = placer.placeWhiteQueen(new Position(4, 7));
        queenList.add(whiteQueen);
        queenList.add(blackQueen);
        whitePieces.add(whiteQueen);
        blackPieces.add(blackQueen);
    }

    private void addKings() {
        Piece whiteKing = placer.placeWhiteKing(new Position(3, 0));
        Piece blackKing = placer.placeBlackKing(new Position(3, 7));
        kingList.add(whiteKing);
        kingList.add(blackKing);
        whitePieces.add(whiteKing);
        blackPieces.add(blackKing);
    }

}
