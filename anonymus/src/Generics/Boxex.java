package Generics;

public class Boxex {
    public static void main(String[] args) {

        Box<String>  ob= new Box<String>("Amit");
        System.out.println(ob.getValue());
        System.out.println(ob.value.getClass().getName());
        ob.performTask();
    }
}
