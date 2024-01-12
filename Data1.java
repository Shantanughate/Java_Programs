//interface inheritace i.e interface can inherite the features of the derived interface..

interface A{
	void getData();
}
interface B extends A{
	void showData();
}
class Data1 implements B{
	int rollno;
	String name;
	public void getData(){
		rollno=48;
		name="Shantanu";
		
	}
	public void showData(){
		System.out.println("Name of the student is " + name + " whose rollno is "+ rollno);
	}
	public static void main(String args[]){
		Data1 obj=new Data1();
		obj.getData();
		obj.showData();
	}
}
	