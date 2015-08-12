package com.emmett.chess.main.view;

import com.emmett.chess.main.model.Position;
import com.emmett.chess.main.model.players.HumanPlayer;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by emmett on 11/08/15.
 */
public class ConsoleMoveGetter implements View {
    public HumanPlayer player;
    private static final String prompt = "Enter your move: ";
    String boardColumn = "abcdefgh";

    @Override
    public void update() {
        render();
        Console console = System.console();
        String playerInput = console.readLine();
        List<Position> move = parseInput(playerInput);
        player.setMove(move);
    }

    @Override
    public void render() {
        System.out.print(prompt);
    }

    private List<Position> parseInput(String playerInput) {
        List<Position> move = new ArrayList<Position>();
        Position p1 = new Position(
                boardColumn.indexOf(playerInput.charAt(0)),
                Integer.parseInt(playerInput.substring(1, 2)) - 1
        );
        Position p2 = new Position(
                boardColumn.indexOf(playerInput.charAt(2)),
                Integer.parseInt(playerInput.substring(3)) - 1
        );
        move.add(p1);
        move.add(p2);
        return move;
    }
}
