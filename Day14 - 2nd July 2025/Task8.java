
//Check if the stack is empty or not?


import java.util.Stack;
public class Task8 {
    public static void main(String[] args) {
        Stack<String> names= new Stack<>();
        names.push("Apple");
        names.push("Mango");
        names.push("Peach");
        names.push("Orange");
        names.push("Strawberry");
        System.out.println("Name of Fruits:"+ names);


         // Check if stack is empty
       


            while (!names.empty()){
                System.out.println("Popped: " + names.pop());
            }


            System.out.println("Is the stack empty? " + names.empty());


           
   
    }
}
