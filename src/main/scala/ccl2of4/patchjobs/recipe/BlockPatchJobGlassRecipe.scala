package ccl2of4.patchjobs.recipe

import ccl2of4.patchjobs.block.BlockPatchJobGlass
import cpw.mods.fml.common.registry.GameRegistry
import net.minecraft.item.{Item, ItemStack}

object BlockPatchJobGlassRecipe extends Recipe {

  override val output: ItemStack = {
    new ItemStack(BlockPatchJobGlass, 1)
  }

  override val input: Array[Object] = {
    val glassPanes = Item getItemById 102
    Array(
      Array(
        "GG",
        "GG"),
      Char.box('G'), glassPanes)
  }
  
}
