public class RecurseArrays {
	public static void main(String[] args) {
		int[] array = {1, 5, 6, 8, 2, 4, 5, 10};
		System.out.println(maxInRange(array, 0, 3));
		System.out.println(max(array));
	}

	public static int maxInRange(int[] array, int lowIndex, int highIndex) {
		if (lowIndex > highIndex) {
			return -1;
		}

		if (lowIndex == highIndex) {
			return array[highIndex];
		}

		else {
			int middleIndex = (highIndex - lowIndex)/2 + lowIndex;
			int a = maxInRange(array, lowIndex, middleIndex);
			int b = maxInRange(array, middleIndex + 1, highIndex);
			if (a > b) {
				return a;
			}

			else {
				return b;
			}
		}

	}

	public static int max(int[] array) {
		return maxInRange(array, 0, array.length - 1);
	}
}