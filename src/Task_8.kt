fun main(args: Array<String>) {

//    Напишите программу для расчета дохода по вкладу. Пользователь вводит сумму вклада,
//    длительность вклада (количество месяцев) и ежемесячный процент по вкладу.
//    Программа выводит в консоль информацию по каждому месяцу отдельно.
//    Информация отображает: на сколько будет увеличиваться вклад в этом месяце и итоговую сумму вклада в данном месяце.

    println("Программа для расчета ежемесячного дохода по вкладам с капитализацией процентов")
    println("Введите сумму вклада:")
    var sum = readLine()
    var sumToDouble = sum!!.toDouble()

    println("Введите длительность вклада (количество месяцев):")
    var duration = readLine()
    var durationToInt = duration!!.toInt()

    println("Введите ежемесячный процент по вкладу:")
    var interest = readLine()
    var interestToDouble = interest!!.toDouble()

    println("================= Информация по вкладу: =================")
    var i = 0
    var increase = 0.0
    var result: Double = sumToDouble
    while (i < durationToInt) {
        i++
        increase = result * interestToDouble / 100
        result += increase
        println(
            "$i-й месяц. Вклад увеличится на ${
                String.format(
                    "%.2f",
                    increase
                )
            }. Итоговая сумма по истечению месяца - ${String.format("%.2f", result)}"
        )
    }

}