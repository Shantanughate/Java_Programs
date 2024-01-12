/* use of this keyword- when the global variable and the local variable are same the there will a confusion in the interpreter so to solve this conflict "this" keywor is used */
class This 
{
    int l,b,h;//these are the global or instance variable- the variable which are stored in the data segment of the memory..
	 void Volume(int l, int b, int h )//these are the local variable- the variable which are stored in the stack in the memory..
	 {
		 this.h=h;
		 this.l=l;
		 this.b=b;
	 }
	 void Show()//method declaration..
	 {
		 int v=h*b*l;      //method defination..
		 System.out.println("volume is" +v);
	 }
}
class ThisD
{
	public static void main(String ar[])
	{
		This obj=new This();
		obj.Volume(2,2,2);
		obj.Show();
	}
}
	 
                        