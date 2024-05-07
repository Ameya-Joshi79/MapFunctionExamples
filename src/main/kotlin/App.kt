import grocerypackage.Grocery
import grocerypackage.Grocery2

fun main(args:Array<String>){

    val groceries2 = listOf(
        Grocery2("Tomatoes", "Vegetable", "1lb", 3.0, 3),
        Grocery2("Mushrooms", "Vegetable", "1lb", 4.0, 1),
        Grocery2("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery2("Olive Oil", "Pantry", "Bottle", 6.0, 1),
        Grocery2("Ice Cream", "Frozen", "Pack", 3.0, 2)
    )

    val intList = listOf<Int>(1, 2, 3, 4, 5)

    val timesTwoInts = intList.map { it * 2 }

    val stringInts = intList.map { it.toString() }

    println(stringInts[0])

    println(intList)

    println(timesTwoInts)

    /*
      Return a list of all items prices (Double) with price reduced to half.
     */
    val halfPriced = groceries2.map {
        it.unitPrice * 0.5
    }


    /*
        Return all Items that are of Category Vegetables and half price them. We're chaining the higher order functions.
        Note- filterNotNull returns a list of all items in a collection that are not null
     */

    val halfPricedVegetableItems = groceries2.map {

        var item:Grocery2? = null

        if (it.category == "Vegetable") {

            item = it.copy(unitPrice = it.unitPrice * 0.5)

        }

        item
    }.filterNotNull()

    println(halfPricedVegetableItems)

}