package ccl2of4.patchjobs.recipe

import net.minecraft.item.ItemStack

trait Recipe {

  def output : ItemStack
  def input : Array[Object]

}
