package firstpackage;

public class Exceuter {

	public static void main(String[] args) {
		base m = new base();
		
		m.base();
		m.methodpublic();
		m.methodprotected();
		
		
		System.out.println("Default varaiable"+ m.a);
		System.out.println("Public varaiable" + m.b);
		System.out.println("Protected"+m.d);

		

	}

}
