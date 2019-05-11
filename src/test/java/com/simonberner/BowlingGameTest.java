package com.simonberner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BowlingGameTest {

    private BowlingGame bowlingGame = new BowlingGame();

    // 1st test
    @Test
    @DisplayName("Should be able to handle 20 simple rolls")
    void testSimpleRolls() {
        for (int i = 0; i < 20; i++) {
            bowlingGame.roll(0);
            assertEquals(0, bowlingGame.score());
        }

    }

    // 2nd test
    @Test
    @DisplayName("Should be able to handle a spare")
    void testASpare() {
        // knock down all the pins with 2 rolls
        rollSpare();
        // 1st roll of the next round
        bowlingGame.roll(2);
        // the total point for the round should be 12
        assertEquals(12, bowlingGame.score());
    }

    // 3th test
    @Test
    @DisplayName("Should be able to handle a strike")
    void testAStrike() {
        // knock down 10 pins in the first roll of this round
        rollStrike();
        // knock down 8 pins in the two rolls of the next round
        rollMany(2, 3);
        // the total points for the round should be 18
        assertEquals(16, bowlingGame.score());

    }


    /**
     * 4th test: should be able to handle a perfect game (a game made just by strikes)
     * <p>
     * Round 1, score: 10 + 10 + 10 =30
     * Round 2, score: 10 + 10 + 10 =30
     * Round 3, score: 10 + 10 + 10 =30
     * Round 4, score: 10 + 10 + 10 =30
     * Round 5, score: 10 + 10 + 10 =30
     * Round 6, score: 10 + 10 + 10 =30
     * Round 7, score: 10 + 10 + 10 =30
     * Round 8, score: 10 + 10 + 10 =30
     * Round 9, score: 10 + 10 + 10 =30
     * Round 10, score: 10 + 10 =20
     * Total score possible = 290
     * (Remember: In the 10th round, a player who rolls a STRIKE has a second extra roll to finish the round.)
     */
    @Test
    @DisplayName("Should be able to handle a perfect game")
    void testAPerfectGame() {
        // 10 strikes in every of the 10 rounds plus 1 strike with the extra roll in the 10th round
        rollMany(11, 10);
        assertEquals(290, bowlingGame.score());

    }

    private void rollSpare() {
        bowlingGame.roll(2);
        bowlingGame.roll(8);
    }

    private void rollStrike() {
        bowlingGame.roll(10);
    }

    private void rollMany(int numberOfRolls, int pins) {
        for (int i = 0; i < numberOfRolls; i++) {
            bowlingGame.roll(pins);
        }

    }

}


