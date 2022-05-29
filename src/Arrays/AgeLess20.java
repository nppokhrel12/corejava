package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AgeLess20 {
	public static void main(String[] args) {
		int age[]= {35,6,7,18,11,40,22,60};
		int less20[]=getAgeLessThan20(age);
		System.out.println(Arrays.toString(less20));
	}
	static int[] getAgeLessThan20(int age[]) {
		int count=0;
		for(int b=0;b<age.length;b++) {
			if(age[b]<20){
				count++;
			}
		}
		int ageless20[]=new int[count],i=0;
		for(int a:age) {
			if(a<20) {
				ageless20[i]=a;
				i++;
			}
		}
		return ageless20;
	}
}