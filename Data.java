// Implememnting multiple interfaces.. with abstract class 
interface A{   // first interface
	public abstract void getData();  // abstract methods in interface..
}
interface B{   // second interface
	public abstract void showData();	
}
abstract class Student implements A,B{
	int rollno;
	String name;
	public void getData(){
		rollno=48;
		name="Shantanu";
	}
	public void showData(){
		System.out.println("Name of the student is " + name + " whose rollno is "+ rollno);
	}
}
class Data extends Student {
   public static void main(String args[]){
	   Data obj= new Data();
	   obj.getData();
	   obj.showData();
   }
}

// Process of hiding the implementation details from the user and showing the fuctionality to the user..
/*Java Abstract classes and Java Abstract methods 
An abstract class is a class that is declared with an abstract keyword.
An abstract method is a method that is declared without implementation.
An abstract class may or may not have all abstract methods. Some of them can be concrete methods
A method-defined abstract must always be redefined in the subclass, thus making overriding compulsory or making the subclass itself abstract.
Any class that contains one or more abstract methods must also be declared with an abstract keyword.
There can be no object of an abstract class. That is, an abstract class can not be directly instantiated with the new operator.
An abstract class can have parameterized constructors and the default constructor is always present in an abstract class.

Algorithm to implement abstraction in Java
Determine the classes or interfaces that will be part of the abstraction.
Create an abstract class or interface that defines the common behaviors and properties of these classes.
Define abstract methods within the abstract class or interface that do not have any implementation details.
Implement concrete classes that extend the abstract class or implement the interface.
Override the abstract methods in the concrete classes to provide their specific implementations.
Use the concrete classes to implement the program logic.
*/
	   