package ccl2of4.patchjobs.block

import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs

object BlockPatchJobWood extends BlockPatchJob(Material.wood, 10) {
  setCreativeTab(CreativeTabs.tabBlock)
  setHardness(2.0F)
  setResistance(5.0F)
  setStepSound(Block.soundTypeWood)
  setBlockName("patchJobWood")
  setBlockTextureName("planks_birch")
}
