package Ref.Consmain;

public class ConsMain {
    public static void main(String[] args) {
        System.out.println("Learning constructor reference");

        Provider provider = Studentt::new;
        Studentt studentt = provider.getStudent();
        studentt.display();
    }
}
