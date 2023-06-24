import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {

		int[] arr2 = {1, 2, 3, 4, 5};

//		for (int i = 0; i < arr2.length; i++) {
//			if (arr2[i] % 2 == 0) {
//				System.out.println(arr2[i]);
//			} else {
//				System.out.println(arr2[i] + " is not multiple of 2");
//			}
//		}

		//Dynamical array list
		//ArrayList<String> - is a class
		//new ArrayList<String>() - is an object created, so that we can with "a" access that class methods
		ArrayList<String> a = new ArrayList<String>();
		a.add("Selenium");
		a.add("Java");
		a.add("Git");
		System.out.println(a.get(2));

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

		System.out.println("*************");

		for (String val :a) {
			System.out.println(val);
		}

		System.out.println(a.contains("Selenium"));

		//Normal array convert to arrayList
		String[] name = {"Selenium", "Java", "Git"};
		List<String> nameArrayList = Arrays.asList(name);
		nameArrayList.contains("Selenium");
	}
}
