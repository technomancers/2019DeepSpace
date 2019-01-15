package edu.frc.technomancers.robot.commands

import edu.frc.technomancers.robot.Operator
import edu.frc.technomancers.utilities.Controller

class DriveWithJoystick: CommandBase(){

    private var isFinished = false

    init {
        requires(driveTrain)
    }

    override fun initialize() {
    }

    override fun execute() {
    }

    override fun end(){
    }

    override fun interrupted() {
    }

    override fun isFinished(): Boolean {
        return isFinished
    }
}
