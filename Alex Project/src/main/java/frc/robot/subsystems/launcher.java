package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.launcherConstants;

public class launcher extends SubsystemBase {
  
  private int motorId = launcherConstants.moter_1_Id;
  private double setDegrees; 

    public launcher(int id) {
      System.out.printf("Motor %s is being configured...", motorId);
      setDegrees = 0.0; 
    }

    public void setAngle(double degrees){
      System.out.printf("Motor %s set to %s deg", motorId, setDegrees);
      setDegrees = degrees; 
    }
    
    public void launcherPeriodic(){
      System.out.println("Launcher is configured and set to correct to degrees. Robot now running");
    }
  }
