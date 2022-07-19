package creational.factorymethod.structure

open class Creator {
    fun someOperation() {
        println("Creator does someOperation")
    }

    open fun createProduct(id: Int): Product {
        return DEFAULT_PRODUCT
    }

    companion object {
        private val DEFAULT_PRODUCT = ProductA()
    }
}

class ConcreteCreatorA : Creator() {
    private val productsCache = mutableMapOf<Int, ProductA>()

    override fun createProduct(id: Int): Product {
        return productsCache.getOrElse(id) {
            val newProduct = ProductA()
            productsCache[id] = newProduct
            newProduct
        }
    }
}

class ConcreteCreatorB : Creator() {
    override fun createProduct(id: Int): Product {
        return ProductB()
    }
}
