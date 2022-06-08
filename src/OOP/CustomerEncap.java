package OOP;
//class with getter and setter is POJO(plain old java object ) or model or entity without any business logic
//
public class CustomerEncap {
	private int id,age;
	private String fname,lname,city;  //data hiding 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override //from object class
	public String toString() {
		return "CustomerEncap [id=" + id + ", age=" + age + ", fname=" + fname + ", lname=" + lname + ", city=" + city
				+ "]";
	}
	
	
	
	
	

}
