package accessmodifierexample;

public class Class2 {
	
	private static String name="Athira";
	
	public static void empId()
	{
		System.out.println(1234);
		
	}

	public static void main(String[] args) {
		
		Class1.empName();
		Class2.empId();
		System.out.println(Class2.name);
		Class1.display();
		// TODO Auto-generated method stub

	}

}
