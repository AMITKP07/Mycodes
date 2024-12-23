class thr {

    public boolean iseven=true;
    synchronized void  peven(int n) throws InterruptedException {
        while (!iseven) {
            wait();
        }
        System.out.println(n);
        iseven=false;
        notify();
    }
    synchronized void podd(int n) throws InterruptedException {
        while (!iseven) {
            wait();
        }
        System.out.println(n);
        iseven=false;
        notify();
    }
}
public class therd {
    public static void main(String[] args) {
        thr r=new thr();

        Thread t1=new Thread(() -> {
            for (int i=2;i<10;i+=2) {
                try {
                    r.peven(i);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
        Thread t2=new Thread(()->{
            for(int i=1;i<10;i+=2) {
                try {
                    r.podd(i);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
        t1.start();
        t2.start();

    }
}