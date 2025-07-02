
//Create  astack and pop the element also print the popped element.


import java.util.Stack;
public class Task5 {
    public static void main(String[] args) {
        Stack<String> names= new Stack<>();
        names.push("Apple");
        names.push("Mango");
        names.push("Peach");
        names.push("Orange");
        names.push("Strawberry");
        System.out.println("Before Deletion");
        System.out.println("Name of Fruits:"+ names);


        System.out.println("After Deletion");
        String dummy =names.pop();


        System.out.println("Name of Fruits:"+ names);
        System.out.println("Deleted Element is:"+ dummy);




    }
}
