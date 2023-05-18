package ThucHanh1;

import java.io.*;

public class CreatFile {
    public static void main(String[] args) {
        File file = new File("person.dat");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String s = "Hellooooo azinomoto";
        try{

            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] a = s.getBytes();
            fileOutputStream.write(a);
            FileInputStream fileInputStream = new FileInputStream(file);
            int b = fileInputStream.read();
//            fileInputStream.readAllBytes();
            while (b != -1){
                System.out.println((char) b);
                b= fileInputStream.read();
            }
            fileOutputStream.close();
            fileInputStream.close();
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
