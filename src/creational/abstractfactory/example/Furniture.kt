package creational.abstractfactory.example

enum class Material {
    WOOD, PLASTIC
}

sealed class Chair {
    abstract val material: Material
    abstract val legs: Int

    object VictorianChair : Chair() {
        override val material = Material.WOOD
        override val legs = 4
    }

    object ModernChair : Chair() {
        override val material = Material.PLASTIC
        override val legs = 3
    }
}

sealed class Table {
    abstract val bottomMaterial: Material
    abstract val topMaterial: Material

    object VictorianTable : Table() {
        override val bottomMaterial = Material.WOOD
        override val topMaterial = Material.WOOD
    }

    object ModernTable : Table() {
        override val bottomMaterial = Material.PLASTIC
        override val topMaterial = Material.WOOD
    }
}
