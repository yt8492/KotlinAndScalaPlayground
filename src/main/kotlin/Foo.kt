class Foo {
    @JvmOverloads
    fun baz(arg: String = "baz") {
        println(arg)
    }
}