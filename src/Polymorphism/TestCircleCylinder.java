package Polymorphism;

public class TestCircleCylinder {
    public static void main(String[] args) {
        Circle c1 = new Cylinder(1.1, 2.2);
        System.out.println(c1);
        System.out.println(c1.getClass());
        System.out.println(c1.getRadius());
        // CANNOT invoke method in Cylinder as it is a Circle reference!
        //c1.getHeight();  // compilation error
        //c1.getVolume();  // compilation error
        // Run the overridden version!
        System.out.println(c1.toString());
        System.out.println(c1.getArea());   // Run the overridden version!
    }
}
