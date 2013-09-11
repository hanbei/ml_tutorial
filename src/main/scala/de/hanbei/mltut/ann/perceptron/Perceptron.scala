package de.hanbei.mltut.ann.perceptron

import de.hanbei.mltut.ann.Neuron

/**
  */
class Perceptron(inputSize : Int) extends Neuron(x => if (x >= 0) 1 else 0, inputSize + 1) {

}

object Perceptron {

  def train(data : Seq[Seq[Double]], labels : Seq[Int]) = {
    val inputSize = data(0) size
    val perceptron = new Perceptron(inputSize)
    perceptron.weights = Array.fill(inputSize + 1)(1)

    for ((dataPoint, label) <- data.zip(labels)) {
      val current = perceptron compute (dataPoint)
      if (current != label) {
        perceptron.weights = perceptron.weights.zipWithIndex.map(x => x._1 + (label - current) * dataPoint(x._2))
      }
    }
  }

}
