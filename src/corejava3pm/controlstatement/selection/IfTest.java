package corejava3pm.controlstatement.selection;

import java.util.Scanner;

public class IfTest {
	/*
	 * used to check single condition
	 * syntax :
	 * if(condition){
	 *    //statements
	 * }
	 */
	public static void main(String[] args) {
//		int salary ;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter salary");
//		salary =sc.nextInt();
//		if (salary<30000) {
//			salary+=5000;
//		}
//		
//		System.out.println("total salary="+salary);
		int p,t,r;
		double i=0;
		Scanner sc=new Scanner(System.in);
		p=sc.nextInt();
		t=sc.nextInt();
		r=sc.nextInt();
		if(p!=0) {
		i=(p*t*r)/100;
		}
		System.out.println("interest = "+i);
	}
}