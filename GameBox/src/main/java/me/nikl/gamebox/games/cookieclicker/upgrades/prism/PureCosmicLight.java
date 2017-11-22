package me.nikl.gamebox.games.cookieclicker.upgrades.prism;

import me.nikl.gamebox.games.cookieclicker.CCGame;
import me.nikl.gamebox.games.cookieclicker.buildings.Buildings;
import me.nikl.gamebox.games.cookieclicker.upgrades.Upgrade;
import me.nikl.gamebox.games.cookieclicker.upgrades.UpgradeType;

/**
 * Created by Niklas on 09.07.2017.
 *
 */
public class PureCosmicLight extends Upgrade{

    public PureCosmicLight(CCGame game) {
        super(game, 179);
        this.cost = 10500000000000000000000.;
        productionsRequirements.put(Buildings.PRISM, 100);

        // for the standard upgrade type the building icon is used
        loadLanguage(UpgradeType.CLASSIC, Buildings.PRISM);
    }

    @Override
    public void onActivation() {
        game.getBuilding(Buildings.PRISM).multiply(2);
        game.getBuilding(Buildings.PRISM).visualize(game.getInventory());
        active = true;
    }
}