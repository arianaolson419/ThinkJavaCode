public class Date {
	public static void main(String[] args) {
		// initialize vars and assign values

		String day, month;
		int date, year;
		day = "Tuesday";
		date = 10;
		month = "May";
		year = 2016;

		// print the date in standard American format
		printAmerican(day, month, date, year);

		//print the date in standard European format
		printEuropean(day, date, month, year);
	}

	public static void printAmerican(String day, String month, int date, int year) {
		System.out.println("American format:");
		System.out.printf("%s, %s %d, %d\n", day, month, date, year);
	}

	public static void printEuropean(String day, int date, String month, int year) {
		System.out.println("European format:");
		System.out.printf("%s %d %s %d\n", day, date, month, year);		
	}
}