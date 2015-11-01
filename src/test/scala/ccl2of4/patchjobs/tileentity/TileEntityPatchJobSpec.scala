package ccl2of4.patchjobs.tileentity

import net.minecraft.nbt.NBTTagCompound
import net.minecraft.tileentity.TileEntity
import org.scalamock.scalatest._
import org.scalatest._

class TileEntityPatchJobSpec extends FlatSpec with Matchers with MockFactory {

  TileEntity.addMapping(classOf[TileEntityPatchJob], "TileEntityPatchJob")

  "TileEntityPatchJob" should "write maxDamage state to NBT" in {
    val tileEntity = new TileEntityPatchJob
    val nbt = new NBTTagCompound

    tileEntity.maxDamage = 10
    tileEntity.writeToNBT(nbt)

    nbt.getInteger("maxDamage") should be (10)
  }

  ignore should "write current state to NBT" in {
    val tileEntity = new TileEntityPatchJob
    val nbt = new NBTTagCompound

    tileEntity.maxDamage = 15
    tileEntity.onEntityCollidedWithBlock()
    tileEntity.writeToNBT(nbt)

    nbt.getInteger("damage") should be > 0
    nbt.getInteger("maxDamage") should be (15)
  }

  ignore should "take one damage for collisions" in {
    val tileEntity = new TileEntityPatchJob
    val nbt = new NBTTagCompound

    tileEntity.maxDamage = 15
    tileEntity.onEntityCollidedWithBlock()
    tileEntity.writeToNBT(nbt)

    nbt.getInteger("damage") should be (1)
  }

  ignore should "take one damage for walking" in {
    val tileEntity = new TileEntityPatchJob
    val nbt = new NBTTagCompound

    tileEntity.maxDamage = 15
    tileEntity.onEntityWalking()
    tileEntity.writeToNBT(nbt)

    nbt.getInteger("damage") should be (1)
  }

  ignore should "destroy after reaching max damage" in {
    val tileEntity = new TileEntityPatchJob
    val nbt = new NBTTagCompound

    tileEntity.maxDamage = 15
    tileEntity.setWorldObj(null)

    (0 to 14).foreach { i=>
      if (i % 2 == 0) {
        tileEntity.onEntityCollidedWithBlock()
      } else {
        tileEntity.onEntityWalking()
      }
    }
  }

}
