package arrays;

public class ObjectArr {

	public static void main(String[] args) {

		Object obj[] = new Object[5];
		obj[0] = 10;
		obj[1] = 10.5;
		obj[2] = "welcome";
		obj[3] = 'A';
		obj[4] = true;

		for (int i = 0; i < obj.length; i++) {
			System.out.print(obj[i] + "\t");
		}

		// Using enhanced for look

		for (Object x : obj) {
			System.out.println(x);
		}
	}

}
