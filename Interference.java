// interface is the collection of static constant and abstract method..
// it has only method signature not method body..
// it allow only public methods and variable..
// since java does not support the multiple inheritance in the case of class..by using an interface it can achieve multiple inheritance..
// Any class can extends only 1 class but can any class can implements infinite no of Interface.. 

interface Calculator {       // interface declaration
    void addition(int a, int b);   // method signature without method body..
	void subtraction(int a, int b);
	void multiply(int a, int b);
	void division(int a, int b);
	}
class Interference implements Calculator{      // Class implenting the interface..
	public void addition(int x, int y){       
		int z;
		z=x+y;
		System.out.println("Addition is:" + z);
	}
	public void subtraction(int x, int y){
		int z ;
		z= x-y;
		System.out.println("SUbtraction is:" + z);
	}
	public void multiply(int x, int y){
		int z ;
		z= x*y;
		System.out.println("Multiplictaion is:" + z);
	}
	public void division(int x, int y){
		int z ;
		z= x/y;
		System.out.println("Division is " +z);
		
	}
	public static void main(String args[]){
		Interference obj = new Interference();
		obj.addition(10,10);
		obj.subtraction(15,5);
		obj.multiply(5,5);
		obj.division(200,40);
	}
}
		
	
		