package frc.Autons;

import java.util.List;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.trajectory.Trajectory;


public class Trajectories {
    public static Trajectory examplePath = generateTrajectory(
        List.of(
            new Pose2d(1.56, 5.59, Rotation2d.fromDegrees(180)),
            new Pose2d(2.87, 7, Rotation2d.fromDegrees(180)),
        2.0, 
        1.0, 
        0.0,
        0.0,
        true));

        public static Trajectory examplePath2 = generateTrajectory(
        List.of(
            new Pose2d(2.87, 7, Rotation2d.fromDegrees(180)),
            new Pose2d(1.74, 5.59, Rotation2d.fromDegrees(180)),
        2.0, 
        1.0, 
        0.0,
        0.0,
        true));

        public static Trajectory examplePath3 = generateTrajectory(
        List.of(
            new Pose2d(1.74, 5.59, Rotation2d.fromDegrees(180)),
            new Pose2d(2.87, 5.59, Rotation2d.fromDegrees(180)),
        2.0, 
        1.0, 
        0.0,
        0.0,
        true));

        public static Trajectory examplePath4 = generateTrajectory(
        List.of(
            new Pose2d(2.87, 5.59, Rotation2d.fromDegrees(180)),
            new Pose2d(1.56, 5.37, Rotation2d.fromDegrees(180)),
        2.0, 
        1.0, 
        0.0,
        0.0,
        true));

        public static Trajectory examplePath5 = generateTrajectory(
        List.of(
            new Pose2d(1.56, 5.37, Rotation2d.fromDegrees(180)),
            new Pose2d(6.23, 6.83, Rotation2d.fromDegrees(180)),
        2.0, 
        1.0, 
        0.0,
        0.0,
        true));

        public static Trajectory examplePath6 = generateTrajectory(
        List.of(
            new Pose2d(6.23, 6.83, Rotation2d.fromDegrees(180)),
            new Pose2d(6.08, 6.83, Rotation2d.fromDegrees(180)),
        2.0, 
        1.0, 
        0.0,
        0.0,
        true));

        public static Trajectory examplePath7 = generateTrajectory(
        List.of(
            new Pose2d(6.23, 6.83, Rotation2d.fromDegrees(180)),
            new Pose2d(5.22, 5.81, Rotation2d.fromDegrees(180)),
        2.0, 
        1.0, 
        0.0,
        0.0,
        true));

        public static Trajectory examplePath8 = generateTrajectory(
        List.of(
            new Pose2d(5.22, 5.81, Rotation2d.fromDegrees(180)),
            new Pose2d(1.94, 5.81, Rotation2d.fromDegrees(180)),
        2.0, 
        1.0, 
        0.0,
        0.0,
        true));
    
}
