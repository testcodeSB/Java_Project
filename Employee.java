package project3;

public class Employee implements Comparable<Employee> {
	private String name;
	private int age;
	private int salary;
	
	 Employee(String name, int age,int salary){
		 this.age=age;
		 this.name=name;
		 this.salary=salary;
		 
		 
	 }
	  
	 
	 public String toString() {
		 return "name"+name+"age"+age+"salary"+salary;
	 }
	 
	 public int compareTo(Employee el) {
		 if(age==el.age) {
			 return (salary-el.salary);
		 }
		 return age-el.age;
	 }
}
