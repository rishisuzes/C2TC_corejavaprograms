package rishi;

import java.util.ArrayList;

//Base class


//Library class (has-a Item)
class Library {
 private ArrayList<Item> items;   // Library has-a collection of Item

 Library() {
     items = new ArrayList<>();
 }

 void addItem(Item item) {
     items.add(item);
 }

 void showAllItems() {
     for (Item i : items) {
         i.displayinfo(); // calls overridden methods automatically
         System.out.println("----------------------");
     }
 }
}

//Main class
 public class LibrayDemo {
 public static void main(String[] args) {
     // Create a Library (composition: Library has-a list of Items)
     Library lib = new Library();

     // Create Book and Magazine objects
     Book b1 = new Book(1, "Java Programming", "James Gosling");
     Magazine m1 = new Magazine(2, "Tech Monthly", 45);

     // Add them to the Library
     lib.addItem(b1);
     lib.addItem(m1);

     // Display all items in the Library
     System.out.println("Library Items (has-a):");
     lib.showAllItems();
 }
}
