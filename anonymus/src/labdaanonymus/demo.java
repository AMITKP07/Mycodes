package labdaanonymus;

public class demo {
    public static void main(String[] args) {

        System.out.println("Thread will start");
        System.out.println(Thread.currentThread().getName());
        mythread th = new mythread();
        Thread t = new Thread(th);
        t.start();

        //Anonymous

        Runnable t2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am " + Thread.currentThread().getName());

            }
        };
        Thread tt = new Thread(t2);
        tt.start();

        //Lambda exp
        Runnable t3 = () -> {
            System.out.println("i am " + Thread.currentThread().getName());
        };
        Thread p = new Thread(t3);
        p.start();
    }
}

