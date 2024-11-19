// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
  /** Creates a new Drivetrain. */

  // TODO 0: this code is pre-written to define the motors the robot will be using 
  // you don't need to change any of this code but you read it and try to figure out what it is doing 
  CANSparkMax leftSparkMax = new CANSparkMax(Constants.DrivetrainConstants.LEFT_SPARKMAX_ID, MotorType.kBrushless);
  CANSparkMax rightSparkMax = new CANSparkMax(Constants.DrivetrainConstants.RIGHT_SPARKMAX_ID, MotorType.kBrushless);

  MotorControllerGroup leftMotorGroup = new MotorControllerGroup(leftSparkMax);
  MotorControllerGroup rightMotorGroup = new MotorControllerGroup(rightSparkMax);

  DifferentialDrive differentialDrive = new DifferentialDrive(leftMotorGroup, rightMotorGroup);

  public Drivetrain() {
    leftSparkMax.setIdleMode(IdleMode.kBrake);
    rightSparkMax.setIdleMode(IdleMode.kBrake);

    leftSparkMax.burnFlash();
    rightSparkMax.burnFlash();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  /**
   * TODO 1: We will be writing a tank drive method. Tank drive is exactly what it sounds like,
   * it drives similar to how a tank drives. Each side is driven at a certain speed. To turn 
   * the speeds have to be different/opposite. To drive straight both sides must be at the same speed
   * (you can ask a lead to clarify what tank drive means if you are confused)
   */
  public void tankDrive(){
    // write the line: differentialDrive.tankDrive(leftSpeed, rightSpeed); 
    // to control the motors in a tank drive configuration 
    // (if you are unsure what the differentialDrive object is, it was defined earlier in this class. 
    // Ctrl + f to search for it and see where it comes from)
    
    // TIP: you can hover your cursor over the differentialDrive.tankDrive method and it will give you a description of what it does 
    // this is a good way to make sure you are calling the correct methods and didn't make syntax mistakes

    // we need some values for "leftSpeed" and "rightSpeed"
    // instead of hardcoding raw numbers, thus only ever driving the robot at 1 speed which cannot be changed,
    // we can get these values by creating parameters in our tankDrive method (line 47)
    // try adding the parameters,
    // Should look something like: public void tankDrive(double requestedLeftSpeed, double requestedRightSpeed)
    
    // and pass those parameter values to the differentialDrive.tankDrive method
    // should look something like: differentialDrive.tankDrive(requestedLeftSpeed, requestedRightSpeed);

    }
}
