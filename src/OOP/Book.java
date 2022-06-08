package OOP;

public class Book {
	int id,price;
	String name,author;
	void printBookinfo() {
		System.out.println("id "+id+" price "+price+" name "+name+" author"+author);
	}
	public static void main(String[] args) {
		Book math=new Book();
		math.id=1;
		math.name="math";
		math.price=100;
		math.author="kjdfg";
		math.printBookinfo();
	}
	
}
//student employee , vehicle ,j pani 4 ota