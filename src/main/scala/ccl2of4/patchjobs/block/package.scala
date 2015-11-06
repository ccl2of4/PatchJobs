package ccl2of4.patchjobs

import net.minecraft.block.Block._
import net.minecraft.block.{BlockPane, BlockGlass, Block}
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs

package object block {

  object BlockPatchJobBirchPlanks extends Block(Material.wood) with PatchJob {
    setCreativeTab(CreativeTabs.tabBlock)
    setHardness(2.0F)
    setResistance(5.0F)
    setStepSound(Block.soundTypeWood)
    setBlockName("patchJobBirchPlanks")
    setBlockTextureName("planks_birch")
    override val maxDamage = 10
  }

  object BlockPatchJobCobblestone extends Block(Material.rock) with PatchJob  {
    setHardness(2.0F)
    setResistance(10.0F)
    setStepSound(Block.soundTypePiston)
    setBlockName("patchJobCobblestone")
    setCreativeTab(CreativeTabs.tabBlock)
    setBlockTextureName("cobblestone")
    override val maxDamage = 10
  }

  object BlockPatchJobGlass extends BlockGlass(Material.glass, false) with PatchJob  {
    setCreativeTab(CreativeTabs.tabBlock)
    setHardness(0.3F)
    setStepSound(Block.soundTypeGlass)
    setBlockName("patchJobGlass")
    setBlockTextureName("glass")
    override val maxDamage = 5
  }

  object BlockPatchJobGlassPane extends BlockPane("glass", "glass_pane_top", Material.glass, false) with PatchJob  {
    setHardness(0.3F)
    setStepSound(soundTypeGlass)
    setBlockName("patchJobGlassPane")
    override val maxDamage = 2
  }

}
