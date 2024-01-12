/*Parametric Method : The method which contain the value as an argument then that method is called as parametric method..*/

class Parameter{
	 int height, length, bredth;//these are the global or instance variable- the variable which are stored in the data segment of the memory..
	 void Volume(int l, int b, int h /*these are the local variable- the variable which are stored in the stack in the memory..*/)
	 {
		 height=h;
		 length=l;
		 bredth=b;
	 }
	 void Show()//method declaration..
	 {
		 int v=height*length*bredth;      //method defination..
		
		 System.out.println("volume is" +v);
	 }
}
class Para{
	public static void main(String ar[]){
	Parameter obj=new Parameter();    // object creation..
	obj.Volume(2,3,5);                // calling method by object dott property..
	obj.Show();
	}
}
		 