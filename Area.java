class Measure
{
  public static int area(int x, int y){
      int A= x*y;
	  return A;
	  
	 }
	public static float area(int z){
	  float A= 3.14f*z*z;
	  return A;
	  }
	  }
class Area
{
  public static void main(String args[]){
   Measure obj=new Measure();
   int Y=obj.area(5,3);
   float Z=obj.area(6);
   System.out.println("Area of Rectangle is " +Y);
   System.out.println("area of Circle is " +Z);
   }
   }