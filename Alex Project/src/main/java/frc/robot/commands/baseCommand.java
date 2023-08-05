// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.base;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class baseCommands extends CommandBase{
    private base mainSubsys1; 
    private double lastRPM; //rpm

    public baseCommands(base subSys2){
        mainSubsys1 = subSys2; 
        addRequirements(mainSubsys1);
    }

    @Override
    public void initialize(){
        System.out.println("Base Command is Initialized")
        lastRPM = 5.0;
    }

    @Override
    public void execute(){
        System.out.println("Base Command is now running"); 
        lastRPM += 5;
        mainSubsys1.setSpeed(lastRPM);
    }

    @Override
    public void end(boolean interrupted){
        System.out.println("Base Command is now Over");
        lastRPM = 0.0; 
        if(interrupted){
            System.out.println("Base Command has been interrupted");
        }
    }

    @Override
    public boolean isFinished(){
        return lastRPM = 50;
    }

    @Override
    public string getName(){
        return "Base Command";
    }

    @Override
    public boolean runsWhenDisabled(){
        return true;
    }

}
