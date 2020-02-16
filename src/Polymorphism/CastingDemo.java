package Polymorphism;

public class CastingDemo {
    public static void main(String[] args) {
        Object object = new Fruit.Apple(2);
        displayObject(object);
    }

    public static void displayObject(Object object) {
        if(object instanceof Fruit.Apple) {
            System.out.println("the apple of the price is " +
                    ((Fruit.Apple) object).getPrice(3));
        }
    }

}
