package OOP;

public class TestEncap {
	public static void main(String[] args) {
		CustomerEncap c=new CustomerEncap();
		c.setAge(20);
		c.setCity("ktm");
		c.setFname("nishan");
		c.setId(111);
		c.setLname("pokhrel");
		System.out.println(c);//c.toString() gives same value as c
		System.out.println(c.getAge()+c.getCity()+c.getFname()+c.getId()+c.getLname());
		
	}

}
