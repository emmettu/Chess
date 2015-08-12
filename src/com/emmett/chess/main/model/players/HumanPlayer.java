package com.emmett.chess.main.model.players;

import com.emmett.chess.main.model.Position;
import com.emmett.chess.main.view.View;

import java.util.List;

/**
 * Created by emmett on 11/08/15.
 */
public class HumanPlayer implements Player{

    public View moveGetter;
    List<Position> move;

    @Override
    public List<Position> getMove() {
        moveGetter.update();
        return move;
    }

    public void setMove(List<Position> move) {
        this.move = move;
    }
}
