package ccl2of4.patchjobs.recipe

import ccl2of4.patchjobs.block.BlockPatchJobGlassPane
import net.minecraft.item.{Item, ItemStack}

object BlockPatchJobGlassPaneRecipe extends Recipe {

  override val output: ItemStack = {
    new ItemStack(BlockPatchJobGlassPane, 4)
  }

  override val input: Array[Object] = {
    val glassPanes = Item getItemById 102
    val sand = Item getItemById 12
    Array(
      Array(
        "SG",
        "GS"),
      Char.box('G'), glassPanes,
      Char.box('S'), sand)
  }

}
