import java.io.*;
import java.util.*;

public class Time
{
	public static void main (String[] args)
	{
		int hour, minute, second, current_hour, current_minute, current_second, time_elapesed;
		hour = 14;
		minute = 54;
		second = 43;
		current_hour = 16;
		current_minute = 0;
		current_second = 52;
		
		int current_time_in_seconds = (hour * 60 + minute) * 60 + second;
		System.out.println("The current time since mindnight is " + current_time_in_seconds + ".");
		
		int time_remain_in_seconds = (24 * 60 * 60) - current_time_in_seconds;
		System.out.println("The remaining time in seconds is " + time_remain_in_seconds + ".");
		
		float percent_of_day = (float)((current_time_in_seconds*100)/(24*60*60));
		System.out.println("Percent of day is " + percent_of_day + ".");
		
		time_elapesed = (current_hour - hour)* 60 * 60 + (current_minute - minute) * 60 + (current_second - second);
		System.out.println("Time elapsed in seconds: " + time_elapesed + ".");
	}
}