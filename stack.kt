//3. Стек. Аналогично, вводятся числа, если введено не число, осуществить вывод,
// начиная с последнего введенного (в обратном порядке).
// Если введено не число – очистить стек и начать заново.

class stack() {
    private var l = emptyArray<Double>()
    fun add(s: String) {
        val maybeDouble = s.toDoubleOrNull()
        if (maybeDouble != null) {
            var d: Double = s.toDouble()
            l += d
        } else printArr()
    }

    private fun printArr() {
        var s: Int = l.size
        l.reverse()
        while (s != 0) {
            println(l[0])
            l= l.drop(1).toTypedArray()
            s--
        }
    }
}

fun main() {
    var s = stack()
    var d: String
    while (true) {
        print("Введите число:\t")
        d = readLine().toString()
        s.add(d)
    }
}