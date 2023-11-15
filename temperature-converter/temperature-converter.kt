fun finalTemp(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement))
    println("$initialMeasurement degress $initialUnit is $finalMeasurement degrees $finalUnit.")
}

fun main() {
    finalTemp(
        initialMeasurement = 27.0,
        initialUnit = "Celcius",
        finalUnit = "Fahrenheit",
        conversionFormula = { (1.8 * it) + 32 }
    )

    finalTemp(
        initialMeasurement = 350.0,
        initialUnit = "Kelvin",
        finalUnit = "Celcius",
        conversionFormula = { it - 273.15 }
    )

    finalTemp(
        initialMeasurement = 10.0,
        initialUnit = "Fahrenheit",
        finalUnit = "Kelvin",
        conversionFormula = { 0.56 * (it - 32) + 273.15 }
    )
}