class ArrayAddition{
	public static void main(String ar[]){
		int i,j;
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int b[][]={{1,2,3},{4,5,6},{7,8,9}};
		int c[][]=new int[3][3];
		for (i=0;i<3;i++){
			for (j=0;j<3;j++){
				c[i][j]=a[i][j]+b[i][j]; 				//Addition of two Array 3 by 3
			}
		}for (i=0;i<3;i++){
			for (j=0;j<3;j++){
 	          System.out.print(" "+c[i][j]);
			} System.out.println(" ");
		}
	}
}