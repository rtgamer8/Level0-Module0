/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
Robot ron =new Robot();

        // 3. Put the robot's pen down
ron.penDown();

        // 6. Make the robot move as fast as possible
ron.setSpeed(200);

        // 5. Do everything below here 4 times

for(int i=0; i<4; i++) {
        //         2. Move your robot 200 pixels
ron.move(200);

        //         4. Turn the robot 90 degrees to the right (90 degrees)

ron.turn(90);
}


    }
}
