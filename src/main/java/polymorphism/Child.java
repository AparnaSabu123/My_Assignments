package polymorphism;

public class Child extends Parent {

	public void display(String name,char c)
	{
		super.display("Athira", 't');
		
		System.out.println(name);
		
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		
		Child c=new Child();
		c.display("Aparna", 't');
		// TODO Auto-generated method stub

	}

}
