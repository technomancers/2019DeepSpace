package edu.frc.technomancers.robot

import edu.wpi.first.wpilibj.Preferences

object RobotMap {
    private val pref = Preferences.getInstance()
    val LEFT_MOTOR_1: Int

    val RIGHT_MOTOR_1: Int

    val LEFT_MOTOR_2: Int

    val RIGHT_MOTOR_2: Int

    val CLAMP_MOTOR: Int

    val CLAMP_SPEED: Double
    init {
        LEFT_MOTOR_1 = pref.getInt("leftOne", 0)

        RIGHT_MOTOR_1 = pref.getInt("rightOne", 0)

        LEFT_MOTOR_2 = pref.getInt("leftTwo", 0)

        RIGHT_MOTOR_2 = pref.getInt("rightTwo", 0)

        CLAMP_MOTOR = pref.getInt("clampMotor", 0)

        CLAMP_SPEED = pref.getDouble("clampSpeed", 0.0)
    }
}