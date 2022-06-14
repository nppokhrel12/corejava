package OOP.Inheritance.MethodOverriding;

public class Test {
	public static void main(String[] args) {
		//static or early binding 
		PrabhuBank pb=new PrabhuBank();
		System.out.println(pb.getBankName()+"\n"+pb.getInterestRate());	
		//upcasting 
		CentralBank b=new GlobalBank();//child ko object laai parent maa rakhna milxa
		Test t=new Test();
		t.printBankInfo(b);
	}
	//dynamic or late binding of object
	//run time polymorphism 
	void printBankInfo(CentralBank b) {
		System.out.println(b.getBankName()+b.getInterestRate());
	}
}