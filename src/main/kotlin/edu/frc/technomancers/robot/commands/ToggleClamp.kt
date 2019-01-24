package edu.frc.technomancers.robot.commands

import edu.frc.technomancers.robot.Operator
import edu.frc.technomancers.robot.RobotMap
import edu.wpi.first.wpilibj.XboxController
import edu.wpi.first.wpilibj.GenericHID

class ToggleClamp: CommandBase(){

    var finished = false

    init {
        requires(clamp)
    }

    override fun execute() {
        var speed = 0.0
        if(Operator.drivingController.getBumper(GenericHID.Hand.kRight)){
            speed += RobotMap.CLAMP_SPEED
        }
        if(Operator.drivingController.getBumper(GenericHID.Hand.kLeft)){
            speed -= RobotMap.CLAMP_SPEED
        }
        clamp.setSpeed(speed)
    }

    override fun isFinished(): Boolean {
        return finished
    }
}
