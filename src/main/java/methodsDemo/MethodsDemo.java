package methodsDemo;

public class MethodsDemo {

	void greetings1() {
		System.out.println("Hello World");
	}

	String greetings2() {

		return ("This is a great day");
	}

	String greetings4(String name) {
		return ("Hello, how are you doing " + name);
	}

	public static void main(String[] args) {

		MethodsDemo md = new MethodsDemo();
		md.greetings1();
		String str = md.greetings2();
		System.out.println(str);
		String salutation = md.greetings4("Eric");
		System.out.println(salutation);
	}

}
