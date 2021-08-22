package assignmentweek3.day1;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("Axis Bank Deposit");

	}

	public static void main(String[] args) {

		BankInfo bi = new BankInfo();
		bi.deposit();
		bi.fixed();
		bi.saving();

		AxisBank ab = new AxisBank();
		ab.deposit();
	}

}
