package edu.frc.technomancers.robot.commands

class ToggleCompressor: CommandBase() {
    private var finished: Boolean = false

    init {
        requires(compressor)
    }

    override fun execute() {
        compressor.toggleCompressor()
    }

    override fun isFinished(): Boolean {
        return finished
    }

    override fun end() {
    }

    override fun interrupted() {
    }
}
