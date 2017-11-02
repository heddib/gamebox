package me.nikl.gamebox.games.cookieclicker.upgrades.timemachine;

import me.nikl.gamebox.games.cookieclicker.CookieClicker;
import me.nikl.gamebox.games.cookieclicker.buildings.Buildings;
import me.nikl.gamebox.games.cookieclicker.upgrades.Upgrade;
import me.nikl.gamebox.games.cookieclicker.upgrades.UpgradeType;
import org.bukkit.Material;
import org.bukkit.material.MaterialData;

/**
 * Created by Niklas on 09.07.2017.
 *
 */
public class FarFutureEnactment extends Upgrade{

    public FarFutureEnactment(CookieClicker game) {
        super(game, 199);
        this.cost = 7000000000000000000000.;
        productionsRequirements.put(Buildings.TIME_MACHINE, 150);

        icon = new MaterialData(Material.WATCH).toItemStack();
        icon.setAmount(1);

        loadLanguage(UpgradeType.CLASSIC, Buildings.TIME_MACHINE);
    }

    @Override
    public void onActivation() {
        game.getBuilding(Buildings.TIME_MACHINE).multiply(2);
        game.getBuilding(Buildings.TIME_MACHINE).visualize(game.getInventory());
        active = true;
    }
}
