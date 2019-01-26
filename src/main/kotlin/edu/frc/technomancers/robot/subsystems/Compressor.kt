package edu.frc.technomancers.robot.subsystems

import edu.wpi.first.wpilibj.command.Subsystem
import edu.wpi.first.wpilibj.Compressor

import edu.frc.technomancers.robot.RobotMap
import edu.frc.technomancers.robot.commands.ToggleCompressor


class Compressor: Subsystem() {
    var compressors = Compressor(RobotMap.COMPRESSOR_NODE_ID)
    
    init {
        compressors.closedLoopControl = false
    }
    override fun initDefaultCommand() {
        defaultCommand = ToggleCompressor()
    }

    fun toggleCompressor(){
        compressors.closedLoopControl = !compressors.pressureSwitchValue
    }
}
