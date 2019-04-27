package com.simonberner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BowlingGameTest {

    @Test
    void testGame() {
        BowlingGame bowlingGame = new BowlingGame();
        bowlingGame.roll(0);
        assertEquals(0, bowlingGame.score());
    }

}


