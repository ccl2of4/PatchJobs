package ccl2of4.patchjobs

import ccl2of4.patchjobs.recipe.{BlockPatchJobGlassRecipe, BlockPatchJobWoodRecipe}
import ccl2of4.patchjobs.block.{BlockPatchJobGlass, BlockPatchJobWood}
import ccl2of4.patchjobs.tileentity.TileEntityPatchJob
import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.Mod.EventHandler
import cpw.mods.fml.common.event.FMLPreInitializationEvent
import cpw.mods.fml.common.registry.GameRegistry

@Mod(modid = "PatchJobs", name = "PatchJobs", version = "0.0.1", modLanguage = "scala")
object PatchJobs {

  @EventHandler
  def init(event: FMLPreInitializationEvent): Unit = {
    registerBlocks()
    registerTileEntities()
    addRecipes()
  }

  def registerBlocks(): Unit = {
    Array(BlockPatchJobGlass, BlockPatchJobWood).foreach { block =>
      GameRegistry.registerBlock(block, block.getUnlocalizedName)
    }
  }

  def registerTileEntities() : Unit = {
    GameRegistry.registerTileEntity(classOf[TileEntityPatchJob], "tileEntityPatchJob")
  }

  def addRecipes(): Unit = {
    Array(BlockPatchJobWoodRecipe, BlockPatchJobGlassRecipe).foreach { recipe =>
      println("PATCHJOBS", recipe.input)
      recipe.input.foreach { thing =>
        println("PATCHJOBS", thing)
      }
      GameRegistry.addShapedRecipe(recipe.output, recipe.input : _* )
    }
  }

}
