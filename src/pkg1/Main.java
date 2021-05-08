package pkg1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Shape r = new Rect(10,20);
        Shape c = new Circ(30);
        System.out.println(Shape.x);
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(r);
        shapes.add(c);
        for(Shape s : shapes){
            System.out.println(s.GetArea());
        }
        //Animal a = new Animal();
//        Cat cat = new Cat();
//        Dog dog = new Dog();
//        cat.Sound();
//        dog.Sound();
	// write your code here
    }
}
