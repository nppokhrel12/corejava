package corejava3pm;

import java.util.Scanner;

public class datatype {
	public static void main(String[] args) {
		int a=4;
		long x=8888899999l;
		float c=1.2f;
		System.out.println("byte="+Byte.SIZE+Byte.MIN_VALUE+Byte.MAX_VALUE);
		System.out.println("byte="+Integer.SIZE+Integer.MIN_VALUE+" "+Integer.MAX_VALUE);
		System.out.println("byte="+Float.SIZE+Float.MIN_VALUE+"    "+Float.MAX_VALUE);
		int g;
		Scanner s=new Scanner(System.in);
		g=s.nextInt();
		System.out.println("print" +g);
	}
}