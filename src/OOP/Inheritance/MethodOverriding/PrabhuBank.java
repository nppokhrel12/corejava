package OOP.Inheritance.MethodOverriding;

public class PrabhuBank extends CentralBank{
	@Override
	protected String getBankName() {
		// TODO Auto-generated method stub
		return "prabhu bank ";
	}
	@Override
	protected int getInterestRate() {
		// TODO Auto-generated method stub
		return 20;
	}

}
