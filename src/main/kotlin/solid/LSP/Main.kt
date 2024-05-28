package solid.LSP

fun main() {
/*
* LSP:  all the Child classes should be able to substitute the base class without breaking the code
* */
    nonLSP()   // here the base class contains f() which isn't req by the Bicycle therefore it's forced to return null (which may break certain part of client code)

    performLSP()   // sol: 1) put only generic f() in BASE class    2) use appropriate class hierarchy

}

fun nonLSP() {
    val vehicleList = mutableListOf<Vehicle2>()
    vehicleList.add(Motorcycle2())
    vehicleList.add(Car2())
    vehicleList.add(Bicycle2())

    for (vehicle in vehicleList) {
        println(vehicle.hasEngine())          // will throw run time NPE,,, return null (which shouldn't happen on 1st place)
    }
}

private fun performLSP() {
    val vehicleList = mutableListOf<Vehicle>()
    vehicleList.add(MotorCycle())
    vehicleList.add(Car())
    vehicleList.add(Bicycle())

    for (vehicle in vehicleList) {
        println(vehicle.getNumberOfWheels())
//        println(vehicle.startEngine())        // will show compile time error, the code will NOT break
        // will be able to access only those method in base class to which all subClass are exposed

    }
}