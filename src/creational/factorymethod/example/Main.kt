package creational.factorymethod.example

fun main() {
    val dialog = when (CURRENT_PLATFORM) {
        "WEB" -> WebDialog()
        "ANDROID" -> AndroidDialog()
        else -> TODO()
    }

    val button = dialog.createButton("ciao")
    dialog.buttons.add(button)
    dialog.render()
}

const val CURRENT_PLATFORM = "ANDROID"
