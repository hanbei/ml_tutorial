package de.hanbei.mltut.cluster

/**
 *
 */
class KMeans[T](numClusters: Int) {

  def cluster(points: Seq[T], distance: (T, T) => Double): Set[Cluster] = {
    List[Cluster] clusters = initialize(points)
  }

}
