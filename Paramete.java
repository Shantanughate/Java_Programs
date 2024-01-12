//paramettric Constructor

class Paramete
{
	int base, height1;
	float width,height,depth;
	Paramete(float h,float w, float d){
		height = h;
		width = w;
		depth = d;
	}
	paramete(int b, int h1){
		height1 = h1;
		base = b;
	}
	void Volume(){
		float v=h*w*d;
		System.out.println("volume of the box " + v);
	}
	int Area(){
		return 0.5f*b*h1;
	}

	public static void main(String ar[]){
		Paramete obj1 = new Paramete(1.5,1.5,1.5);
		obj1.Volume();
		Paramete obj2 = new Paramete(1,1.0);
		float A = obj2.Area;
		System.out.println("Area of triangle " + A);
		
	}
}