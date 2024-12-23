enum singlet {
    INSTANCE;

    public void showmsssg() {
     System.out.println("hii singleton");
    }
}

public class esingle {
         public static void main(String[] args)  {
             singlet instance= singlet.INSTANCE;
             instance.showmsssg();

         }
}

