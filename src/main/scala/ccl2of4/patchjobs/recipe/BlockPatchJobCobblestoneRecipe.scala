package ccl2of4.patchjobs.recipe

import ccl2of4.patchjobs.block.BlockPatchJobCobblestone
import net.minecraft.item.{Item, ItemStack}

object BlockPatchJobCobblestoneRecipe extends Recipe {

  override val output: ItemStack = {
    new ItemStack(BlockPatchJobCobblestone, 4)
  }

  override val input: Array[Object] = {
    val cobblestone = Item getItemById 4
    val gravel = Item getItemById 13
    Array(
      Array(
        "GC",
        "CG"),
      Char.box('C'), cobblestone,
      Char.box('G'), gravel)
  }

}
