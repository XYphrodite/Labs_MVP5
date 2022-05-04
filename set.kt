//Множества. Ввести перечень товаров 1 пользователя, потом для второго. Вывести:
//
//- общие товары пользователей
//- уникальные товары 1 пользователя
//- товары, которые есть у обоих пользователей.

fun showAll(l1: List<String>, l2: List<String>) {
    var l = mutableListOf<String>()
    for (i in l1) {
        l.add(i)
    }
    for (i in l2) {
        if (l1.contains(i)) {
            continue
        }
        l.add(i)
    }
    println("Общие товары пользователей")
    for (i in l) {
        println(i)
    }
}

fun showUnique1(l1: List<String>, l2: List<String>) {
    var l = mutableListOf<String>()
    for (i in l1) {
        if (l2.contains(i)) {
            continue
        }
        l.add(i)
    }
    println("Уникальные товары 1 пользователя")
    for (i in l) {
        println(i)
    }
}

fun showCommon(l1: List<String>, l2: List<String>) {
    var l = mutableListOf<String>()
    for (i in l1) {
        if (l2.contains(i)) {
            l.add(i)
        }
    }
    println("Товары, которые есть у обоих пользователей")
    for (i in l) {
        println(i)
    }
}

fun main() {
    var user1 = mutableListOf<String>()
    var user2 = mutableListOf<String>()
    var name: String
    while (true) {
        println("Введите fимя_товара для первого пользователя или sимя_товара для второго\nДля остановки введите 'S'")
        name = readln()
        if (name[0] == 'f') {
            name = name.drop(1)
            user1.add(name)
        } else if (name[0] == 's') {
            name = name.drop(1)
            user2.add(name)
        } else if (name == "S") {
            break
        }
    }
    showAll(user1, user2)
    showUnique1(user1, user2)
    showCommon(user1, user2)
}