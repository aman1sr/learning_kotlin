package FirstHead

interface IqualityCheck {
    fun doQualityCheck()
}

abstract class Battery : IqualityCheck {
    private val capacity: Int = 100
    open val effectiveness: String = "0"
    open val pins: Int = 2
    abstract val material: String

    override fun doQualityCheck() {
        println("doing Battery Quality ")
    }
}

abstract class OperatingSystem : Battery() {
    val os = "Android"
    override val effectiveness: String = "80"
    abstract val gui: String
    override fun doQualityCheck() {
        println("doing OperatingSystem Quality ")
    }
}

class MobilePhone : OperatingSystem() {
    override val gui: String = "Material Design"
    override val material: String = "A1 material"
    override val effectiveness: String = "300"
    override fun doQualityCheck() {
        println("doing MobilePhone Quality ")
    }

    fun getOsQualityCheck() = super.doQualityCheck()
    fun startBoot() {
        println("starting PHone : with gui:$gui,material: $material, effectiveness:$effectiveness  ")
    }


}

fun main() {
    val mobile = MobilePhone()
    mobile.startBoot()
    mobile.doQualityCheck()
//    val os = (mobile as OperatingSystem)            // NOT working
//    os.doQualityCheck()
    mobile.getOsQualityCheck()


}