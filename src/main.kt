fun main(args: Array<String>) {
    var englishNum = 3
    var spanishNum = "x"

    when (englishNum) {
        1 -> spanishNum = "uno"
        2 -> spanishNum = "dos"
        3 -> spanishNum = "tres"
        4 -> spanishNum = "quatro"
        5 -> spanishNum = "cinco"
        6 -> spanishNum = "seis"
        7 -> spanishNum = "siete"
        8 -> spanishNum = "ocho"
        9 -> spanishNum = "nueve"
        10 -> spanishNum = "diez"
        !in 1..10 -> spanishNum = "Out of Range"
        else -> spanishNum = "Unknown"
    }

    println("$englishNum es $spanishNum en español ")
}