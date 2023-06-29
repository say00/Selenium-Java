public class MethodsDemo {

	public static void main(String[] args) {

		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println(name);

		getData2();

		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getUserData();
	}

	public String getData() {

		System.out.println("Real World");
		return "Uncensored";
	}

	//If we mark this method as static we don't need to create object for that class
	public static String getData2() {

		System.out.println("Real World");
		return "Uncensored";
	}

}
