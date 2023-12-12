package methodsDemo;

public class EncapsulationDemo {

	private int accNo;
	private String name;
	private double balance;

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {

		EncapsulationDemo ed = new EncapsulationDemo();
		ed.setAccNo(1235789004);
		ed.setName("Saasta");
		ed.setBalance(199);

		System.out.println(ed.getAccNo());
		System.out.println(ed.getName());
		System.out.println(ed.getBalance());

	}

}
