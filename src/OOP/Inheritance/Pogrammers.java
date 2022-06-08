package OOP.Inheritance;

public class Pogrammers extends Employee {
	String PLanguage;
	String Pname;
	int bonus;
	@Override
	public String toString() {
		return "Pogrammers [PLanguage=" + PLanguage + ", Pname=" + Pname + ", bonus=" + bonus + ", id=" + id + ", name="
				+ name + ", address=" + address + ", salary=" + salary + ", company=" + company + ", age=" + age + "]";
	}
	public static void main(String[] args) {
		Pogrammers p=new Pogrammers();
		p.setName(null);
		p.setAddress(null);
		p.setAge(0);
		p.setCompany(null);
		p.setId(0);
		p.setSalary(0);
		p.PLanguage="java";
		p.Pname="nepal gov ";
		p.bonus=5000;
		System.out.println(p);	
		//super is used to access method and props of parent class
		//static bhitra use garna paaidaina super and this
	}
}