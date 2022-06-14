package abstraction;

public abstract class CentralBank {
	
	protected abstract String getBankName();
	protected abstract int getInterestRate();
	
	public void displayMoneyExRate() {
		System.out.println("$1 = 110");
		System.out.println("yen 10 = 10");
		System.out.println("kdd 1= 16");
	}
}