/* Constructor - 1) It is the Special method whose name is same as the class name 
				 2) It doesn't have any return type not even void , It has by default the name of class itself..
				 3) The main aim of the constructor is that to intilize the object..
				 */

class Name
{
	int h,w,d,v;
	Name()//Constructor Declaration 
	{
		h=10;     // Constructor Defination..
		w=10;
		d=10;
		v= 0;
	}
	void Volume(){
		v=h*w*d;
		System.out.println("Volume of the box is " + v);
	}


	public static void main(String ar[])
	{
		Name obj = new Name();
		obj.Volume();
	}
}