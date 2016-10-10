package sort

import org.scalatest.{FlatSpec, Matchers}

class SortingSpec extends FlatSpec with Matchers {

  "BubbleSort" should "to sort sequence" in {
    val list = Array(7, 5, 6, 9, 2, 3, 1, 8, 4)
    SortScalaImpl.bubbleSort(list) should contain inOrder(
      1, 2, 3, 4, 5, 6, 7, 8, 9
      )
  }
}
