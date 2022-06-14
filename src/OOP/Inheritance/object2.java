package OOP.Inheritance;

public class object2 {
	void compute(objet1 o){
		o.a=5;
		o.b=6;
		o.c=7;
		System.out.println(o.a+o.b+o.c);
	}
	public static void main(String[] args) {
	
		objet1 o=new objet1();
		object2 o1=new object2();
		o1.compute(o);
	}

}
