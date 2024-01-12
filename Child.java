//example of the inheritance with the interface i.e use of extends and implements by taking input from user..

import java.util.Scanner;
class Father{  // class declaration
	String name;     // Data Segments
	int age;
	Father(String n, int a){   // constructor signature
		name=n;               // Constructor body
		age=a;
	}
	void Show(){
		System.out.println("The name of the Person is " + name);
		System.out.println("The age of the Person is " + age);
	}
}

interface Tasking {  // interface creation or signature
	void task();        // method signature in inteface
} 

class Child extends Father implements Tasking{
	int salary;
	Child(String n, int a, int s){
		super (n,a);
		salary = s;
	}
	public void task(){
		System.out.println("Salary of the person is "+ salary);
		}

    public static void main(String args[]){
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name=scan.nextLine();
		
		System.out.println("Enter the age");
	    int age=scan.nextInt();
		
		System.out.println("Enter the Salary");
		int salary=scan.nextInt();
		
		Child obj= new Child(name,age,salary);
		obj.Show();    // method calling
		obj.task();
	}
	
}
		
