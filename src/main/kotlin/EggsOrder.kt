/*
    Name        : Raihan Khalil Abdillah
    ID          : 30065695
    AT2 - Practical, Activity 5
    Eggs Order
*/

fun main(args: Array<String>){
    print("Please enter the number of eggs you required: ")
    val eggsNumber = readln().toInt()

    calculateTotalAmount(eggsNumber)



}
fun calculateTotalAmount(eggsNumber: Int){
    val dozenEggs: Int = eggsNumber / 12
    val singleEggs: Int = eggsNumber % 12
    val priceDozenEggs: Double = 7.25
    val priceSingleEggs: Double = 0.75

    val totalPriceDozen: Double = dozenEggs * priceDozenEggs
    val totalPriceSingle: Double = singleEggs * priceSingleEggs
    val totalPrice = totalPriceDozen + totalPriceSingle

    println("You ordered $eggsNumber eggs. That is $dozenEggs dozen eggs at $$priceDozenEggs per dozen and $singleEggs additional eggs at $$priceSingleEggs each for a total of $$totalPrice")
}