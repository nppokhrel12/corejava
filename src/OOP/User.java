package OOP;

public class User {
	
	//object sanga aaune bhayera instance variable bhanxa euta package ko aarko maa use garne import garne 
	//this current obj represents
	//object class bata sappai class harumaa instance jaanxa
	//import le aru class haru laai visible banaauxa 
	//using this keyword we can call instance instance variable , methods and constructor
	
	String username;
	String pass;
	void printUser() {
		System.out.println("username = "+username );
		System.out.println("pass = "+pass );
	}
	//1 default constructor 
	User(){
		username="root";
		pass="123";
	}
	
	// 2 parameterized constructor 
	User(String username,String pass){
		this.username=username;
		this.pass=pass;
		
	}
	public static void main(String[] args) {
		User u=new User();
		User uu=new User("nishan","hello");
		//if parameterized cons is present
		//then default cons by java is not called, we should create default one  
		Math.sqrt(0);
		// 
		u.printUser();
		uu.printUser();
		
	}
}
