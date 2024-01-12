/* Polimorphism- 1)Ability to take more than one form  (types of polymorphism - 1. Compile time 2. Run time)..
   MethodOverloading - The method having the same name but can perform the different task thn that method is called as method overloading ..
   */

class Method
{
    int radius;
    double base , height;
    void Area(int r){
        radius = r;
        float A= 3.14f*radius*radius;
        System.out.println("Area of the circle is " + A);
	}
    void Area(double b, double h){
        base = b;
        height= h;
		double B= 0.5f *base*height;
		System.out.println("Area of the Triangle is " + B);
	}
    
	public static void main(String ar []){
		Method Obj = new Method();
		Obj.Area(10);
		Obj.Area(10,10);
	}
}