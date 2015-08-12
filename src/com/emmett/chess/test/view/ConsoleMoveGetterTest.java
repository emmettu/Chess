package com.emmett.chess.test.view;

import com.emmett.chess.main.model.players.HumanPlayer;
import com.emmett.chess.main.view.ConsoleMoveGetter;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by emmett on 11/08/15.
 */
public class ConsoleMoveGetterTest {

    @Test
    @Ignore
    public void testParseInput() {
        ConsoleMoveGetter getter = new ConsoleMoveGetter();
        HumanPlayer player = new HumanPlayer();
        player.moveGetter = getter;
        getter.player = player;

        getter.update();
        assertEquals(player.getMove().size(), 2);
        System.out.println(player.getMove().get(1).x);
        System.out.println(player.getMove().get(1).y);
    }
}