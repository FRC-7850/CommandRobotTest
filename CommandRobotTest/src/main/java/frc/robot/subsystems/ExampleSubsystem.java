// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class ExampleSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */

  private SparkMax m_testMortor; 
  private commandXboxControllerDB m_joyStick; 

  public ExampleSubsystem(commandXboxControllerDB xboxController) {


    setDefaultCommand(joyStickSpeed());
    m_testMortor = new SparkMax(2, MotorType.kBrushless);
    m_joyStick = xboxController; 
  }

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public Command exampleMethodCommand(double speed) {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return run(
        () -> { runMotor(speed);
          /* one-time action goes here */
        });
  }

  public Command joyStickSpeed() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return run(
        () -> { runMotor(m_joyStick.getLeftX());
          /* one-time action goes here */
        });
  }


  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

private void runMotor (double speed) {
      m_testMortor.set(speed);
}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }


}
