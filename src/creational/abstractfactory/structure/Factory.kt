package creational.abstractfactory.structure

interface AbstractFactory {
    fun createProductA(): ProductA
    fun createProductB(): ProductB
}

class ConcreteFactory1 : AbstractFactory {
    override fun createProductA(): ProductA {
        return ConcreteProductA1()
    }

    override fun createProductB(): ProductB {
        return ConcreteProductB1()
    }
}

class ConcreteFactory2 : AbstractFactory {
    override fun createProductA(): ProductA {
        return ConcreteProductA2()
    }

    override fun createProductB(): ProductB {
        return ConcreteProductB2()
    }
}
