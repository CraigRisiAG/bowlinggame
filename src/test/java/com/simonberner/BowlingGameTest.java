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
            bowlingGame.roll(2);
        }
        assertEquals(40, bowlingGame.score());
    }

    // 2nd test
    @Test
    @DisplayName("Should be able to handle a spare")
    void testASpare() {
        // knock down all the pins with 2 rolls
        // 1st roll of the next round and then finish the game
        // the total point for the round should be 14
    }

    // 3th test
    @Test
    @DisplayName("Should be able to handle a strike")
    void testAStrike() {
        
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
        

    }

    /**
     * 5th test: should be able to handle a game made just by spares
     * (where the 3th roll in the 10th frame is a strike)
     * <p>
     * Max. score per frame 1-9: 10 + 9 =19
     * Max. score for frame 10: 10 + 10 =20
     * Maximum score possible = 191
     */
    @Test
    @DisplayName("Should be able to handle a perfect spare game")
    void testAPerfectSpareGame() {
       

    }

    private void rollSpare() {

    }

    private void rollPerfectSpare() {
        for (int i = 0; i < 10; i++) {

        }
    }

}


