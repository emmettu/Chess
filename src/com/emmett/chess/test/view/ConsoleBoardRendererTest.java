package com.emmett.chess.test.view;

import com.emmett.chess.main.model.boards.ChessBoard;
import com.emmett.chess.main.view.ConsoleBoardRenderer;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by emmett on 11/08/15.
 */
public class ConsoleBoardRendererTest {
    @Test
    public void testPrint() {
        ConsoleBoardRenderer renderer = new ConsoleBoardRenderer(new ChessBoard());
        renderer.update();
        renderer.render();
    }

}