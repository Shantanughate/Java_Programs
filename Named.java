// Parametric Constructor

class Named
{
	int height,width,depth;
	Named (int h, int w, int d)						//Constructor Declaration 
	{
		height =h;    //Constructor Defination
		width =w;
		depth =d;
	}
	void Volume(){
	    int v= height*width*depth;
		System.out.println("Volume of the box is " + v);
	}


	public static void main(String ar[])
	{
		Named obj = new Named(10,10,10);
		obj.Volume();
	}
}