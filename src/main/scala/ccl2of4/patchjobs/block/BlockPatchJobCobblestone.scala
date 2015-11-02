package ccl2of4.patchjobs.block

import java.util.Random

import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.entity.Entity
import net.minecraft.world.World

object BlockPatchJobCobblestone extends Block(Material.rock) with PatchJob {

  setHardness(2.0F)
  setResistance(10.0F)
  setStepSound(Block.soundTypePiston)
  setBlockName("patchJobCobblestone")
  setCreativeTab(CreativeTabs.tabBlock)
  setBlockTextureName("cobblestone")

  override def maxDamage = 10

  override def quantityDropped(random : Random) =
    super[PatchJob].quantityDropped(random)

  override def onEntityCollidedWithBlock (worldObj : World, x : Int, y : Int, z : Int, entity : Entity) =
    super[PatchJob].onEntityCollidedWithBlock(worldObj, x, y, z, entity)

  override def onEntityWalking (worldObj : World, x : Int, y : Int, z : Int, entity : Entity) =
    super[PatchJob].onEntityWalking(worldObj, x, y, z, entity)

  override def createNewTileEntity(worldObj : World, i : Int) =
    super[PatchJob].createNewTileEntity(worldObj, i)

}
