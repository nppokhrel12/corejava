package corejava3pm.Looping;

public class forTest {
	public static void main(String[] args) {
		int sum=0,sumodd=0,sumeven=0;
		
		for(int i=1;i<=100;i++) {
			System.out.print(i+",");
			sum+=i;
			if(i%2==0)
				sumodd+=i;
			else
				sumeven+=i;
	}
	System.out.println("sum= "+sum +"\n"+"sumodd= "+sumodd+"sumeven = "+sumeven);
	}

}
