package de.hanbei.mltut.ann

import de.hanbei.mltut.ann.activityfunctions.sigmoid

class Layer(inputSize : Int, numNeurons : Int, function : Double => Double = sigmoid) {

  val neurons : List[Neuron] = List.fill(numNeurons)(new Neuron(function, inputSize))

}
