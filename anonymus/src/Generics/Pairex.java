package Generics;

public class Pairex {
    public static void main(String[] args) {

        Pair<String, Integer> ob1 = new Pair<String, Integer>("ross", 798);
        System.out.println(ob1.getKey()+ " value is "+ ob1.getValue());
    }

}

