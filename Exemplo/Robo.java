package Exemplo;
import robocode.*;
import java.awt.Color;
//import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * Robo - a robot by (your name here)
 */
public class Robo extends Robot
{
	/**
	 * run: Robo's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		 setBodyColor(Color.black);
         setGunColor(Color.white);
         setRadarColor(Color.green); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(180);
			turnGunRight(90);
			turnRight(180);
			back(50);
			turnGunRight(90);
			
		
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
			double distancia = e.getDistance();
			
		
         if (distancia > 135) {
			 fire(3);
			 } else {
				 fire(1);
			 }
		 }
		

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		back(10);
		turnLeft(90);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(20);
	    turnLeft(90);
	}	
}
