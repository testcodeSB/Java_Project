package project3;

public class Employee_toStr {
	int id;
	String Name;
	int sal;
	Employee_toStr(int id,String Name,int sal)
	{
		this.id=id;
		this.Name=Name;
		this.sal=sal;
	}
	public String toString() {
		return "Id="+id+" "+"Name="+Name+" "+"SAL="+sal;
	}

	public static void main(String[] args) {
		Employee_toStr E1=new Employee_toStr(1,"Biki",30000);
		Employee_toStr E2=new Employee_toStr(2,"xyz",30000);
		Employee_toStr E3=new Employee_toStr(3,"Raju",30000);
		 
		Employee_toStr[]e= {E1,E2,E3};
		for (int i=0;i<e.length;i++) {
		
			System.out.println(e[i]);
		}
	}

}
