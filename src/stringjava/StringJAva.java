package stringjava;

public class StringJAva {

	
	public static void main(String[] args) {
	
		String phone="98655548335";
		//String regex="[0-9]+";//for only one 
		//String regex="[0-9]*";//for only one 
		//String regex="[0-9]{10}"; //for 10 only
		//String regex="[0-9]{3,10}"; //for 3 to 10 only
		//String regex="[0-9]+";
		//String regex="[9][0-9]+{9}";
		//String regex="[9][8][0-9]+{9}";
		String regex="[9]{1}[8]{1}[0-9]+{9}";
		
		System.out.println(phone.matches(regex));
	}
}
