// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.Drivetrain;

public class DrivetrainTankDrive extends CommandBase {
  /** Creates a new DrivetrainTankDrive. */
  CommandXboxController controller;
  Drivetrain drivetrain;

  public DrivetrainTankDrive(Drivetrain drivetrain, CommandXboxController controller) {
    // Use addRequirements() here to declare subsystem dependencies.

    this.controller = controller;
    this.drivetrain = drivetrain;

    addRequirements(drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    /**
     * TODO 2: now in this command class we want to call the tankDrive method we wrote 
     * 
     * type drivetrain.tankDrive() 
     * 
     * we need to however pass in the requestedLeftSpeed and requestedRightSpeed parameters we defined earlier 
     * 
     * ABOVE where you wrote drivetrain.tankDrive()
     * define 1 double variable called "leftSpeed"
     * create 1 double variable called "rightSpeed"
     * 
     * you can now assign these values using leftSpeed = (something)
     * 
     * in our case we want to poll the value from the controller 
     * 
     * use controller.getLeftY()
     * and controller.getRightY() 
     * to assign values to the 2 variables you created. If you are unsure which joystick these 
     * controller methods map to on a real controller ask a lead to explain 
     * 
     * ----- Code Example: --------------------
     * double controllerXvalue;
     * 
     * controllerXvalue = controller.getRightX()
     * ----------------------------------------
     * 
     * once you have defined and given your 2 variables values, you can pass them to your tank drive method 
     * something similar to: drivetrain.tankDrive(leftSpeed, rightSpeed);
     * 
     * 
     * Once you have written your code it would be a good idea to look at the rest of the 
     * code in this class to try to gain a deeper understanding for whats going on. Its okay 
     * if you are unsure about what some things mean. 
     */
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    // TODO 5: following line should be uncommented to make sure the robot stops when the command ends
    // drivetrain.tankDrive(0.0, 0.0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
