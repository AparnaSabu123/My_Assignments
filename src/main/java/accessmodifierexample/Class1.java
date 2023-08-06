package accessmodifierexample;

public class Class1 {
	
	int a=10;

	public static void empName()
	{
		System.out.println("Aparna");
	}
	protected static void display()
	{
		System.out.println("protected");
	}
	public static void main(String[] args) {
		
		Class1 cs=new Class1();
	    System.out.println(cs.a);
		Class1.empName();
		Class1.display();
		//System.out.println(Class2.name);
		// TODO Auto-generated method stub

	}

}
