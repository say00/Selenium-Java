public class CoreJavaBrushUp3 {

	public static void main(String[] args) {

		String s = "Selenium Java Git";

		String[] splittedString = s.split("Java");
//		System.out.println(splittedString[0]);
//		System.out.println(splittedString[1]);
//		System.out.println(splittedString[1].trim());

		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

		//Reverse string order
		for (int i = s.length()-1; i >=0; i--) {
			System.out.println(s.charAt(i));
		}
	}

}
