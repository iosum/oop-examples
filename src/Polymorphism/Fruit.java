package Polymorphism;

/**
 *  If a constructor does not explicitly invoke a superclass constructor, the Java compiler
 *  automatically inserts a call to the no-argument constructor of the superclass. If the super
 *  class does not have a no-argument constructor, you will get a compile-time error. Object does
 *  have such a constructor, so if Object is the only superclass, there is no problem.
 */



public class Fruit {
    public static void main(String[] args) {
        Apple apple = new Apple(4);
    }


    public Fruit() {
        System.out.println("fruit's constructer");
    }

    public static class Apple extends Fruit {
        public Apple(int amount) {
            // If you don't add super() explicitly, Java will do it for you behind the scenes.
            //super();
            System.out.println("apple's constructor");
        }
    }
}
