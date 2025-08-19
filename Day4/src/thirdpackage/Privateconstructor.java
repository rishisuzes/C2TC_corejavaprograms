package thirdpackage;

public class Privateconstructor {
	public static void main(String[] args) {
		// Can't create object with private constructor
				// MyClass m1=new MyClass();
				
				Myclass m=Myclass.getObject();
				m.setId(10);
				
				Myclass m1=Myclass.getObject();
				
				System.out.println(m);
				System.out.println(m1);
				
			}
}
