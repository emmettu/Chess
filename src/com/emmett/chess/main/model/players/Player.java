package com.emmett.chess.main.model.players;

import com.emmett.chess.main.model.Position;

import java.util.List;

/**
 * Created by emmett on 11/08/15.
 */
public abstract class Player {

    public int color;

    public Player(int color) {
        this.color = color;
    }

    public abstract List<Position> getMove();

}
