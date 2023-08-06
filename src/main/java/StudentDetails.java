
public class StudentDetails {
	
	  int rollNo;
	  String name;
	
	public StudentDetails(int rollNo,String name)
	{
		this.rollNo=rollNo;
		this.name=name;
	}
	public  void display()
	{
		System.out.println(rollNo);
		System.out.println(name);
	}
	

	public static void main(String[] args) {
		
		StudentDetails sd1=new StudentDetails(1,"Aparna");
		StudentDetails sd2=new StudentDetails(2,"Athira");
		sd1.display();
		sd2.display();
		// TODO Auto-generated method stub

	}

}
