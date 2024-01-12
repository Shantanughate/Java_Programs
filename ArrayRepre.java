// 2D Array i.e Two Dimensional Array in java
/* Syntax - datatype arrayname[][]=new datatype[row_no/ values in row][column_no/ values in column] */
class ArrayRepre 
{
	public static void main(String ar[]){
		int a[][]={{10,20,30,40,50,60},{10,20,30,40,50,60}}; // Array Declaration 
		
		for (int i=0;i<6;i++){
			for (int j=0;j<6;j++){
			
			System.out.print(a[i][j] + "");
			}System.out.println("" );
		}
	}
}
