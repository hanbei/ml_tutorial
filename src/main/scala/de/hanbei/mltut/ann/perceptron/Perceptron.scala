package de.hanbei.mltut.ann.perceptron

import de.hanbei.mltut.ann.Neuron

/**
  */
class Perceptron(inputSize : Int) extends Neuron(x => if (x >= 0.5) 1 else 0, inputSize + 1) {
  var learningRate : Double = 0.1

  override def compute(input : Seq[Double]) : Double = super.compute(List(1.0) ++ input)

  def train(data : Seq[Seq[Double]], labels : Seq[Int]) : Unit = {
    for (i <- 1 to 1000) {
      var errorCount = 0
      for ((dataPoint, label) <- data.zip(labels)) {

        val adjustedData = List(1.0) ++ dataPoint

        val currentOutput = compute(dataPoint)
        val error = label - currentOutput

        if (error != 0) {
          errorCount += 1
          val tmp_weights = weights.zipWithIndex.map(x => x._1 + learningRate * error * adjustedData(x._2))
          weights = tmp_weights
        }
      }
      if (errorCount == 0) {
        return
      }
    }
  }
}
