class Array2 
{
	public static void main(String ar[]){
		int r=4;
		int c=4;
		int i,j;
		
		int a[][]=new int[r][c]; // Array Declaration 
		int v=1;
		
		for (i=0;i<r;i++){
			for (j=0;j<c;j++){
				a[i][j]=v;
				v++;
			}
		}
			for (i=0;i<r;i++){
					for (j=0;j<c;j++){
						System.out.print(" "+ a[i][j] );
						
				}    System.out.println(" " );
				
			
			}
		}
}

