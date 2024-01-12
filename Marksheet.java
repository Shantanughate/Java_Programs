class Student
{ 
  protected int rollno;
  protected String name;
  void get_data1(){
	  rollno=48;
	  name="Shantanu";
  }
  void show1(){
	  System.out.println("Roll no of the student is " + rollno);
	  System.out.println(" Name of the student is " + name);
  }
}
class Marks extends Student{
	protected int phy,chem,math;  /* if this variable are private then there will be error baecause If the varibale 
	                               and method are declared as private those can not be inherited into derived class..
								   other three i.r protected , public & default can be inherited into derived class */
	void get_data2(){
		phy=90;
		chem=90;
		math=90;
	}
	
}
class Marksheet extends Marks{
	int total_marks;
	double percentage;
	void show2(){
		total_marks=phy+chem+math;
		percentage=(total_marks*100)/300;
		System.out.println("Total marks of the students " + total_marks);
		System.out.println("Percentage of the student is " + percentage);
	}
     public static void main(String ar[]){
		 Marksheet obj= new Marksheet();
		 obj.get_data1();
		 obj.get_data2();
		 obj.show1();
		 obj.show2();
	 }
}
