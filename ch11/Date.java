/**
* Represents a date. 
*/
public class Date {

	private int year;
	private int month;
	private int day;

	/**
	* Construct a Date object with default values.
	*/
	public Date() {
		this.year = 2016;
		this.month = 1;
		this.day = 1;
	}

	/**
	* Construct a Date object with given values.
	*/
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	/**
	* Returns a String representation of the date.
	*/
	public String toString() {
		return String.format("%02d/%02d/%d",
			this.month, this.day, this.year);
	}

	/**
	* Tests whether two dates are equivalent.
	*/
	public boolean equals(Date that) {
		return this.year == that.year
			&& this.month == that.month
			&& this.day == that.day;
	}

	/**
	* Accessor of the year variable.
	*/
	public int getYear() {
		return this.year;
	}

	/**
	* Accessor of the month variable.
	*/
	public int getMonth() {
		return this.month;
	}

	/**
	* Accessor of the day variable.
	*/
	public int getDay() {
		return this.day;
	}

	/** 
	* Mutator of the year variable.
	*/
	public void setYear(int year) {
		this.year = year;
	}

	/** 
	* Mutator of the month variable.
	*/
	public void setMonth(int month) {
		this.month = month;
	}

	/** 
	* Mutator of the day variable.
	*/
	public void setDay(int day) {
		this.day = day;
	}

	public static void main(String[] args) {
		Date birthday = new Date(1996, 4, 19);
		System.out.println(birthday);
	}
}