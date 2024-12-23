package serializede;

import java.io.*;

public class Desire {
    public static void main(String[] args) {

        try {
            FileInputStream fis=new FileInputStream("ob1.txt");

            ObjectInputStream ois=new ObjectInputStream(fis);

            Boys boys=(Boys) ois.readObject();

            boys.displayName();
            System.out.println(boys.getName());
            System.out.println(boys.getAge());
            System.out.println(boys.getAddress());
            System.out.println(boys.getEmail());

            fis.close();
            ois.close();

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

    }
}
