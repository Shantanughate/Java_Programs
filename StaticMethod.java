class StaticMethod
{   static void Add(){
    String y="My name is Shantanu Mukinda Ghate";
	System.out.println(y);
}   
    static int Area(int l, int b){   // Static parametric method returning the value
		return l*b;
	}
	
	int Show(){
		int h=3;
		int w=3;
		int d=3;
		return h*w*d;
	}
	public static void main(String ar[]){
		StaticMethod.Add();     // Static method calling  by Class_name.Method_name();
		Add();                  // Static method calling by method name itself;
		                        // Static method can be called by using method name itself or classname.method()
		
		int s=Area(5,5);  // Assigning & Calling The area method to get an output
		System.out.println(s);
		
		
		StaticMethod obj = new StaticMethod();  //object creation for non-Static method
		int VOB=obj.Show();                     //calling to the non static method
		System.out.println(VOB);                   
}
}
		/* Differemce between static and non- static is ..
		   Static  
		   - Static method called as 
		       method_name(); i.e method name itself or 
			   classa_name.Method_name();
		   
		   - Non Staic method called as
		       obj.method_name(); i.e object dot property
			   */