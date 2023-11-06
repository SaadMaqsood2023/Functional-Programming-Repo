package Lab2

object Exercise4 {
  def main(args : Array[String]): Unit = {
    // 11.2
    var ulist = List(1,2,3,4,5)

    // Map method applied to List
    val ulist_twice = ulist.map(x => x * 2)
    println(s"List elements double - $ulist_twice")

    //Applying map to List using user defined method
    def f(x: Int): Any = if (x > 2) x * x else None
//    var uList_Squared : List[_]= ulist.map(x -> f(x) )
    var uList_Squared : List[_]= ulist.map(f)      // wild card
    println(s"List elements squared selectively = $uList_Squared")

    // 11.3
    def g(v:Int) = List(v-1, v, v+1)
    val uList_Extended = ulist.map(g)
    println(s"Extended list using map - $uList_Extended")

    val uList_Extended_flatmap : List[_] = ulist.flatMap(g)  // wild card
    println(s"Extended list using flatmap - $uList_Extended_flatmap")
    println()

    // 11.4
    // Applying map flatMap to List with builtin Options class
    def f2(x: Int) = if (x > 2 ) Some(x) else None
    val uList_selective = ulist.map(f2)
    println(s"Select elements of list with .map - $uList_selective")

    val uList_selective_flatMap = ulist.flatMap(f2)
    println(s"Selective elements of List with .flatMap - $uList_selective_flatMap")
    println()

    // 11.5
    // An example Map using (key, value) pairs
    val uMap : Map[Char, Int] = Map('a' -> 2, 'b' -> 4, 'c'-> 6)

    // Applying .mapValues to Map
    val uMap_mapValues = uMap.mapValues(v => v * 2)
    println(s"Map values doubled using .mapValues - $uMap_mapValues")
    def h(k:Int , v: Int) = Some(k->v*2)

    // Applying .map to Map
    val uMap_map = uMap.map{
//      case (k,v) -> h(k,v)  wrong syntax
      case (k,v) => h(k,v)
    }
    println(s"Map values doubled using .map - $uMap_map")

    // Applying .flatMap to Map
    val uMap_flatMap = uMap.flatMap {
      case (k,v) => h(k,v)
    }
    println(s"Map values doubled using .flatMap - $uMap_flatMap")


  }

}
