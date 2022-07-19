package creational.abstractfactory.example

interface FurnitureFactory {
    fun createChair() : Chair
    fun createTable() : Table
}

class VictorianFactory : FurnitureFactory {
    override fun createChair(): Chair {
        return Chair.VictorianChair
    }

    override fun createTable(): Table {
        return Table.VictorianTable
    }
}

class ModernFactory : FurnitureFactory {
    override fun createChair(): Chair {
        return Chair.ModernChair
    }

    override fun createTable(): Table {
        return Table.ModernTable
    }
}
