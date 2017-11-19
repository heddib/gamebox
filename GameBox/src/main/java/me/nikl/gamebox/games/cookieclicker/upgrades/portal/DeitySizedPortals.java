package me.nikl.gamebox.games.cookieclicker.upgrades.portal;

import me.nikl.gamebox.games.cookieclicker.CCGame;
import me.nikl.gamebox.games.cookieclicker.buildings.Buildings;
import me.nikl.gamebox.games.cookieclicker.upgrades.Upgrade;
import me.nikl.gamebox.games.cookieclicker.upgrades.UpgradeType;
import org.bukkit.Material;
import org.bukkit.material.MaterialData;

/**
 * Created by Niklas on 09.07.2017.
 *
 */
public class DeitySizedPortals extends Upgrade{

    public DeitySizedPortals(CCGame game) {
        super(game, 198);
        this.cost = 500000000000000000000.;
        productionsRequirements.put(Buildings.PORTAL, 150);

        icon = new MaterialData(Material.EYE_OF_ENDER).toItemStack();
        icon.setAmount(1);

        loadLanguage(UpgradeType.CLASSIC, Buildings.PORTAL);
    }

    @Override
    public void onActivation() {
        game.getBuilding(Buildings.PORTAL).multiply(2);
        game.getBuilding(Buildings.PORTAL).visualize(game.getInventory());
        active = true;
    }
}
