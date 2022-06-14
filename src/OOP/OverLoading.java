package OOP;

import java.util.Scanner;

public class OverLoading {
	void sum(int a,int b) {
		System.out.println(a+b); 
		
	}
	void sum(int a,int b, int c ) {
		System.out.println(a+b+c);
		
	}
	void sum(int a,double b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	OverLoading a=new OverLoading();
		a.sum(1,1);
		a.sum(1, 1.1);
		a.sum(1, 1, 1);
	}
}