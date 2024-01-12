// linkedList Internally uses a doubly linkedList Data Structure and provide methods to work with it..
// Syntax : LinkedList<Data Type>name=new LinkedList<DataType>();
import java.util.LinkedList;
class LinkedLis{
	public static void main(String args[]){
		LinkedList<String> name = new LinkedList<String>();
		name.add("Shantanu");  // add Method : name.add();
		name.add("Nikhil");
		name.add("Shreyash");
		name.add("Piyush");
		System.out.println(name);
		name.addFirst("Sham");   // addFirst Method:  name.addFirst();
		name.addLast("Raghav");  // addLast Method : name.addLast();
		System.out.println(name);
		name.removeLast();   // removeLast Method : name.removeLast();
		name.removeFirst();   //removeFirst Method : name.removeFirst();
		System.out.println(name);
		
	}
}