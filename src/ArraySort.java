import java.util.Arrays;
import java.util.Iterator;

public class ArraySort {
	

	public static void main(String[] args) {
		int[] data ={23,4,92,3,40,293,48,50,383};
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		for (int i = data.length-1; i >=0 ; i--) {
			System.out.println(data[i]);
			
		}
	}

}
