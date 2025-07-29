import java.util.ArrayList;
import java.util.List;

class Animal2 {
    void sound() {
        System.out.println(" sounds of different animals");
    }
    void animalSound(List<? extends Animal2> animalList) {
        for(Animal2 elements : animalList) {
            elements.sound();
        }
    }
}

class Cat2 extends Animal2{
    @Override
    void sound() {
        System.out.println(" Meow is the sound of cat");
    }
}
public class Task3 {
    public static void main(String[] args) {
        List<Cat2> cat = new ArrayList<>();
        cat.add(new Cat2()) ;

        Animal2 obj = new Animal2();
        obj.animalSound(cat); //meow

    }
}