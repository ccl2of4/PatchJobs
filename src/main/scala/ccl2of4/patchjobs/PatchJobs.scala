package ccl2of4.patchjobs

import ccl2of4.patchjobs.recipe.{BlockPatchJobCobblestoneRecipe, BlockPatchJobGlassPaneRecipe, BlockPatchJobGlassRecipe, BlockPatchJobWoodRecipe}
import ccl2of4.patchjobs.block.{BlockPatchJobCobblestone, BlockPatchJobGlass, BlockPatchJobBirchPlanks, BlockPatchJobGlassPane}
import ccl2of4.patchjobs.tileentity.TileEntityPatchJob
import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.Mod.EventHandler
import cpw.mods.fml.common.event.FMLPreInitializationEvent
import cpw.mods.fml.common.registry.GameRegistry

@Mod(modid = "PatchJobs", name = "PatchJobs", version = "1.0.0", modLanguage = "scala")
object PatchJobs {

  @EventHandler
  def preInit(event: FMLPreInitializationEvent): Unit = {
    registerBlocks()
    registerTileEntities()
    addRecipes()
  }

  def registerBlocks(): Unit = {
    Array(

      BlockPatchJobGlass,
      BlockPatchJobBirchPlanks,
      BlockPatchJobGlassPane,
      BlockPatchJobCobblestone

    ).foreach { block =>
      GameRegistry.registerBlock(block, block.getUnlocalizedName)
    }
  }

  def registerTileEntities(): Unit = {
    GameRegistry.registerTileEntity(classOf[TileEntityPatchJob], "tileEntityPatchJob")
  }

  def addRecipes(): Unit = {
    Array(

      BlockPatchJobWoodRecipe,
      BlockPatchJobGlassRecipe,
      BlockPatchJobGlassPaneRecipe,
      BlockPatchJobCobblestoneRecipe

    ).foreach { recipe =>
      GameRegistry.addShapedRecipe(recipe.output, recipe.input : _* )
    }
  }

}
