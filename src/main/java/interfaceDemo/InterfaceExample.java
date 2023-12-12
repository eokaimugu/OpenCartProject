package interfaceDemo;

public class InterfaceExample {

	public static final String circle = null;

	interface Shapes {
		String name = circle;
		int length = 30;

		void triangle(); // abstract method unimplemented

		default void square() {
			System.out.println("Thie is a default method");
		}

		static void prism() {
			System.out.println("This is a prism");
		}
	}

	public static void main(String[] args) {

		InterfaceExample idem = new InterfaceExample();

	}

}
