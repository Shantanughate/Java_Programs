// method returning the value using the parametric constructor

class Return
{
	int height,width,depth;
	Return (int h, int w, int d)						//Constructor Declaration 
	{
		height =h;    //Constructor Defination
		width =w;
		depth =d;
	}
	int Volume(){
	    int a= height*width*depth;
		return a;
		
	}


	public static void main(String ar[])
	{
		Return obj = new Return(10,10,10);
		int v=obj.Volume();
		System.out.println("Volume of the box is " + v);
	}
}