package Details.java;
//abstract class
public abstract class Person {
	
	private String name;
	private String gender;
	private String department;
	
	public Person(String nm, String gen, String dept){
		this.name=nm;
		this.gender=gen;
		this.department=dept;
	}
	
	//abstract method
	public abstract void work();
//use of override
	public String toString(){
		return "Emp Name="+this.name+"::Gender="+this.gender+"::Emp Department="+this.department;
	}

	public void changeName(String newName) {
		this.name = newName;
	}	
} 
