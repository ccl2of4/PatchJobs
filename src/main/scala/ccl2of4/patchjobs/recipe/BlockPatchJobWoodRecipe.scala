package ccl2of4.patchjobs.recipe

import ccl2of4.patchjobs.block.BlockPatchJobWood
import cpw.mods.fml.common.registry.GameRegistry
import net.minecraft.item.{ItemStack, Item}

object BlockPatchJobWoodRecipe extends Recipe {

  override val output: ItemStack = {
    new ItemStack(BlockPatchJobWood, 1)
  }

  override val input: Array[Object] = {
    val stick = Item getItemById 280
    Array(
      Array(
        "SS",
        "SS"
      ),
      Char.box('S'), stick)
  }

}
