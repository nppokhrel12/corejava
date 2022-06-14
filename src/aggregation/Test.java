package aggregation;

public class Test {
	public static void main(String[] args) {
		Car c=new Car();
		c.setColor("asdfd");
		c.setCompany("gdsdfg");
		c.setModel("rtwert");
		c.setPrice(1222);
		Employee emp=new Employee();
		emp.setCar(c);
		emp.setFname(null);
		emp.setId(0);
		emp.setLname(null);
		emp.setPost(null);
		emp.setSalary(0);
		
		System.out.println(emp.getFname()+emp.getId()+emp.getLname()+emp.getPost()+emp.getSalary()+emp.getCar()+emp.getSalary());
		System.out.println(emp.getCar().getColor()+emp.getCar().getCompany()+emp.getCar().getModel()+emp.getCar().getPrice()+emp.getCar().getClass());
	}

}
