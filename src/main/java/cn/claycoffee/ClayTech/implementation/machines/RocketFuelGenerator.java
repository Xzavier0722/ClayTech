package cn.claycoffee.ClayTech.implementation.machines;

import cn.claycoffee.ClayTech.ClayTechItems;
import cn.claycoffee.ClayTech.ClayTechMachineRecipes;
import cn.claycoffee.ClayTech.implementation.abstractMachines.ACraftingTable;
import cn.claycoffee.ClayTech.utils.Lang;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.LockedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class RocketFuelGenerator extends ACraftingTable {

    public RocketFuelGenerator(LockedItemGroup category, SlimefunItemStack item, String id, RecipeType recipeType,
                               ItemStack[] recipe) {
        super(category, item, id, recipeType, recipe);
    }

    @Override
    public String getInventoryTitle() {
        return Lang.readMachinesText("CLAY_ROCKET_FUEL_GENERATOR");
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.REDSTONE_TORCH);
    }

    @Override
    public int getEnergyConsumption() {
        return 64;
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @Override
    public String getMachineIdentifier() {
        return "CLAY_ROCKET_FUEL_GENERATOR";
    }

    @Override
    public void registerDefaultRecipes() {
        this.registerRecipe(8, ClayTechMachineRecipes.MIXED_ROCKET_FUEL,
                new ItemStack[]{ClayTechItems.MIXED_ROCKET_FUEL});
    }

    @Override
    public int getCapacity() {
        return 256;
    }

}
