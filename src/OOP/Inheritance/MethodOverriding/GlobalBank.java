package OOP.Inheritance.MethodOverriding;

public class GlobalBank extends CentralBank{
	@Override
	protected int getInterestRate() {
		// TODO Auto-generated method stub
		return 15;
	}
	@Override
	protected String getBankName() {
		// TODO Auto-generated method stub
		return "global bank";
	}
}
