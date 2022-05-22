package cn.claycoffee.ClayTech.implementation.machines;

import cn.claycoffee.ClayTech.ClayTechItems;
import cn.claycoffee.ClayTech.implementation.abstractMachines.ANewContainer;
import cn.claycoffee.ClayTech.utils.Lang;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.LockedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class FoodChalkingMachine extends ANewContainer {

    public FoodChalkingMachine(LockedItemGroup category, SlimefunItemStack item, String id, RecipeType recipeType,
                               ItemStack[] recipe) {
        super(category, item, id, recipeType, recipe);
    }

    @Override
    public String getInventoryTitle() {
        return Lang.readMachinesText("CLAY_FOOD_CHALKING_MACHINE");
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.REDSTONE_TORCH);
    }

    @Override
    public int getEnergyConsumption() {
        return 32;
    }

    @Override
    public int getCapacity() {
        return 512;
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @Override
    public String getMachineIdentifier() {
        return "CLAY_FOOD_CHALKING_MACHINE";
    }

    @Override
    public void registerDefaultRecipes() {
        this.registerRecipe(8, new ItemStack[]{ClayTechItems.RAW_TEA}, new ItemStack[]{ClayTechItems.TEA_POWDER});
        this.registerRecipe(8, new ItemStack[]{ClayTechItems.CLAY_LEMON},
                new ItemStack[]{ClayTechItems.LEMON_POWDER});
        this.registerRecipe(8, new ItemStack[]{new ItemStack(Material.CHICKEN)},
                new ItemStack[]{ClayTechItems.RAW_CHICKEN_FOOT});
    }
}
