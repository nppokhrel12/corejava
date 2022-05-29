package stringjava;

public class StringSpilit {

	public static void main(String[] args) {
		String s="over the past ear asdjf is very vey  asjdgj asnn ";
		String s1="java dev in very very nepal are vey smart";
		s1.split(" ");
		System.out.println(s1.split(" "));
		String [] words=s1.split("\\s");//regex     separate on basis of space
		/*
		 * [0-9] digit only
		 * [a-z] words in lower case
		 * [A-Z] words in upper case
		 * [a-zA-Z0-9] number + word
		 * [\\@\\&\\.\\_] 
		 */
		int count=0;
		for(String w:words) {
			if(w.compareTo("very")==0) {
				count++;
				
			}
			System.out.println(w);
		}
		System.out.println(count);
	}
}
