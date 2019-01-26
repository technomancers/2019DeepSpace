package edu.frc.technomancers.robot.commands
import edu.frc.technomancers.robot.RobotMap
class ToggleCompressor: CommandBase() {
    private var finished: Boolean = false

    init {
        requires(compressor)
    }

    override fun execute() {
        if(RobotMap.TOGGLE_COMPRESSOR){
            compressor.toggleCompressor()
        }
    }

    override fun isFinished(): Boolean {
        return finished
    }

    override fun end() {
    }

    override fun interrupted() {
    }
}
