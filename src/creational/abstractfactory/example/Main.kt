package creational.abstractfactory.example

fun main() {
    val factory = if (true) {
        VictorianFactory()
    } else {
        ModernFactory()
    }

    factory.createChair()
    factory.createTable()
}
