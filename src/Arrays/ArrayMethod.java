package Arrays;

import java.util.Arrays;

public class ArrayMethod {
	public static void main(String[] args) {
		int odd[]=getOddFrom1To100();
		String c=Arrays.toString(odd);
		System.out.println(c);
		System.out.println(Arrays.toString(odd));
	}
	
	static int[] getOddFrom1To100() {
		int odd[]=new int[50];
		int oddCount=0;
		for(int i=0;i<100;i++) {
			if(i%2!=0) {
				odd[oddCount]=i;
				oddCount++;
			}
		}
		return odd;
	}
	

}
