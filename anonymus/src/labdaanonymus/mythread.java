package labdaanonymus;

public class mythread implements Runnable{

    @Override
    public void run() {
        for (int i=1;i<=10;i++) {
            System.out.println("I am "+ Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
