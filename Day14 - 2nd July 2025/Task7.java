
//Peek the element and print it ..


import java.util.Stack;
public class Task7 {
    public static void main(String[] args) {
        Stack<String> names= new Stack<>();
        names.push("Apple");
        names.push("Mango");
        names.push("Peach");
        names.push("Orange");
        names.push("Strawberry");
        System.out.println("Name of Fruits:"+ names);


       
        String Val= "Peach";
        int position= names.search(Val);
        System.out.println("The search value of Fruit:"+ position);


       // Peek at the top element
          String topElement = names.peek();
          System.out.println("Element at top using peek(): " + topElement);


    }
}
