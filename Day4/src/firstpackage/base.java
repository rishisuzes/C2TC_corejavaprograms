package firstpackage;

public class base {
	
	int a = 10;
	public int b = 20;
	private int c = 30;
	protected int d = 40;
	
	
	public void base() {
		System.out.println("Default access base class");
		
		System.out.println("Default varaiable" + a);
		
		
		}
	
	public void methodpublic() {
		
		System.out.println("Public access base class");
		
		System.out.println("Public variable" + b);
		
	}
	
	private void methodprivate() {
		System.out.println("Private access base class");
		
		System.out.println("Methodprivate" + c);
		
			}
	
	protected void methodprotected() {
		System.out.println("Protected access base class");
		
		System.out.println("Protected "+ d);
	}
	
	public static void main(String[] args) {
		
		base m = new base();
		
		m.base();
		m.methodpublic();
		m.methodprivate();
		m.methodprotected();
		
		
		System.out.println("Default varaiable"+ m.a);
		System.out.println("Public varaiable" + m.b);
		System.out.println("Protected"+m.d);
		System.out.println("Private"+m.c);
		
	}

}
