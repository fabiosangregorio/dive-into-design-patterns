package creational.factorymethod.example

interface Button {
    fun render()
}

class WebButton(private val text: String) : Button {
    override fun render() {
        println("<button>$text</button>")
    }
}

class AndroidButton(private val text: String) : Button {
    override fun render() {
        println("<Button text=\"$text\"></Button>")
    }
}
