package ccl2of4.patchjobs.block

import java.util.Random

import net.minecraft.block.Block.soundTypeGlass
import net.minecraft.block.BlockPane
import net.minecraft.block.material.Material
import net.minecraft.entity.Entity
import net.minecraft.world.World

object BlockPatchJobGlassPane extends BlockPane("glass", "glass_pane_top", Material.glass, false) with PatchJob {

  setHardness(0.3F)
  setStepSound(soundTypeGlass)
  setBlockName("patchJobGlassPane")

  override def maxDamage = 2

  override def quantityDropped(random : Random) =
    super[PatchJob].quantityDropped(random)

  override def onEntityCollidedWithBlock (worldObj : World, x : Int, y : Int, z : Int, entity : Entity) =
    super[PatchJob].onEntityCollidedWithBlock(worldObj, x, y, z, entity)

  override def onEntityWalking (worldObj : World, x : Int, y : Int, z : Int, entity : Entity) =
    super[PatchJob].onEntityWalking(worldObj, x, y, z, entity)

  override def createNewTileEntity(worldObj : World, i : Int) =
    super[PatchJob].createNewTileEntity(worldObj, i)

}
