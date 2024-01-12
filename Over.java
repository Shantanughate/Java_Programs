// Constructor Overloading- The Constructor having the same name but can perform the different task then that constructor is called as Constructor Overload

class Over 
{
	double height, width,depth;
	Over(){
		height=10;
		width=10;
		depth=10;
	}
	Over(double h, double w, double d){
		height = h;
		width = w; 
		depth = d;
	}
	Over (int a, int b, int c){
		height = a;
		width = b; 
		depth = c;
	}
	void Volume(){
		double V=height*width*depth;
        System.out.println("Volume of the Box is "  + V);
		
	}
	
	public static void main (String ar[]){
		Over A = new Over();
        A.Volume();
		Over B = new Over(20,20,20);
		B.Volume();
		Over C = new Over (1.0,2.0,3.0);
		C.Volume();
	}
}