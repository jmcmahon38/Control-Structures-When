fun main(args: Array<String>) {
    var englishNum = 0
    var spanishNum = "x"
    var exit = false
    while (exit != true) {
        print("Enter a number 1-10 for the spanish spelling of the number\n")
        englishNum = readLine()!!.toInt()
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
        print("would you like to check another number y/n? \n")
        var answer: String? = readLine()
        if (answer?.lowercase() == "n"){
            exit = true
            println("Exiting now...")}
        else if (answer?.lowercase() == "y") {
            println("next number...")
        }
        else{
            println("That is not a valid answer")
            println("next number...")
        }

    }
}