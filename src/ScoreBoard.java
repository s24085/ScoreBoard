import java.util.*;

public class ScoreBoard {
    private List<Game> games;

    public ScoreBoard() {
        this.games = new ArrayList<>();
    }

    // Rozpoczynanie meczu
    public void startGame(String homeTeam, String awayTeam) {
        games.add(new Game(homeTeam, awayTeam));
    }

    // Zakończenie meczu
    public void finishGame(String homeTeam, String awayTeam) {
        games.removeIf(game -> game.getHomeTeam().equals(homeTeam) && game.getAwayTeam().equals(awayTeam));
    }

    // Aktualizacja wyniku meczu
    public void updateScore(String homeTeam, String awayTeam, int homeScore, int awayScore) {
        boolean found = false;
        for (Game game : games) {
            if (game.getHomeTeam().equals(homeTeam) && game.getAwayTeam().equals(awayTeam)) {
                game.updateScore(homeScore, awayScore);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Mecz nie istnieje w systemie!");
        }
    }

    // Podsumowanie wyników po sumie punktów
    public List<Game> getSummaryByTotalScore() {
        List<Game> sortedGames = new ArrayList<>(games);
        sortedGames.sort((game1, game2) -> {
            int score1 = game1.getTotalScore();
            int score2 = game2.getTotalScore();
            if (score1 != score2) {
                return Integer.compare(score2, score1);  // Sortowanie malejąco
            }
            return Long.compare(Long.parseLong(game2.getGameId().split("-")[2]),
                    Long.parseLong(game1.getGameId().split("-")[2])); // Sortowanie po czasie dodania (id)
        });
        return sortedGames;
    }

    // Wydrukowanie podsumowania
    public void printSummary() {
        List<Game> sortedGames = getSummaryByTotalScore();
        for (Game game : sortedGames) {
            System.out.println(game);
        }
    }
}
