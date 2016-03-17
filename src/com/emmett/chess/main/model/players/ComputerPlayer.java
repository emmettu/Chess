package com.emmett.chess.main.model.players;

import com.emmett.chess.main.model.Position;

import java.util.List;

/**
 * Created by emmett on 16/03/16.
 */
public class ComputerPlayer extends Player {

    public ComputerPlayer(int color) {
        super(color);
    }

    @Override
    public List<Position> getMove() {
        return null;
    }

}
