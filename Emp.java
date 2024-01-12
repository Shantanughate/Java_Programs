class Employee
{
   int emp_id;
   String name, dept;
   void show_details(){
      emp_id=111;
	  name="Shantanu";
	  dept="Computer";
	  System.out.println("The Employee's Id is " +emp_id);
      System.out.println("The Employee's name is " +name);
      System.out.println("The Employee's Department is " +dept); 
	   }
}
class Emp{
 public static void main(String ar[]){
   Employee obj= new Employee();
   obj.show_details();
   
 }
}
   
