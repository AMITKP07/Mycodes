package Ref;

public class RefDemo {
    public static void main(String[] args) {
        System.out.println("Learning Method reference");

      //refer static methods
        //classname::methodnm
        WorkInter  workInter = Stuff::doStuff;
        workInter.doTask();
        
        Runnable runnable = Stuff::Threadtask;
        
        Thread d = new Thread(runnable);
        d.start();
        //for refering non static methods ,create object
        Stuff stuff = new Stuff();
        Runnable runnable1 = stuff::printnum;

        Thread t = new Thread(runnable1);
        t.start();


    }
}
