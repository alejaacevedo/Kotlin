package Examples

class InnerExample {
    private val bar: Int = 1

    class Nested{
        fun foo() = 2
    }

    inner class Inner{ // can access atributes of outer class
        fun foo() = bar

        val inner = this@InnerExample //val of type InnerExample
    }

}