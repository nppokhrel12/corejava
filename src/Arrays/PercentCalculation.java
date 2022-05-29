package Arrays;

import java.util.Scanner;

public class PercentCalculation {
	public static void main(String[] args) {
		int total=0, mark[]=new int[10];
		String subject[]={"math","science","hel","do","jo","ho","aa","d","df","fg"};
		float avg;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<mark.length;i++) {
			System.out.println("enter price of "+subject[i]+" : ");
			mark[i]=sc.nextInt();
			total+=mark[i];
		}
		avg= (float)total/mark.length;
	
		int i=0;
		for(int a:mark) {
			System.out.println("mark of  "+subject[i]+"="+a);
			i++;
		}
		System.out.println("avg: "+avg);
		System.out.println("percent= "+total/100*10);
		System.out.println("total: "+total);
	}

}

//string to int maa use parse aru bela use cast
