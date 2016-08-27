package ccl2of4.patchjobs

import ccl2of4.patchjobs.block._
import ccl2of4.patchjobs.recipe._
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
      BlockPatchJobBirchPlanks,
      BlockPatchJobBirchSlab,
      BlockPatchJobCobblestone,
      BlockPatchJobGlass,
      BlockPatchJobGlassPane
    ).foreach { block =>
      GameRegistry.registerBlock(block, block.getUnlocalizedName)
    }
  }

  def registerTileEntities(): Unit = {
    GameRegistry.registerTileEntity(classOf[TileEntityPatchJob], "tileEntityPatchJob")
  }

  def addRecipes(): Unit = {
    Array(
      BlockPatchJobBirchPlanksRecipe,
      BlockPatchJobBirchSlabRecipe,
      BlockPatchJobCobblestoneRecipe,
      BlockPatchJobGlassRecipe,
      BlockPatchJobGlassPaneRecipe
    ).foreach { recipe =>
      GameRegistry.addShapedRecipe(recipe.output, recipe.input : _* )
    }
  }

}
