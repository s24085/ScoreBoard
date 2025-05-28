import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class ScoreBoardTest {


    @Test
    public void testStartGame() {
        ScoreBoard scoreBoard = new ScoreBoard();
        scoreBoard.startGame("Mexico", "Canada");
        Assertions.assertEquals(1, scoreBoard.getSummaryByTotalScore().size());
    }

    @Test
    public void testUpdateScore() {
        ScoreBoard scoreBoard = new ScoreBoard();
        scoreBoard.startGame("Mexico", "Canada");
        scoreBoard.updateScore("Mexico", "Canada", 2, 3);
        Assertions.assertEquals("Mexico 2 - 3 Canada", scoreBoard.getSummaryByTotalScore().get(0).toString());
    }

    @Test
    public void testFinishGame() {
        ScoreBoard scoreBoard = new ScoreBoard();
        scoreBoard.startGame("Mexico", "Canada");
        scoreBoard.finishGame("Mexico", "Canada");
        Assertions.assertEquals(0, scoreBoard.getSummaryByTotalScore().size());
    }
}
