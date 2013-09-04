package de.hanbei.mltut.ann

import scala.Array

/**
  */
abstract class Neuron(transferFunction: Double => Double) {

  var weights: Array[Double]

  def compute(input: Array[Double]): Double = {
    transferFunction(input.zip(weights).map(x => x._1 * x._2).sum)
  }

}
