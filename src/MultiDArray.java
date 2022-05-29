
public class MultiDArray {
	public static void main(String[] args) {
		/*
		 * multid array
		 * use to store data in row and column or matrix form
		 * syntax
		 * data_type array_name[]=new data_type[row-size][col-size];
		 * 
		 *     c0 c1
		 *   r0[][]
		 *   r1[][]
		 * 
		 * 
		 * write data in multi d array 
		 */
		int [][] data=new int[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				data[i][j]=50;
			}
		}
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(data[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		
	}

}
