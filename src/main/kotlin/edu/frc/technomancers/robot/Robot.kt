package edu.frc.technomancers.robot

import edu.wpi.first.wpilibj.TimedRobot
import edu.wpi.first.wpilibj.command.Scheduler
import edu.frc.technomancers.robot.commands.DriveWithControl

//CHANGE TO TimeBasedRobot
class Robot : TimedRobot() {
    override fun robotInit() {
        Scheduler.getInstance().add(DriveWithControl())
    }

    override fun robotPeriodic() {
    }

    override fun autonomousInit() {
    }

    override fun autonomousPeriodic() {
        Scheduler.getInstance().run()
    }

    override fun teleopInit() {
    }

    override fun teleopPeriodic() {
        Scheduler.getInstance().run()
    }
}
