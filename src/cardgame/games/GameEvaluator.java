package cardgame.games;

import cardgame.model.Player;

import java.util.List;

public interface GameEvaluator {
    public Player evaluateWinner(List<Player> players);
}

