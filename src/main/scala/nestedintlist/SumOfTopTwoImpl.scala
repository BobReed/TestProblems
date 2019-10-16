package nestedintlist

object SumOfTopTwoImpl extends SumOfTopTwo {

  override def sumOfTopTwoValuesInList(input: List[List[Int]]): Int = {
    val top2 = input.flatten.sorted.takeRight(2)
    print("Top 2: " + top2)
    top2.sum
  }

}
