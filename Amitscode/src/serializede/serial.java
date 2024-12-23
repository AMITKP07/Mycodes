package serializede;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serial {
    public static void main(String[] args) throws IOException {

        try {

        Boys boys=new Boys("Amit",25,"f12","ami@.com");


            FileOutputStream fos=new FileOutputStream("ob1.txt");

            ObjectOutputStream oss=new ObjectOutputStream(fos);
            oss.writeObject(boys);

            oss.close();
            fos.close();
            System.out.println("Object transfered to fileob");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
