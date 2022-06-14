package abstraction;

public class Test {
	public static void main(String[] args) {
		NabilBank nb=new NabilBank();
		nb.displayMoneyExRate();
		System.out.println(nb.getBankName()+nb.getInterestRate());
		
		UserServiceImpl us=new UserServiceImpl();
		us.addUser();
		us.deleteUser();
	}

}
