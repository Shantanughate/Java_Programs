// Arraylist is resizable array with many usefull methods to work with..
// Sysntax: ArrayList<DataType> Array_name=new ArrayList<DataType>();
import java.util.ArrayList;
class ArrayLis{
	public static void main(String args[]){
		ArrayList<String> color=new ArrayList<String>();
		color.add("Red");   //Add Method :  Array_name.add();
		color.add("Orange");
		color.add("yellow");
		color.add("Blue");
		System.out.println(color);
		String A=color.get(0);   // get Method : Array_name.get();
		System.out.println(A);
		color.set(0,"Opel");     //set or replace Method : Array_name.set(index,""); or  Array_name.replace(index,"");
		System.out.println(color);
		color.remove(1);       // remove Method : Array_name.remove(index);
		System.out.println(color);
		
		
		
	}
}
		