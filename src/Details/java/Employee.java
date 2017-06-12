package Details.java;
public class Employee extends Person 
{	
	public Employee(String nm, String gen, String dept) {
		super(nm, gen, dept);
	}
	public static void main(String args[]){
		//coding in terms of abstract classes
		Person employee1 = new Employee("Puja","Female","Production");
		Person employee2 = new Employee("Pankaj","Male","Managment");
		Person employee3 = new Employee("Riya","Female","Human Resource");
		employee1.work();
		employee2.work();
		employee3.work();
		//using method implemented in abstract class - inheritance
		employee2.changeName("Pankaj Kumar");
		System.out.println(employee1.toString());
		System.out.println(employee2.toString());
		System.out.println(employee3.toString());
	}
	public void work()
	{
		
	}

}
