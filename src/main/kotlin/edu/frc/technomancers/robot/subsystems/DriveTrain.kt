package edu.frc.technomancers.robot.subsystems

import com.ctre.phoenix.motorcontrol.ControlMode
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX
import edu.frc.technomancers.robot.RobotMap
import edu.frc.technomancers.robot.commands.DriveWithControl
import edu.wpi.first.wpilibj.command.Subsystem
import edu.wpi.first.wpilibj.drive.DifferentialDrive
import edu.wpi.first.wpilibj.SpeedControllerGroup

class DriveTrain: Subsystem()
{
    private var leftMotorOne = WPI_TalonSRX(RobotMap.LEFT_MOTOR_1)
    private var rightMotorOne = WPI_TalonSRX(RobotMap.RIGHT_MOTOR_1)
    private var leftMotorTwo = WPI_TalonSRX(RobotMap.LEFT_MOTOR_2)
    private var rightMotorTwo = WPI_TalonSRX(RobotMap.RIGHT_MOTOR_2)

    private var leftMotors = SpeedControllerGroup(leftMotorOne, leftMotorTwo)
    private var rightMotors = SpeedControllerGroup(rightMotorOne, rightMotorTwo)

    private var diffDrive = DifferentialDrive(leftMotors, rightMotors)
    override fun initDefaultCommand() {
        defaultCommand = DriveWithControl()
    }

    fun tankDrive(left: Double, right: Double) {
        diffDrive.tankDrive(-1*left, -1*right)
    }
    fun arcadeDrive(x: Double, rot: Double, squareInputs: Boolean){
        diffDrive.arcadeDrive(-1*x, rot, squareInputs)
    }

}