package project3;

public class Cricket_toString {
	String Pname;
	int Pjerno;
	public Cricket_toString(String Pname,int Pjerno) {
		this.Pname=Pname;
		this.Pjerno=Pjerno;
	}
	public String toString() {
		return "Cricket_player[Player_name="+Pname+",Player_jersy="+Pjerno+"]";
	}

	public static void main(String[] args) {
		Cricket_toString C1=new Cricket_toString("kholi",18);
		Cricket_toString C2=new Cricket_toString("Rohit",45);
		Cricket_toString C3=new Cricket_toString("Dhoni",7);
		Cricket_toString C4=new Cricket_toString("Rahul",34);
		Cricket_toString C5=new Cricket_toString("Jadeja",20);
		
		Cricket_toString [] c= {C1,C2,C3,C4,C5};
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
				
		
		

	}

}
