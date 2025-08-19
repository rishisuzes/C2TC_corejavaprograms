
package helloword;
import java.util.*;
public class ProductDemo {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		//parameterized I/O
		Product p2 = new Product(102,"mouse",250.5f);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product details : ");
		int sid = sc.nextInt();
		sc.nextLine();
		String sname = sc.nextLine();
		float srate  = sc.nextFloat();
		
		
		Product p3 = new Product(sid,sname,srate);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}