package Generics;

public class Box<T> {

    T value;
    public Box(T value) {
        this.value=value;
    }
    public void performTask() {
        if(value instanceof  String) {
            System.out.println("length of the "+ value+ "   is  "+ ((String) this.value).length());
        }
    }
    public T getValue() {
        return this.value;
    }
}
