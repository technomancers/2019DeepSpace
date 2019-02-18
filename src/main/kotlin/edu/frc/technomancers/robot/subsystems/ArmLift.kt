package edu.frc.technomancers.robot.subsystems

import com.ctre.phoenix.motorcontrol.ControlMode
import com.ctre.phoenix.motorcontrol.can.TalonSRX
import edu.frc.technomancers.robot.RobotMap
import edu.frc.technomancers.robot.commands.MovingArms
import edu.wpi.first.wpilibj.command.Subsystem

class ArmLift: Subsystem(){
    private val armLiftMotor = TalonSRX(RobotMap.LIFT_MOTOR)

    init {
    }

    override fun initDefaultCommand() {
        defaultCommand = MovingArms()
    }

    fun setLiftSpeed(Speed: Double){
        armLiftMotor.set(ControlMode.PercentOutput, Speed)
    }
}
