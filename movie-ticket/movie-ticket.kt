fun ticketPrice(age: Int, isMonday: Boolean): Int {

    var price: Int

    if (age <= 12) {
        price = 15
    } else if (age >= 13 && age <= 60) {
        if (isMonday) {
            price = 25
        } else {
            price = 30
        }
    } else if (age >= 61 && age <= 100) {
        price = 20
    } else {
        price = -1
    }

    return price
}

fun main() {
    val child = 5
    val adult = 28
    val senior = 87
    val vampire = 240

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
    println("The movie ticket price for a person aged $vampire is \$${ticketPrice(vampire, isMonday)}.")
}