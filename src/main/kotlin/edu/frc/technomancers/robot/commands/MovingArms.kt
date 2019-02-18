package edu.frc.technomancers.robot.commands

import edu.frc.technomancers.robot.Operator
import edu.wpi.first.wpilibj.XboxController
import edu.wpi.first.wpilibj.GenericHID

class WorkLift: CommandBase(){
    private var isFinished = false
    init {
        requires(armLift)
    }

    override fun execute() {
        var speed = 0.0
        //Multiply by .5 to slow it down
        speed -= Operator.drivingController.getTriggerAxis(GenericHID.Hand.kLeft)
        speed += Operator.drivingController.getTriggerAxis(GenericHID.Hand.kRight)
        armLift.setLiftSpeed(speed)
    }

    override fun isFinished(): Boolean {
        return isFinished
    }
}
