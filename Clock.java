/****************************************
 *										*
 * This problem calculates the angle	*
 *  between the hour hand and the 		*
 *  minute hand given a specific time	*
 * 										*
 ***************************************/

//package clock;

import java.lang.Math;

public class Clock 
{
	public static void main(String[] args)
	{
		double time = 3.25;
		System.out.println("Angle when time is " + time + ": = " + getAngle(time));
	}
	
	public static double getAngle(double time)
	{
		int hour = (int)time;
		int total =  (int) (time * 100);
		int minutes = total - (hour * 100);
		double minHandMin = 6;
		double hourHandMin = 30;
		double angleMinHandFrom12 = minHandMin * minutes;
		double hourHandFrom12 = hourHandMin * hour;
		double hourSlightPerc;
		double hourSlightDeg;
		double hourFinal;
		double angleRet;
		
		if(hour == 12 && minutes > 0)
			hourHandFrom12 = 0;
		
		hourSlightPerc = (angleMinHandFrom12 / 360);
		hourSlightDeg = hourSlightPerc * 30;
		hourFinal = hourSlightDeg + hourHandFrom12;
	
		angleRet = Math.abs(angleMinHandFrom12 - hourFinal);
		
		return angleRet;
	}
}

