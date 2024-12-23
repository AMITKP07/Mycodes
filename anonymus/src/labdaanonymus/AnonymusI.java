package labdaanonymus;

public class AnonymusI {
    public static void main(String[] args) {
//        Gretting gretting=new Gretting() {
//            @Override
//            public void sayhello() {
//                System.out.println("hii all");
//            }
//        };
//        gretting.sayhello();
        Greeting greeting = () -> System.out.println("Hello from a lambda expression!");

        greeting.sayhello();

    }
}
