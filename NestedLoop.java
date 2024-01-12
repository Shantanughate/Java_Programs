class NestedLoop
{ 
public static void main(String ar[]){
	for (int i= 0; i<=5; i++){      
		for (int j=0; j<=i; j++){    // inner loop indicate the how many star are there in the one line                
			System.out.print("*");
		}
		System.out.println();
	}
}
}