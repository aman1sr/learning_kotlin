package solid.LSP

// without LSP case
open class Vehicle2 {
    open fun getNumberOfWheels(): Int {
        return 2
    }
    open fun hasEngine(): Boolean? {
        return true
    }
}
class Car2 : Vehicle2(){
    override fun getNumberOfWheels(): Int {
        return 4
    }
}
class Motorcycle2 : Vehicle2(){

}
class Bicycle2 : Vehicle2(){
    override fun hasEngine(): Boolean? {
        return null
    }
}

