package Arrays;

import java.util.Scanner;

public class BooksPrice {

	public static void main(String[] args) {
		int total=0, bookPrice[]=new int[10];
		float avg;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<bookPrice.length;i++) {
			System.out.println("enter price of "+i+"book");
			bookPrice[i]=sc.nextInt();
			total+=bookPrice[i];
		}
		avg= (float)total/bookPrice.length;
		//string to int maa use parse aru bela use cast
		int i=0;
		for(int a:bookPrice) {
			System.out.println("book price "+i+"="+a);
		}
		System.out.println("avg: "+avg);
		System.out.println("total: "+total);
	}
}