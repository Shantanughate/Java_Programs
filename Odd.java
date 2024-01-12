class Odd
{
  public static void main(String ar[]){
	  
	  // do while loop for printing first 5 odd no..
	  int a = 1;
	  int b = 1;
	  do{
		  System.out.println(b);
		  b+=2;
		  a++;
	  }while(a<=5);  
	   
	   
	   // for loop printing the first 5 even no..
	  int j=0;
	  for (int i=1;i<=5;i++){
		  
		  j+=2;
		  System.out.println(j); 
	  }
	  
	  // while loop for printing the addition of 1 odd and 1 even no serialy upto 5  
	  int s=1;
	  int t=0;
	  int y = 1;
	  int x;
	  while(y<=5){
		  s+=2;
		  t+=2;
		  x=s+t;
		  System.out.println(x);
	      y++;
	  }
		  
		  
  }
}