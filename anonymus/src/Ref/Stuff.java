package Ref;

import java.time.LocalDate;

public class Stuff {
    public static void doStuff() {
        System.out.println("I am doing the task");
        System.out.println("I am in second line");

        LocalDate now = LocalDate.now();
        System.out.println(now.toString());

    }
    public  static void Threadtask() {
        for (int i=1;i<=10;i++) {

            System.out.println(i*3);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public  void printnum() {
        for (int i=1;i<=10;i++) {
            System.out.println(i*10);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
