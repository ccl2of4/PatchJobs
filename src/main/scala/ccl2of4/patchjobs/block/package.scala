package ccl2of4.patchjobs

import net.minecraft.block.Block._
import net.minecraft.block._
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs._

package object block {

  object BlockPatchJobBirchPlanks extends Block(Material.wood) with PatchJob {
    setCreativeTab(tabBlock)
    setHardness(2.0F)
    setResistance(5.0F)
    setStepSound(soundTypeWood)
    setBlockName("patchJobBirchPlanks")
    setBlockTextureName("planks_birch")
    override val maxDamage = 15
  }

  object BlockPatchJobBirchSlab extends BlockSlab(false, Material.wood) with PatchJob {
    setCreativeTab(tabBlock)
    setHardness(2.0F)
    setResistance(5.0F)
    setStepSound(soundTypeWood)
    setBlockName("patchJobBirchSlab")
    setBlockTextureName("planks_birch")
    override val maxDamage = 15
    override def func_150002_b(p_150002_1_ : Int): String = "wooden_slab.birch"
  }

  object BlockPatchJobCobblestone extends Block(Material.rock) with PatchJob  {
    setCreativeTab(tabBlock)
    setHardness(2.0F)
    setResistance(10.0F)
    setStepSound(soundTypePiston)
    setBlockName("patchJobCobblestone")
    setBlockTextureName("cobblestone")
    override val maxDamage = 15
  }

  object BlockPatchJobGlass extends BlockGlass(Material.glass, false) with PatchJob  {
    setCreativeTab(tabBlock)
    setHardness(0.3F)
    setStepSound(soundTypeGlass)
    setBlockName("patchJobGlass")
    setBlockTextureName("glass")
    override val maxDamage = 8
  }

  object BlockPatchJobGlassPane extends BlockPane("glass", "glass_pane_top", Material.glass, false) with PatchJob  {
    setCreativeTab(tabDecorations)
    setHardness(0.3F)
    setStepSound(soundTypeGlass)
    setBlockName("patchJobGlassPane")
    override val maxDamage = 5
  }

}
