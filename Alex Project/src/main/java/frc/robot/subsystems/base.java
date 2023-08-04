package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.baseConstants;

public class base extends SubsystemBase {
  private int motorId2 = baseConstants.moter_2_Id;
  private double speed; //rpm

    public base() {
        System.out.printf("Motor %s is being configured...", motorId2);
        speed = 0;
    }

    public void setSpeed(double rpm){
        System.out.printf("Speed is set to %s using %s", speed, motorId2);
        speed = rpm;
    }
    
    public void launcherPeriodic(){
    System.out.println("Base motor is configured and set to  correct speed");
    }
  }
