// Constructor Overloading with method returning the value

class Over1
{
	double height, width,depth;
	Over1(){
		height=10;
		width=10;
		depth=10;
	}
	Over1(double h, double w, double d){
		height = h;
		width = w; 
		depth = d;
	}
	Over1 (int a, int b, int c){
		height = a;
		width = b; 
		depth = c;
	}
	double Volume(){
		double 	v=height*width*depth;
		return v;
        
		
	}
	
	public static void main (String ar[]){
		Over1 A = new Over1();
        double	x=A.Volume();
		System.out.println("Volume of the Box is "  + x );
		Over1 B = new Over1(20,20,20);
	    double y = B.Volume();
		System.out.println("Volume of the Box is "  + y );
		Over1 C = new Over1(1.0,2.0,3.0);
		double z =C.Volume();
		System.out.println("Volume of the Box is "  + z );
	}
}