package de.hanbei.mltut.ann

/**
  */
object sigmoid extends Function1[Double, Double] {

    def apply(value : Double) : Double = 1 / (1 + Math.exp(value))

}
