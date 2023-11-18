public class LargestNumberInArrayTests {

	public static void main(String[] args) {


		int[] numbers = {10, 15, 5, 20, 14, 18};

		int max = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("The largest number in the array is: " + max);
	}
}
