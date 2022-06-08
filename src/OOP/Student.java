package OOP;

import java.util.Scanner;

public class Student {
	int roll;
	String name;
	int phone;
	void get() {
		Scanner sc=new Scanner(System.in);
		roll=sc.nextInt();
		name=sc.next();
		phone =sc.nextInt();
		
	}
	void showHead() {
		
		System.out.println("roll  name  phone     ");
		}
	void show() {
		System.out.println(roll+" "+name+" "+phone);
	}
public static void main(String[] args) {
	Student s=new S;
}
}
