public class fiborec {
    public static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("the fibonaci series is"+ n +"this");
        for(int i= 0;i <= n; i++) {
            System.out.println(fibo(i)+ " ");
        }
    }
}

