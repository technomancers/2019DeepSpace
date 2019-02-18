package edu.frc.technomancers.robot.subsystems

import com.ctre.phoenix.motorcontrol.ControlMode
import com.ctre.phoenix.motorcontrol.can.TalonSRX
import edu.frc.technomancers.robot.RobotMap
import edu.frc.technomancers.robot.commands.WorkLift
import edu.wpi.first.wpilibj.command.Subsystem

class RobotLift: Subsystem(){
    private val robotLiftMotor = TalonSRX(RobotMap.PUSH_MOTOR)

    init {
    }

    override fun initDefaultCommand() {
        defaultCommand = WorkLift()
    }

    fun setPushSpeed(Speed: Double){
        robotLiftMotor.set(ControlMode.PercentOutput, Speed)
    }
}
