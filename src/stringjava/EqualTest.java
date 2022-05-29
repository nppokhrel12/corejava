package stringjava;

public class EqualTest {
	/*
	 * equals()
	 * eualsIgnoreCase()
	 * used to compare string 
	 */

	public static void main(String[] args) {
		String s1="nepal";
		String s2="india";
		String s3=new String("nepal");//string pool maa basdaina tesaile == le location eutai bhetdaina 
		System.out.println(s1.equals(s2));//string pool maa dui ota same values store garna mildaina ,duiota baneko jasto matra dekhinxa
		
		System.out.println(s1.equalsIgnoreCase(s2));//ob or value
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		String s5;
		//s5.getBytes();
		String s6=null;
		s6.getBytes();
		
	}
}

