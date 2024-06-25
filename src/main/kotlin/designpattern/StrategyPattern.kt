package designpattern

/*
* usecase of Strategy in Android : (https://g.co/gemini/share/61258f6161f5)
* youtube: (https://www.youtube.com/watch?v=u8DttUrXtEw&list=PL6W8uoQQ2c61X_9e6Net0WdYZidm7zooW&index=4)
*todo:  medium article : (https://medium.com/@basecs101/strategy-design-pattern-all-you-need-to-know-updated-2024-e8a8303bd49e)
*
* Advantage:
*   - use when building Parent  and Child having same functionality ,
*   - so to eleminate duplicate code & make code scalable
* */
fun main() {
    val vehicle1 = OffRoadVehicle()
    vehicle1.drive()

    val vehicle2 = AverageVehicle()
    vehicle2.drive()

}
open class Vehicle(val driverObj : DriveStrategy ){
    fun drive() {
        driverObj.drive()
    }
}

interface DriveStrategy{
    fun drive()
}
open class NormalDriveStrategy : DriveStrategy{
    override fun drive() {
        println("Normal driving capability")
    }
}
open class SportsDriveStrategy : DriveStrategy{
    override fun drive() {
        println("Sports driving capability")
    }
}
class OffRoadVehicle : Vehicle(SportsDriveStrategy()){

}
class AverageVehicle : Vehicle(NormalDriveStrategy()) {

}