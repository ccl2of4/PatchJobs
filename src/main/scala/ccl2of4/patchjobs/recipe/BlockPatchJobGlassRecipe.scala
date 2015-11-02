package ccl2of4.patchjobs.recipe

import ccl2of4.patchjobs.block.{BlockPatchJobGlassPane, BlockPatchJobGlass}
import cpw.mods.fml.common.registry.GameRegistry
import net.minecraft.item.{Item, ItemStack}

object BlockPatchJobGlassRecipe extends Recipe {

  override val output: ItemStack = {
    new ItemStack(BlockPatchJobGlass, 1)
  }

  override val input: Array[Object] = {
    val patchJobGlassPane = Item getItemFromBlock BlockPatchJobGlassPane
    Array(
      Array(
        "GG",
        "GG"),
      Char.box('G'), patchJobGlassPane)
  }
  
}
