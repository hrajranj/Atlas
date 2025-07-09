// Define the Customer class
class Customer {
    
    void accept() {
        System.out.println("accept customer called");
    }

    void display() {
        System.out.println("display customer called");
    }
}

// Define the Task7 class with the main method
public class Task7 {
    public static void main(String[] args) {
        Customer cobj = new Customer();  // Create an object of Customer class
        cobj.accept();                   // Call the accept method
        cobj.display();                  // Call the display method
    }
}
