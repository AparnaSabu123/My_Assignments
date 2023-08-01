package supersamples;

public class SuperChild extends SuperParent {
	
	public void display()
	{
		super.empDetails();
		System.out.println(super.c);
	}

	public static void main(String[] args) {
		
		SuperChild sc=new SuperChild();
		sc.display();
		
		// TODO Auto-generated method stub

	}

}
