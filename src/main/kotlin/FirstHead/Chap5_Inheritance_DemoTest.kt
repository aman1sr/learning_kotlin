package FirstHead

/*
*
* You can override a val property in the superclass with a var property in the subclass.
* Note that this only works one way; if you try to override a var property with a val,
* */
open class DemoInheritanceTest(){
    open val testVal: String = "abc"
    open val testVal2: String = "def"
    open var testVar: String = "xyz"
}

class DemoInheritanceTest2() : DemoInheritanceTest() {
    val innerProp = 22
    override val testVal: String = "inherit abc"
    override var testVal2: String = "inherit def"             // can change the ovveride val prop to var

    override var testVar: String = "inherit xyz"

    fun printStuff() {
        println("innerProp:$innerProp, testVal:$testVal,testVal2:$testVal2 testVar:$testVar ")
    }
}
    fun main() {
        val obj = DemoInheritanceTest2()
        obj.testVar = "again updated"
//        obj.testVal = "again updated"         //  can't update testVal because it's a val (immutable) property and cannot be reassigned once initialized.
        obj.testVal2 = "again updated"         // we can update this since subClass has redefine the prop as var

        obj.printStuff()
    }