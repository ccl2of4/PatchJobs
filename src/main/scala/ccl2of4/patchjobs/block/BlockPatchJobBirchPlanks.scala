package ccl2of4.patchjobs.block

import java.util.Random

import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.entity.Entity
import net.minecraft.world.World

object BlockPatchJobBirchPlanks extends Block(Material.wood) with PatchJob {

  setCreativeTab(CreativeTabs.tabBlock)
  setHardness(2.0F)
  setResistance(5.0F)
  setStepSound(Block.soundTypeWood)
  setBlockName("patchJobBirchPlanks")
  setBlockTextureName("planks_birch")

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
