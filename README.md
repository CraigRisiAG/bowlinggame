# Bowling Game Kata

## Intention
The intention of this project is to implement the [CodeKata](http://codekata.com/) [Bowling Game](http://codingdojo.org/kata/Bowling/) and thereby practicing TDD with Java.

§## Bowling game description
1. The game consists of 10 frames (rounds). In each frame a player has two rolls with a ball to knock down a maximum of 10 pins. The score per frame is the total number of knocked down pins plus bonuses if the player does a spare or a strike.  
2. A **spare** is when the player knocks down all 10 pins with two rolls in a frame. The bonus for that frame is the score of the next **first** roll.  
2.1 The maximum score for a frame is 20. 10 scores from the spare in the actual frame and 10 from the strike in the next frame.
3. A **strike** is when the player knocks down all 10 pins with the **first** roll in a frame. The bonus for that frame is the score of the next **two** rolls. 
3.1 The maximum score for a frame is 30. 10 scores from the strike in the actual frame and 20 scores from the strikes of the next two frames. 
4. In the 10th frame, a player who rolls a spare or a strike has a **second** (for strike) or **third** (for spare) extra roll to finish that frame. (No more than three rolls are allowed in the 10th frame).

## Information sources
* [The bowling game kata in Java](https://speakerdeck.com/artenes/the-bowling-game-kata-in-java)
* Uncle Bob: [The Bowling Game Kata](http://butunclebob.com/ArticleS.UncleBob.TheBowlingGameKata)
* [Why I don't like the Bowling Game Kata](https://www.giorgiosironi.com/2009/11/why-i-dont-like-bowling-game-kata.html)
* The Bowling Game Kata [description](http://kata-log.rocks/bowling-game-kata) ([This](https://ccd-school.de/en/coding-dojo/classes-katas/bowling/) might be the better description)

## Setup a Gradle with JUnit5
* [Getting started with Gradle](https://www.jetbrains.com/help/idea/getting-started-with-gradle.html)
* [Setup Junit5](https://github.com/swkBerlin/kata-bootstraps/tree/master/java/junit5)
* [JUnit5 with Gradle](https://junit.org/junit5/docs/current/user-guide/#running-tests-build-gradle)
* [Gradle doc](https://docs.gradle.org/current/userguide/java_testing.html#compiling_and_executing_junit_jupiter_tests)

## Coding Kata
* [What is a TDD-Code Kata?](https://qualitycoding.org/tdd-kata/)

## Possible constraints
Taking [Baby Steps](http://kata-log.rocks/baby-steps)

## Getting the project code
You can get the code by hitting:

    git clone https://github.com/simonberner/bowlinggame.git

Or by simply [downloading the zip](https://github.com/simonberner/bowlinggame/archive/master.zip) file.