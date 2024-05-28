package solid.LSP

open class EngineVehicle : Vehicle() {
    fun hasEngine(): Boolean {
        return true
    }
    open fun startEngine() {
        println("vromm vromm...")
    }

}