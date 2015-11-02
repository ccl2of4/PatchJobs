package ccl2of4.patchjobs.block

import java.util.Random

import net.minecraft.block.material.Material
import net.minecraft.block.{Block, BlockGlass}
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.entity.Entity
import net.minecraft.world.World

object BlockPatchJobGlass extends BlockGlass(Material.glass, false) with PatchJob {

  setCreativeTab(CreativeTabs.tabBlock)
  setHardness(0.3F)
  setStepSound(Block.soundTypeGlass)
  setBlockName("patchJobGlass")
  setBlockTextureName("glass")

  override def maxDamage = 5

  override def quantityDropped(random : Random) =
    super[PatchJob].quantityDropped(random)

  override def onEntityCollidedWithBlock (worldObj : World, x : Int, y : Int, z : Int, entity : Entity) =
    super[PatchJob].onEntityCollidedWithBlock(worldObj, x, y, z, entity)

  override def onEntityWalking (worldObj : World, x : Int, y : Int, z : Int, entity : Entity) =
    super[PatchJob].onEntityWalking(worldObj, x, y, z, entity)

  override def createNewTileEntity(worldObj : World, i : Int) =
    super[PatchJob].createNewTileEntity(worldObj, i)

}
