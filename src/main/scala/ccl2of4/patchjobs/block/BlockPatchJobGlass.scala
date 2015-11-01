package ccl2of4.patchjobs.block

import cpw.mods.fml.relauncher.{SideOnly, Side}
import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs

object BlockPatchJobGlass extends BlockPatchJob(Material.glass, 5) {
  setCreativeTab(CreativeTabs.tabBlock)
  setHardness(0.3F)
  setStepSound(Block.soundTypeGlass)
  setBlockName("patchJobGlass")
  setBlockTextureName("glass")

  @SideOnly(Side.CLIENT) override def getRenderBlockPass = 0
  override def renderAsNormalBlock = false
  override def isOpaqueCube = false
}
