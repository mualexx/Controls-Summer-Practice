// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public class Constants {
    public static class baseConstants {
        // units: degrees
        public static final double frontLeft_Offset = 4.0;
        public static final double frontRight_Offset = 8.0;
        public static final double rearLeft_Offset = 12.0;
        public static final double rearRight_Offset = 16.0;

        public static final double max_velo = 3.4; //(m/s)
        public static final double max_accel = 2.4; //(m/s^2)

        public static int moter_2_Id = 2; 
    }

    public static class launcherConstants {
        public static final double maxLauncherMoter_speed = 650; //rpm
        public static int moter_1_Id = 1;

    }
}
