package edu.frc.technomancers.robot.subsystems

import edu.wpi.first.wpilibj.drive.DifferentialDrive
import edu.wpi.first.wpilibj.AnalogInput
import edu.frc.technomancers.robot.RobotMap
import edu.frc.technomancers.robot.commands.DriveWithJoystick
import edu.wpi.first.wpilibj.command.Subsystem
import org.apache.commons.math3.util.FastMath

class DriveTrain: Subsystem()
{


    init {
    }

    override fun initDefaultCommand() {
        defaultCommand = DriveWithJoystick()
    }


    fun letsDrive() {
        tankDrive(,)
    }
}
