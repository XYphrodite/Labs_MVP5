//2. Очередь. Пользователь последовательно вводит числа один за другим, которые складываются в массив.
// Если вводится не число – нужно вывести все числа по порядку их ввода (по очереди) и очистить очередь.

class queue() {
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
        while (s != 0) {
            println(l[0])
            l= l.drop(1).toTypedArray()
            s--
        }
    }
}

fun main() {
    var q = queue()
    var d: String
    while (true) {
        print("Введите число:\t")
        d = readLine().toString()
        q.add(d)
    }
}