package rishi;
public  class Item {
	int id;
	String Title;
	
	Item(int id , String Title){
		
		this.id = id;
		this.Title = Title;
		
	}
	
	void displayinfo() {
		System.out.println("Id : " + id + " Title : " + Title);
	}
	
}

class Book extends Item{
	String author;
	
	Book(int id , String Title, String author){
		super(id,Title);
		
		this.author = author;
	}
	
	void displayinfo() {
		super.displayinfo();
		System.out.println("author :" + author);
		
	}
}

class Magazine extends Item {
    int issueNumber;

    Magazine(int id, String title, int issueNumber) {
        super(id, title);
        this.issueNumber = issueNumber;
    }

    @Override
    void displayinfo() {
        super.displayinfo();
        System.out.println("Issue Number: " + issueNumber);
    }
}
class InheritanceDemo{
	

public static void main(String[] args) {
        Book b1 = new Book(1, "Java Programming", "James Gosling");
        Magazine m1 = new Magazine(2, "Tech Monthly", 45);

        System.out.println("Demonstrating Inheritance (is-a):");
        b1.displayinfo();
        System.out.println("----------------------");
        m1.displayinfo();
    }
}

