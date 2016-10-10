package sort

object SortScalaImpl {
  def bubbleSort(array: Array[Int]): Array[Int] = {
    var swap = true

    while (swap) {
      swap = false

      for (i <- 0 until array.length - 1) {
        if (array(i) > array(i + 1)) {
          val temp = array(i)
          array(i) = array(i + 1)
          array(i + 1) = temp
          swap = true
        }
      }
    }
    array
  }
}

