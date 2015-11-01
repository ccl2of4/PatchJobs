package ccl2of4.patchjobs.tileentity

import net.minecraft.nbt.NBTTagCompound
import net.minecraft.tileentity.TileEntity

class TileEntityPatchJob extends TileEntity {

  def maxDamage_=(maxDamage : Int) = _maxDamage = maxDamage
  def maxDamage = _maxDamage

  def onEntityCollidedWithBlock(): Unit = incAndCheckDamage()
  def onEntityWalking(): Unit = incAndCheckDamage()

  override def writeToNBT(nbt : NBTTagCompound): Unit = {
    super.writeToNBT(nbt)
    nbt.setInteger("damage", damage)
    nbt.setInteger("maxDamage", maxDamage)
  }

  override def readFromNBT(nbt : NBTTagCompound): Unit = {
    super.readFromNBT(nbt)
    damage = nbt.getInteger("damage")
    maxDamage = nbt.getInteger("maxDamage")
  }

  override def canUpdate = false

  private def incAndCheckDamage(): Unit = {
    if (worldObj.isRemote) {
      return
    }

    damage += 1
    if (damage > maxDamage) {
      breakBlock()
    }
  }

  private def breakBlock(): Unit = {
    val x = xCoord
    val y = yCoord
    val z = zCoord

    val block = worldObj.getBlock(x, y, z)

    worldObj.setBlockToAir(x, y, z)
    worldObj.playSoundEffect(x + 0.5D, y + 0.5D, z + 0.5D, block.stepSound.getBreakSound, 1.0F, 1.0F)
  }

  private def damage_=(damage : Int) = _damage = damage
  private def damage = _damage

  private var _maxDamage : Int = 0
  private var _damage : Int = 0

}
