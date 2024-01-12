// method returning the value (Method Oveloading)


class Methods
{
    int radius;
    double base , height;
    float Area(int r){
        radius = r;
        float a= 3.14f*radius*radius;
		return a;
        
	}
    double Area(double b, double h){
        base = b;
        height= h;
		double c= 0.5f *base*height;
		return c;
		
	}
    
	public static void main(String ar []){
		Methods Obj = new Methods();
	    float A=Obj.Area(10);
		System.out.println("Area of the circle is " + A);
		double B= Obj.Area(10,10);
		System.out.println("Area of the Triangle is " + B);
	}
}