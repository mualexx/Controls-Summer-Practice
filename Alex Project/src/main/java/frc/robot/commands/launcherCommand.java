// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.launcher;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class launcherCommand extends CommandBase{
    private launcher mainSubSys; 
    private double lastAngle = 0.0; 

    public launcherCommand(launcher subSys1){
        mainSubSys = subSys1; 
        addRequirements(mainSubSys);
    }

    @Override
    public void initialize(){
        System.out.println("Launcher Command has started.");
        lastAngle = 5.0;
    }

    @Override
    public void execute(){
        System.out.println("Launcher Command Now running");
        lastAngle += 10; 
        mainSubSys.setAngle(lastAngle);
    }

    @Override
    public void end(boolean interrupted){
        System.out.println("Launcher Command is over");
        mainSubSys.setAngle(0.0);
        if(interrupted){
            System.out.println("Launcher Command has been interrupted");
        }
    }

    @Override
    public boolean isFinished(){ 
        return lastAngle >= 50.0; 
    }
    
    @Override
    public String getName(){ 
        return "Subsystem1 Command"; 
    }

    @Override
    public boolean runsWhenDisabled(){ 
        return true; 
    }

}
