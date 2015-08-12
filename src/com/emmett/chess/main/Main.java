package com.emmett.chess.main;

import com.emmett.chess.main.model.boards.ChessBoard;
import com.emmett.chess.main.view.ConsoleBoardRenderer;

public class Main {

    public static void main(String[] args) {
        ConsoleBoardRenderer renderer = new ConsoleBoardRenderer(new ChessBoard());
        renderer.update();
        renderer.render();
    }
}
