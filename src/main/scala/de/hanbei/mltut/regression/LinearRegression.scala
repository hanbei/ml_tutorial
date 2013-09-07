package de.hanbei.mltut.regression

/**
  */
class LinearRegression {

    var slope : Double = 0.0
    var intercept : Double = 0.0

    def train(input : List[Double], label : List[Double]) : Unit = {
        val xMean = mean(input)
        val yMean = mean(label)

        val denominator = input.zip(label).map({
            pair => (pair._1 - xMean) * (pair._2 - yMean)
        }).sum
        val numerator = input.map(x => Math.pow(x - xMean, 2)).sum

        slope = denominator / numerator
        intercept = yMean - xMean * slope
    }

    def mean(input : List[Double]) : Double = {
        input.sum / input.size
    }

    def test(input : Double) : Double = {
        input * slope + intercept
    }

}
