//  1D i.e !dimensional Array in java
/* Syntax :  datatype Array_name[]=new datatype[];*/

class Array 
{
	public static void main(String ar[]){
		int a[]=new int[5]; //Array Declaration 
		a[0]=10;
		a[1]=20;
		a[2]=30;     		// Array Defination..
		a[3]=40;
		a[4]=50;
		int b=a.length;
		System.out.println(b);
		for (int i=0;i<b;i++){
			System.out.println(a[i]);
		}
	}
}