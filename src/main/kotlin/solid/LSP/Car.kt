package solid.LSP

class Car : EngineVehicle() {
    override fun getNumberOfWheels(): Int {
        return 4
    }
}