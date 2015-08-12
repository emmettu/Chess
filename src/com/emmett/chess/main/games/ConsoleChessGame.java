package com.emmett.chess.main.games;

import com.emmett.chess.main.model.Position;
import com.emmett.chess.main.model.boards.ChessBoard;
import com.emmett.chess.main.model.pieces.Piece;
import com.emmett.chess.main.model.players.HumanPlayer;
import com.emmett.chess.main.view.ConsoleBoardRenderer;
import com.emmett.chess.main.view.ConsoleMoveGetter;

import java.util.List;

/**
 * Created by emmett on 11/08/15.
 */
public class ConsoleChessGame {
    public ConsoleChessGame() {
        ChessBoard board = new ChessBoard();
        board.renderer = new ConsoleBoardRenderer(board);
        HumanPlayer player1 = new HumanPlayer();
        HumanPlayer player2 = new HumanPlayer();
        ConsoleMoveGetter prompt1 = new ConsoleMoveGetter();
        ConsoleMoveGetter prompt2 = new ConsoleMoveGetter();
        player1.moveGetter = prompt1;
        player2.moveGetter = prompt2;
        prompt1.player = player1;
        prompt2.player = player2;

        board.renderer.update();
        while(true) {
            List<Position> p1Move = player1.getMove();
            Piece piece = board.getPieceAt(p1Move.get(0));
            piece.move(p1Move.get(1));

            List<Position> p2move = player2.getMove();
            piece = board.getPieceAt(p2move.get(0));
            piece.move(p2move.get(1));
        }
    }
}
