import java.net.URL
import java.util.Scanner

fun main() {
    val amount = 100.0  // Сумма для конвертации
    val fromCurrency = "USD"  // Исходная валюта
    val toCurrency = "EUR"  // Валюта, в которую конвертируем

    val conversionResult = convertCurrency(amount, fromCurrency, toCurrency)
    if (conversionResult != null) {
        println("$amount $fromCurrency = ${conversionResult * amount} $toCurrency")
    } else {
        println("Конверсия не удалась.")
    }
}

fun convertCurrency(amount: Double, fromCurrency: String, toCurrency: String): Double? {
    val apiKey = "your_api_key_here"  // Замените на свой API ключ, если он необходим

    val url = "https://api.exchangerate-api.com/v4/latest/$fromCurrency"
    val scanner = Scanner(URL(url).openStream(), "UTF-8").useDelimiter("\\A")
    val responseString = if (scanner.hasNext()) scanner.next() else ""

    val json = responseString.replace(",", ",\n")
    val exchangeRates = json.substringAfter("\"rates\":{").substringBefore("}").split(",\n")

    for (rate in exchangeRates) {
        val rateSplit = rate.split(":")
        if (rateSplit[0].replace("\"", "") == toCurrency) {
            return rateSplit[1].toDouble()
        }
    }
    return null
}
