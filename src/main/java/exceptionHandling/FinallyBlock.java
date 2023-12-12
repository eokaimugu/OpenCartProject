package exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		String s = null;

		try {
			System.out.println(s.length());
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Exception occured ...and handled");
		} finally {
			System.out.println("You have entered into finally block");
		}
		System.out.println("Program is completed...");
		System.out.println("Program is exited...");

	}
}