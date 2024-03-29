package edu.frc.technomancers.robot.commands

import edu.frc.technomancers.robot.Operator
import edu.wpi.first.wpilibj.XboxController
import edu.wpi.first.wpilibj.GenericHID
import edu.frc.technomancers.robot.RobotMap


class DriveWithControl: CommandBase(){

    private var isFinished = false

    init {
        requires(driveTrain)
    }

    override fun initialize() {
    }

    override fun execute() {
        if(RobotMap.getDriveType() == RobotMap.DriveType.ARCADE ){
            driveTrain.arcadeDrive(Operator.drivingController.getY(GenericHID.Hand.kLeft), 
                Operator.drivingController.getX(GenericHID.Hand.kRight), true)
        }
        if(RobotMap.getDriveType() == RobotMap.DriveType.TANK ){
            driveTrain.tankDrive(Operator.drivingController.getY(GenericHID.Hand.kLeft), 
                Operator.drivingController.getY(GenericHID.Hand.kRight))
        }
    }

    override fun end(){
    }

    override fun interrupted() {
    }

    override fun isFinished(): Boolean {
        return isFinished
    }
}
