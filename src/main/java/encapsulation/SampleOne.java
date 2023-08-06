package encapsulation;

public class SampleOne {
	
private	String carName;
private int regNo;
public void setter(String carName,int regNo)
{
	this.carName=carName;
	this.regNo=regNo;
}
public void getter()
{
	System.out.println(carName);
	System.out.println(regNo);
}

	

}
