package com.emmett.chess.main.model.players;

import com.emmett.chess.main.model.Position;

import java.util.List;

/**
 * Created by emmett on 11/08/15.
 */
public interface Player {
    List<Position> getMove();
}
