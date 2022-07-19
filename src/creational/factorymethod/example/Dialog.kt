package creational.factorymethod.example

open class Dialog {
    val buttons = mutableListOf<Button>()

    fun render() {
        buttons.forEach { button ->
            button.render()
        }
    }

    open fun createButton(text: String): Button {
        return when (CURRENT_PLATFORM) {
            "WEB" -> WebButton(text)
            "ANDROID" -> AndroidButton(text)
            else -> TODO()
        }
    }
}

class WebDialog : Dialog() {
    override fun createButton(text: String): WebButton {
        return WebButton(text)
    }
}

class AndroidDialog: Dialog() {
    override fun createButton(text: String): AndroidButton {
        return AndroidButton(text)
    }
}
