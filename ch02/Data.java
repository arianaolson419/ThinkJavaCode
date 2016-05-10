public class Data {
	public static void main(String[] args) {
		// initialize vars and assign values

		String day, month;
		int date, year;
		day = "Tuesday";
		date = 10;
		month = "May";
		year = 2016;

		// print the date in standard American format
		System.out.println("American format:");
		System.out.println(day + ", " + month + " " + date + ", " + year);

		//print the date in standard European format
		System.out.println("European format:");
		System.out.println(day + " " + date + " " + month + " " + year);
	}
}