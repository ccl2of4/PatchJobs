package ccl2of4.patchjobs

import ccl2of4.patchjobs.block._
import net.minecraft.item.{Item, ItemStack}

package object recipe {

  object BlockPatchJobBirchPlanksRecipe extends Recipe {
    override val output: ItemStack = new ItemStack(BlockPatchJobBirchPlanks, 4)
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

  object BlockPatchJobBirchSlabRecipe extends Recipe {
    override val output: ItemStack = new ItemStack(BlockPatchJobBirchSlab, 6)
    override val input: Array[Object] = {
      val stick = Item getItemById 280
      Array(
        Array(
          "SSS"
        ),
        Char.box('S'), stick)
    }
  }

  object BlockPatchJobCobblestoneRecipe extends Recipe {
    override val output: ItemStack = new ItemStack(BlockPatchJobCobblestone, 8)
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
    override val output: ItemStack = new ItemStack(BlockPatchJobGlass, 8)
    override val input: Array[Object] = {
      val glass = Item getItemById 20
      val sand = Item getItemById 12
      Array(
        Array(
          "SG",
          "GS"),
        Char.box('G'), glass,
        Char.box('S'), sand)
    }
  }

  object BlockPatchJobGlassPaneRecipe extends Recipe {
    override val output: ItemStack = new ItemStack(BlockPatchJobGlassPane, 8)
    override val input: Array[Object] = {
      val glassPane = Item getItemById 102
      val sand = Item getItemById 12
      Array(
        Array(
          "SG",
          "GS"),
        Char.box('G'), glassPane,
        Char.box('S'), sand)
    }
  }

}
