package nestedintlist

class SumOfTopTwoImplTest extends org.specs2.mutable.Specification {

  "The sum of the two largest values should" >> {
    "be 150" >> {
      val l1 = List(1,2,8)
      val l2 = List(50,4,10)
      val l3 = List(100,3,5)

      val res = SumOfTopTwoImpl.sumOfTopTwoValuesInList(List(l1,l2,l3))
      res must beEqualTo(150)
    }
    "be 15" >> {
      val l1 = List(1,2)
      val l2 = List(4,10)
      val l3 = List(3,5)

      val res = SumOfTopTwoImpl.sumOfTopTwoValuesInList(List(l1,l2,l3))
      res must beEqualTo(15)
    }
   }
}
