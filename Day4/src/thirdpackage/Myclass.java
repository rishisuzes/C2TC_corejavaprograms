package thirdpackage;

public class Myclass {
	private static Myclass obj=new Myclass();
	private int id;
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	private Myclass() {
		System.out.println("MyClass object created");		
	}
	
	public static Myclass getObject() //factory method
	{
		return obj;
	}

	@Override
	public String toString() {
		return "MyClass [id=" + id + "]";
	}

}
