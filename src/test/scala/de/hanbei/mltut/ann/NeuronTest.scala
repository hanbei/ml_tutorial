package de.hanbei.mltut.ann

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * Created with IntelliJ IDEA.
 * User: hanbei
 * Date: 9/4/13
 * Time: 8:50 PM
 * To change this template use File | Settings | File Templates.
 */
@RunWith(classOf[JUnitRunner])
class NeuronTest extends Neuron(x => x) with FunSuite with ShouldMatchers {

  var weights: Array[Double] = new Array(20).map(x => 1.0)

}
