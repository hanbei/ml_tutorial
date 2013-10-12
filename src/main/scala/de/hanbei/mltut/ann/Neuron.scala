package de.hanbei.mltut.ann

import scala.Array

/**
  */
class Neuron(transferFunction : Double => Double, inputSize : Int) {

  var weights : Array[Double] = Array.fill(inputSize)(0.0)


  def compute(input : Seq[Double]) : Double = {
    transferFunction(input.zip(weights).map(x => x._1 * x._2).sum)
  }

}
