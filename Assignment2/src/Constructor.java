import java.util.Scanner;

class student{
	student(){
		System.out.println("Student object is created");
	}
}

class commission1{
	
	private String name;
	private String address;
	private String phone;
	private double sale_amount;
	
	// method to accept details of the sales employee
	
	public void acceptdetails() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		name = sc.nextLine();
		
		System.out.println("Enter your address");
		address = sc.nextLine();
		
		System.out.println("Enter your Phone number");
		
		sale_amount = sc.nextDouble();
		
		System.out.println("Enter the sales amount");
		
	}
	
	public void calculatecommission() {
		
		double commission  = 0;
		
		if(sale_amount >=100000) {
			commission = sale_amount*0.10;
		}
		
		else if(sale_amount >=50000) {
			commission = sale_amount * 0.05;
		}
		
		else if(sale_amount >=30000) {
			commission = sale_amount *0.03;
		}
		
		else {
			commission =0;
		}
		
		System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Sales Amount: " + sale_amount);
        System.out.println("Commission: " + commission);
		
		
		
		
	}
	
	public class MainProgram {
	    public static void main(String[] args) {
	        // Create Student object (default constructor runs)
	        student s = new student();

	        // Create Commission object
	        commission1 emp = new commission1();

	        // Accept employee details
	        emp.acceptdetails();

	        // Calculate and display commission
	        emp.calculatecommission();
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}