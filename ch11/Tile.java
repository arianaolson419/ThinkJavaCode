public class Tile {
	/**
	*Represents Scrabble tiles
	*/

	private char letter;
	private int score;

	public Tile(char letter, int score) {
		this.letter = letter;
		this.score = score;
	}

	public String toString() {
		return String.format("\"%c\": %d points\n",
			this.letter, this.score);
	}

	public boolean equals(Tile that) {
		return this.letter == that.letter
			&& this.score == that.score;
	}

	public char getLetter() {
		return this.letter;
	}

	public int getScore() {
		return this.score;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public static void printTile(Tile t) {
		System.out.printf("\"%c\":%d points\n", t.letter, t.score);
	}

	public static void testTile() {
		Tile z = new Tile('Z', 10);
		printTile(z);
	}
}