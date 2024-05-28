package lambda_stuff

data class Car(
    val brand: String, val type: String,
    val milage: Int, val priceInLakh: Int,
)

fun main() {
    val carList: List<Car> = listOf(
        Car("tata", "suv", 15, 20),
        Car("mahindra", "suv", 16, 12),
        Car("tata", "sedan", 10, 25),
        Car("bmw", "sedan", 8, 50),
        Car("maruti", "mini", 25, 5)
    )
    /*MAX, MIN*/
    val maxMilage = carList.maxByOrNull { it.milage }
    println("maxMilage: ${maxMilage?.brand} = ${maxMilage?.milage}")

    /* SUMOF */
    val sumByPrice = carList.sumOf {        // calc sum of all ur Cars Prices
        it.priceInLakh
    }
    val sumByPriceAndMilage = carList.sumOf { // calc you 1st individual Car price*milage ... sum of all Cars
        it.priceInLakh * it.milage
    }
    println("sumByPriceAndMilage: $sumByPriceAndMilage ,sumByPrice: $sumByPrice ")

    /*FILTER*/
    val filterSuv =
        carList.filter { it.type == "suv" }                      // returns the Car obj meeting certain criteria
    println("filterSuv: $filterSuv")


    val filterGoodMilageCar = mutableListOf<Car>()
    carList.filterTo(filterGoodMilageCar) { it.milage >= 25 }           //  we create a new mutable list called filterGoodMilageCar to store the filtered elements from carList. We use filterTo to filter the elements from carList based on criteria
    println("filterSedan: $filterGoodMilageCar")


    val checkBrandTata = carList.filterIsInstance<Car>().filter { it.brand == "tata" }            //  we  use filterIsInstance<Car>() to filter only the elements that are of type Car from carList, and then we further filter those elements to get only the cars of type "tata"
    println("checkBrandTata: $checkBrandTata")

    /* map */
    val init = listOf(2, 5, 2, 6)
    val updatedList = init.map { it * 2 }
    println("updatedList: $updatedList")

    val carBrandList = carList.map { it.brand }
    println("carBrandList: $carBrandList")

    val updatedInflatedPrice = carList.map { it.priceInLakh * 1.10 }    // updated 10% inc
    println("updatedInflatedPrice: $updatedInflatedPrice")

    /* Chain the f() together */
    val expensiveCar = carList.filter { it.priceInLakh >=20 }
        .map { it.brand }.distinct()
    println("expensiveCar: $expensiveCar")

    /* for Each */
  carList.forEach {
      print("${it.brand},")
  }
    print("\nCheapCars: ")
   carList.filter { it.priceInLakh < 20 }
        .forEach { print("${it.brand}, ") }

    /* GroupBy */
    val groupByList = carList.groupBy { it.brand }
    println("groupByList: $groupByList")

                                                    // groupBy function uses the Car brand values for its keys, we can  print them by passing the code println(it.key)
    carList.groupBy { it.brand }
        .forEach { println("${it.key}")
        it.value.forEach { println("      ${it.type}") }            // value is the Obj of respective Car
        }

    /* Fold */
    val init2 = listOf(4, 5, 4, 6)
                                        // the 1st paramter is runnningSum initlized to 0
                                         // The 2nd lambda parameter, item, has the same type as the items in the collection  describes the operation that you want  to perform on the initial value for each item in the collection
    val sumOfInts = init2.fold(0){runnningSum, item ->
    runnningSum + item
}
println(sumOfInts)

}