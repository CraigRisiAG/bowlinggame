package com.simonberner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BowlingGameTest {

    private BowlingGame bowlingGame = new BowlingGame();

    // 1st test
    // Should be able to handle 20 simple rolls with 0 knocked down pins in each of the 10 rounds (frames)
    @Test
    void testSimpleRolls() {
        for (int i = 0; i < 20; i++) {
            bowlingGame.roll(0);
            assertEquals(0, bowlingGame.score());
        }

    }

    // 2nd test
    // Should be able to handle a spare
    @Test
    void testASpare() {
        // knock down all the pins with 2 rolls
        rollSpare();
        // 1st roll of the next round
        bowlingGame.roll(2);
        // the total point for the round should be 12
        assertEquals(12, bowlingGame.score());
    }

    private void rollSpare() {
        bowlingGame.roll(2);
        bowlingGame.roll(8);
    }

}


