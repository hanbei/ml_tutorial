package de.hanbei.mltut.knn

/**
 * https://en.wikipedia.org/wiki/K-d_tree
 */
class KDTree(left: KDTree, right: KDTree, pivot: Double) {

}

object KDTree {


  def apply(data: List[Array[Double]]) = {
    def build_kdtree(data: List[Array[Double]], depth: Int): KDTree = {

      if (data.isEmpty) {
        return null
      }

      val k = depth % data(0).size
      val data2 = data.sortWith(
        (x: Array[Double], y: Array[Double]) => x(data(k).size).compareTo(y(data(k).size)) < 0
      )
      val median = data2.size / 2

      val node = new KDTree(
        build_kdtree(data2 slice(0, median), depth + 1),
        build_kdtree(data2 slice(median + 1, data2.size), depth + 1),
        median)
      node
    }
    build_kdtree(data, 0)
  }

  /*

if not point_list:
return None

# Select axis based on depth so that axis cycles through all valid values
k = len(point_list[0]) # assumes all points have the same dimension                                                            bes
axis = depth % k

# Sort point list and choose median as pivot element
point_list.sort(key=lambda point: point[axis])
median = len(point_list) // 2 # choose median

# Create node and construct subtrees
node = Node()
node.location = point_list[median]
node.left_child = kdtree(point_list[:median], depth + 1)
node.right_child = kdtree(point_list[median + 1:], depth + 1)
return node
    */
}
