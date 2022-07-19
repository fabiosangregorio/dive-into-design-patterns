package creational.factorymethod.structure

interface Product {
    fun doStuff()
}

class ProductA : Product {
    override fun doStuff() {
        println("ProductA does stuff")
    }
}

class ProductB : Product {
    override fun doStuff() {
        println("ProductB does stuff")
    }
}
