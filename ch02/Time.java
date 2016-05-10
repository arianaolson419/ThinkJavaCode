public class Time {
	public static void main(String[] args) {
		// initialize vars and assign values
		int hour, minute, second;
		hour = 17; //24 hour time
		minute = 58;
		second = 30;

		//calculate and display number of seconds since midnight
		int minuteTotal = minute + hour * 60; 
		int secondTotal = second + minuteTotal * 60;

		System.out.println("It has been " + secondTotal + " seconds since midnight.");	
		
		// calculate and display seconds remaining in the day
		int secondsInDay = 86400;
		int remainingSeconds = secondsInDay - secondTotal;

		System.out.println("There are " + remainingSeconds + " seconds left in the day.");

		//calculate and display percentage of day passed
		double secondsInDayFloat = secondsInDay * 1.0; //needed for floating point division
		double percentage = 100 * (secondTotal / secondsInDayFloat);
		System.out.println(percentage + "% of the day has passed");

		// calculate and display the elapsed time since working on this program
		int hourNow, minuteNow, secondNow;
		hourNow = 18;
		minuteNow = 24;
		secondNow = 45;

		int minuteNowTotal = minuteNow + hourNow * 60;
		int secondNowTotal = secondNow + minuteNowTotal * 60;

		int secondDiff = secondNowTotal - secondTotal;

		System.out.println("It has been " + secondDiff + 
			" seconds since you started working");
	}
}