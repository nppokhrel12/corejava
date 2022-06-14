package OOP.Inheritance.MethodOverriding;

public class NepalBank extends CentralBank {
	@Override
	protected String getBankName() {
		// TODO Auto-generated method stub
		return "nepal ank ";
	}
	@Override
	protected int getInterestRate() {
		// TODO Auto-generated method stub
		return 32;
	}

}
