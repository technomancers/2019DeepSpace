package edu.frc.technomancers.robot.subsystems

import com.ctre.phoenix.motorcontrol.ControlMode
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX
import edu.frc.technomancers.robot.RobotMap
import edu.wpi.first.wpilibj.command.Subsystem
import edu.frc.technomancers.robot.commands.ToggleClamp
class Clamp: Subsystem()
{
    private var clampMotor = WPI_TalonSRX(RobotMap.CLAMP_MOTOR)
    
    override fun initDefaultCommand() {
        defaultCommand = ToggleClamp()
    }

    fun setSpeed(speed: Double) {
        clampMotor.set(ControlMode.PercentOutput, speed)
    }

}