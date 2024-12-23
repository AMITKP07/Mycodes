package labdaanonymus;
class Animal {
    void makesound() {
        System.out.println("dog barks");
    }
}
public class anolamb {
    public static void main(String[] args) {
        Animal animal=new Animal(){
        @Override
        public void makesound() {
            System.out.println("cow moos");
        }
        };

        animal.makesound();

    }
}
