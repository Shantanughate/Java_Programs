//Method Overloading with static method 
class MethodOL{
	public static int Area(int l, int b){
		return l*b;
	}
	
	public static double Area(double b, double h){
		return 0.5F*b*h;
	}
	
	public static double Area(double r){
		return 3.14F*r*r;
	}
	
	public static void main(String ar[]){
		int AOR=Area(10,10);
		System.out.println("Area of rectangle is "  +AOR);
		 
		double AOT=Area(10,10);
		System.out.println("Area of Trinagle is "  +AOR);
		
		double AOC=Area(10); 
		System.out.println("Area of Circle is "  +AOC);
		
	}
}
		
		