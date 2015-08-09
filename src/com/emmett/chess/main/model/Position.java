package com.emmett.chess.main.model;

/**
 * Created by emmett on 07/08/15.
 */
public class Position {
    public int x;
    public int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        Position p = (Position) o;
        return x == p.x && y == p.y;
    }
}
