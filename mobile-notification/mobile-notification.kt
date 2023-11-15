fun notificationSummary(numberOfMessages: Int){
    if (numberOfMessages < 100) {
        println("You have $numberOfMessages notifications.")
    } else if (numberOfMessages >= 100) {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}

fun main() {
    val mornigNotification = 51
    val afternoonNotification = 0
    val eveningNotification = 135

    notificationSummary(mornigNotification)
    notificationSummary(afternoonNotification)
    notificationSummary(eveningNotification)
}