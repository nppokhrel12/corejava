package corejava3pm.Looping;

public class EnhancedFor {
	
	//enhanced for loop
	//used to read data from collection
	//syntax
	//for(datatype var : collection){
    // statements
	//}
	//foreach
	public static void main(String[] args) {
		int data[]= {2,3,4,5,3,3,3,3,3,3,3,3,3,3,3,3,3,3 };
		for (int x:data) {
			System.out.println(x);
		}
	}
	

}
