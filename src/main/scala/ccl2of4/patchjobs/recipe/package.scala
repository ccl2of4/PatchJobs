package ccl2of4.patchjobs

import ccl2of4.patchjobs.block.{BlockPatchJobBirchPlanks, BlockPatchJobGlass, BlockPatchJobGlassPane, BlockPatchJobCobblestone}
import net.minecraft.item.{Item, ItemStack}

package object recipe {

  object BlockPatchJobWoodRecipe extends Recipe {
    override val output: ItemStack = new ItemStack(BlockPatchJobBirchPlanks, 1)
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

  object BlockPatchJobCobblestoneRecipe extends Recipe {
    override val output: ItemStack = new ItemStack(BlockPatchJobCobblestone, 4)
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

  object BlockPatchJobGlassRecipe extends Recipe {
    override val output: ItemStack = new ItemStack(BlockPatchJobGlass, 1)
    override val input: Array[Object] = {
      val patchJobGlassPane = Item getItemFromBlock BlockPatchJobGlassPane
      Array(
        Array(
          "GG",
          "GG"),
        Char.box('G'), patchJobGlassPane)
    }
  }

  object BlockPatchJobGlassPaneRecipe extends Recipe {
    override val output: ItemStack = new ItemStack(BlockPatchJobGlassPane, 4)
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

}
