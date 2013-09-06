package de.hanbei.mltut.ann

/**
 * Created with IntelliJ IDEA.
 * User: hanbei
 * Date: 9/4/13
 * Time: 9:56 PM
 * To change this template use File | Settings | File Templates.
 */
object identity extends Function1[Double, Double] {

  def apply(value : Double) : Double = value

}

