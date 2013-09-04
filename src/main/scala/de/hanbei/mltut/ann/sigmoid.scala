package de.hanbei.mltut.ann

/**
 * Created with IntelliJ IDEA.
 * User: hanbei
 * Date: 9/4/13
 * Time: 9:59 PM
 * To change this template use File | Settings | File Templates.
 */
object sigmoid extends Function1[Double, Double] {

  def apply(value: Double): Double = 1 / (1 + Math.exp(value))

}
