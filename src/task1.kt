fun main(){
    println("Введите камень/ножницы/бумага:\n")
    val BotAction = (1..3).random()
    var UserAction = readln().toString()

    extracted(UserAction, BotAction)
}

private fun extracted(UserAction: String, BotAction: Int) {
    when (UserAction) {
        "Ножницы", "НОЖНИЦЫ", "ножницы" -> {
            if (BotAction == 1)
                println("Компьютер выбрал камень, вы проиграли!")
            else if (BotAction == 2)
                println("Компьютер выбрал ножницы, ничья!")
            else
                println("Компьютер выбрал бумагу, вы выйграли!")
        }

        "Камень", "КАМЕНЬ", "камень" -> {
            if (BotAction == 2)
                println("Компьютер выйбрал ножницы, вы выйграли!")
            else if (BotAction == 1)
                println("Компьютер выбрал камень, ничья!")
            else
                println("Компьютер выбрал бумагу, вы проиграли!")
        }

        "Бумага", "БУМАГА", "бумага" -> {
            if (BotAction == 3)
                println("Комьютер выбрал бумагу, ничья!")
            else if (BotAction == 1)
                println("Компьютер выбрал камень, вы выиграли!")
            else
                println("Компьютер выбрал ножницы, вы проиграли!")
        }

        else -> {
            println("Неверный ввод!")
        }
    }
}