package stringjava;

public class ImmutableTest {
	/*
	 * if we cannot change or modify original state or value of object at runtime it is immutable object/class
	 * eg: String , Integer, Float, Double etc...
	 * 
	 * StringBuffer,StringBuilder are mutable class,lists,
	 * 
	 * 
	 */
	public static void main(String[] args) {
		String s="hello";
		s.concat("rame");// illegal beause immutable
		StringBuffer sb=new StringBuffer("agdfg");
		sb.append("ram");
		System.out.println(sb);
	}
}
