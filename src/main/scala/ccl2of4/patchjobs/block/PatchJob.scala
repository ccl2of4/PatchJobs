package ccl2of4.patchjobs.block

import java.util.Random

import ccl2of4.patchjobs.tileentity.TileEntityPatchJob
import net.minecraft.block.material.Material
import net.minecraft.block.{Block, ITileEntityProvider}
import net.minecraft.entity.Entity
import net.minecraft.tileentity.TileEntity
import net.minecraft.world.World

trait PatchJob extends ITileEntityProvider { self : Block =>

  def maxDamage : Int

  override def quantityDropped(random : Random) = 0

  override def onEntityCollidedWithBlock (worldObj : World, x : Int, y : Int, z : Int, entity : Entity): Unit = {
    val tileEntity : TileEntityPatchJob = worldObj.getTileEntity(x, y, z).asInstanceOf[TileEntityPatchJob]
    tileEntity.onEntityCollidedWithBlock()
  }

  override def onEntityWalking (worldObj : World, x : Int, y : Int, z : Int, entity : Entity): Unit = {
    val tileEntity : TileEntityPatchJob = worldObj.getTileEntity(x, y, z).asInstanceOf[TileEntityPatchJob]
    tileEntity.onEntityWalking()
  }

  override def createNewTileEntity(p_149915_1_ : World, p_149915_2_ : Int): TileEntity = {
    val tileEntity = new TileEntityPatchJob
    tileEntity.maxDamage = maxDamage
    tileEntity
  }
}
