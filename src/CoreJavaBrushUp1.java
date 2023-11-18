public class CoreJavaBrushUp1 {

	public static void main(String[] args) {

		int myNum = 5;
		String website = "Testing purposes";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;

		//Array
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;

		int[] arr2 = {1, 2, 3, 4, 5};

//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

		String[] name = {"Selenium", "Java", "Git"};

//		for (int i = 0; i < name.length; i++) {
//			System.out.println(name[i]);
//		}

		//Enhancement for loot syntax
		for (String s: name) {
			System.out.println(s);
		}
	}

}
