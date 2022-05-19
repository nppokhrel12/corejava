package corejava3pm.Looping;

public class PrimeorNot {
	public static void main(String[] args) {
		int num=9,i,count=0;
		for(i=2;i<num;i++) {
			if(num%i==0)
				count++;
			
		}
		if(count>=1) {
			System.out.println("not prime");
		}
		else
			System.out.println("prime");
			
	}

}


