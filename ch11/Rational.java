/**
* Represents a rational number as a ratio of two integers.
*/
public class Rational {
	
	private int numerator;
	private int denominator;

	/**
	* Construct a Rational object with default values.
	*/
	public Rational() {
		this.numerator = 0;
		this.denominator = 1;
	}

	/**
	* Construct a Rational object with given values.
	*/
	public Rational(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;

		if (this.denominator < 0) {
			this.numerator *= -1;
			this.denominator *= -1;
		}

		if (this.numerator < 0 &&
			this.denominator < 0) {
			this.numerator *= -1;
			this.denominator *= -1;
		}
	}

	/**
	* Return a String representation of the rational number.
	*/
	public String toString() {
		return String.format("%d/%d",
			numerator, denominator);
	}

	public int getNumerator() {
		return this.numerator;
	}

	public int getDenominator() {
		return this.denominator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	/**
	* Tests whether two rationals are equivalent.
	*/
	public boolean equals(Rational that) {
		return this.numerator == that.numerator
			&& this.denominator == that.denominator;
	}

	/**
	* Prints formatted rational
	*/
	public void printRational() {
		System.out.printf("%d/%d\n",
			this.numerator, this.denominator);
	}

	/**
	* Negates the rational
	*/
	public void negate() {
		this.numerator *= -1;
	}

	/**
	* Inverts the rational so that the numerator 
	* and the denominator values are swapped. 
	*/
	public void invert() {
		int temp = this.numerator;
		this.numerator = this.denominator;
		this.denominator = temp;

		if (this.denominator < 0) {
			this.numerator *= -1;
			this.denominator *= -1;
		}
	}

	/**
	* Returns the rational converted to a double.
	*/
	public double toDouble() {
		return (float) this.numerator 
			/ this.denominator;
	}

	/**
	* Reduces rational to its lowest terms and returns the result.
	*/
	public Rational reduce() {
		Rational res = new Rational();
		int a;
		int b;
		int temp;

		if (this.numerator < this.denominator) {
			a = this.numerator;
			b = this.denominator;
		}

		else {
			a = this.denominator;
			b = this.numerator;
		}

		// using the Euclidean algorithm
		while (b % a != 0) {
			temp = a;
			a = b % a;
			b = temp;
		}

		res.numerator = this.numerator/a;
		res.denominator = this.denominator/a;

		return res;
	}

	/**
	* Returns the sum of two rationals.
	*/
	public Rational add(Rational that) {
		// multiplys fractions to have common denominator.
		int n1 = this.numerator * that.denominator;
		int n2 = that.numerator * this.denominator;
		int d = this.denominator * that.denominator; // same denominator for both fractions
		Rational sum = new Rational (n1 + n2, d);

		//reduces for nice result.
		return sum.reduce();
	}

	public static void main(String[] args) {
		Rational rat = new Rational();
		Rational mouse = new Rational(3, -9);
		rat.setNumerator(5);
		rat.setDenominator(16);
		rat.printRational();
		System.out.println(mouse);
		mouse.toDouble();
		System.out.println(mouse.add(rat));
	}
}