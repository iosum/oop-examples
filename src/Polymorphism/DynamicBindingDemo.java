package Polymorphism;

public class DynamicBindingDemo {
    public static void main(String[] args) {
//        m(new GraduateStudent());
//        m(new Student());
//        m(new Person());
//        m(new Object());


        //Integer[] list1 = {12, 24, 55, 1};
        //Double[] list2 = {12.4, 24.0, 55.2, 1.0};
        // int is not an Object
        //int[] list3 = {1, 2, 3};
        //printArray(list1);
        //printArray(list2);
        // printArray(list3);


        new Person().printPerson();
        new Student().printPerson();
        System.out.println(new Student().getClass());

    }

//    public static void m(Object x) {
//        System.out.println(x.toString());
//    }
//
//
//    public static void printArray(Object[] list) {
//        for (Object o: list)
//            System.out.print(o + " ");
//        System.out.println();
//    }
//
//
//    static class GraduateStudent extends Student {
//    }
//
//    static class Student extends Person {
//        @Override
//        public String toString() {
//            return "Student";
//        }
//    }
//
//    static class Person extends Object {
//        @Override
//        public String toString() {
//            return "Person";
//        }
//    }

    static class Person {
        // private only for Person class
        private String getInfo() {
            return "Person";
        }
        // can access outside of the class
        public void printPerson() {
            System.out.println(getInfo());
        }
    }


    static class Student extends Person {
        // 我自己的 method
        private String getInfo() {
            return "Student";
        }
        public void printPerson() {
            System.out.println(getInfo());
        }
    }


}


