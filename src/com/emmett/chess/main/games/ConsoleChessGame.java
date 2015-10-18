package com.emmett.chess.main.games;

import com.emmett.chess.main.model.Position;
import com.emmett.chess.main.model.boards.ChessBoard;
import com.emmett.chess.main.model.pieces.Piece;
import com.emmett.chess.main.model.players.HumanPlayer;
import com.emmett.chess.main.model.players.Player;
import com.emmett.chess.main.model.util.Color;
import com.emmett.chess.main.view.ConsoleBoardRenderer;
import com.emmett.chess.main.view.ConsoleMoveGetter;

import java.util.List;

/**
 * Created by emmett on 11/08/15.
 */
public class ConsoleChessGame {

    ChessBoard board = new ChessBoard();
    HumanPlayer player1 = new HumanPlayer(Color.WHITE);
    HumanPlayer player2 = new HumanPlayer(Color.BLACK);
    ConsoleMoveGetter prompt1 = new ConsoleMoveGetter();
    ConsoleMoveGetter prompt2 = new ConsoleMoveGetter();
    int turn = Color.WHITE;

    public ConsoleChessGame() {

        board.renderer = new ConsoleBoardRenderer(board);
        player1.moveGetter = prompt1;
        player2.moveGetter = prompt2;
        prompt1.player = player1;
        prompt2.player = player2;

        board.renderer.update();
        doMoves();
    }

    private void doMoves() {
        while(true) {
            playerMove(player1);
            playerMove(player2);
        }
    }

    private void playerMove(Player player) {
        while(true) {
            try {
                promptPlayer(player);
                return;
            }
            catch(IllegalArgumentException e) {
                System.out.println("No.");
            }
        }
    }

    private void promptPlayer(Player player) {
        List<Position> move = player.getMove();
        Piece piece = board.getPieceAt(move.get(0));

        if(turn == player.color && piece.color == player.color) {
            piece.move(move.get(1));
            turn *= -1;
        }
        else {
            throw new IllegalArgumentException("Dude no.");
        }
    }
}
