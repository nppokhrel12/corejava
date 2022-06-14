package OOP.Inheritance.MethodOverriding;

public class CentralBank {
	
	protected String getBankName() {
		return "Central Bank";
	}
	protected int getInterestRate() {
		return 0;
	}
	public void displayMoneyExRate() {
		System.out.println("$1 = 110");
		System.out.println("yen 10 = 10");
		System.out.println("kdd 1= 16");
	}
}