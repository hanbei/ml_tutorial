package de.hanbei.mltut.knn

/**
 * Created with IntelliJ IDEA.
 * User: hanbei
 * Date: 8/25/13
 * Time: 8:15 PM
 * To change this template use File | Settings | File Templates.
 */
class KnnSimple {

  var trainData: List[Array[Double]] = null

  def train(trainData : List[Array[Double]]) {
    this.trainData = trainData
  }

  def nearestNeighbour(k: Int, point: Array[Double]): List[Array[Double]] = {
    nearestNeighbour(k, point, (x, y) => Math.sqrt(x.zip(y).map(pair => (pair._1 - pair._2) * (pair._1 - pair._2)).sum))
  }

  def nearestNeighbour(k: Int, point: Array[Double], distance: (Array[Double], Array[Double]) => Double): List[Array[Double]] = {
    val sorted = trainData.sortBy(distance(point, _))
    sorted.slice(0, k)
  }
}
