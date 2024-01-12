class Swaping 
{ 
   public static void swap(int x, int y){     //method declaration
   System.out.println("value befor swapping : a:"+ x    + " "+   "b:" + y );   // method defination
    
	int c = x;    //how actully swapping done
	x=y;
	y=c;
	System.out.println("value after swapping : a:"+ x   +" "+   "b:" + y );
	
   }
   public static void main(String ar[]){
	   int a=10;
	   int b=20;
	   swap(a,b);  // swap method calling  or it can return as  swap(10,20)
   }
}