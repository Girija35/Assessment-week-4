abstract class College{
        int clgid;
		String clgname;
		College(int clgid,String clgname)
		{
		   this.clgid=clgid;
		   this.clgname=clgname;
		}
		void display()
		{
		    System.out.println("College name : "+clgname);
			System.out.println("College ID : "+clgid);
		}
		abstract void dept(int students,String deptname);
}
class Deriving extends College{
     Deriving(int clgid,String clgname)
	 {
	    super(clgid,clgname);
	 }
	 void dept(int students,String deptname)
	 {
	     System.out.println("\nDepartment name : "+deptname);
		 System.out.println("\nNumber of students present in "+deptname+" is "+students);
	 }
}
class Clgdept{
     public static void main(String...args)
	 {
	    Deriving d=new Deriving(2304,"St.Joseph Engineering College");
		d.display();
		d.dept(5,"CSE");
	 }
}
		
		
		