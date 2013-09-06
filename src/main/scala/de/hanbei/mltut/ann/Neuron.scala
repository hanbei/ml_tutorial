package de.hanbei.mltut.ann

import scala.Array

/**
 */
class Neuron(transferFunction : Double => Double, inputSize : Int) {

  var weights : Array[Double] = new Array[Double](inputSize)

  def compute(input : Array[Double]) : Double = {
    transferFunction(input.zip(weights).map(x => x._1 * x._2).sum)
  }

}
