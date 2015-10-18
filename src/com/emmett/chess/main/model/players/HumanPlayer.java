package com.emmett.chess.main.model.players;

import com.emmett.chess.main.model.Position;
import com.emmett.chess.main.model.util.Color;
import com.emmett.chess.main.view.View;

import java.util.List;

/**
 * Created by emmett on 11/08/15.
 */
public class HumanPlayer extends Player {

    public View moveGetter;
    List<Position> move;

    public HumanPlayer(int color) {
        super(color);
    }

    @Override
    public List<Position> getMove() {
        moveGetter.update();
        return move;
    }

    public void setMove(List<Position> move) {
        this.move = move;
    }
}
