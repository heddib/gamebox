package me.nikl.gamebox.game;

import me.nikl.gamebox.Language;

import java.util.List;

/**
 * Hold some default messages that are needed by any game
 *
 * The messages are overwritten in the specific Language files
 */
public abstract class GameLanguage extends Language {
    public List<String> GAME_HELP;
    public String GAME_PAYED = " You payed %cost%", GAME_NOT_ENOUGH_MONEY = " Not enough money (cost: %cost%)";

    public GameLanguage(Game game) {
        super(game.getGameBox(), game.getModule());

        this.GAME_PAYED = getString("game.econ.payed");
        this.GAME_NOT_ENOUGH_MONEY = getString("game.econ.notEnoughMoney");
        this.GAME_HELP = getStringList("gameHelp");
    }
}
