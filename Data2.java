//interface inheritace (with static methods) i.e interface can inherite the features of the derived interface..

interface A{
	void getData();
}
interface B extends A{
	void showData();
}
class Data2 implements B{
	static int rollno;
	static String name;
	public static void getData(){
		rollno=48;
		name="Shantanu";
		
	}
	public static void showData(){
		System.out.println("Name of the student is " + name + " whose rollno is "+ rollno);
	}
	public static void main(String args[]){
		
	getData();
    showData();
	}
}
	