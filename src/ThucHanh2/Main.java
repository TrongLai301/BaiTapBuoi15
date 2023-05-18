package ThucHanh2;

import java.io.*;

public class Main {
    public static boolean writeData (String data, String fileName){
        try{
            FileOutputStream fos = new FileOutputStream(fileName);
            byte[] writer = data.getBytes();
            fos.write(writer);
            fos.flush();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return false;
    }
    public static String readData(String fileName){
        try{
            String result = "";
            FileInputStream fis = new FileInputStream(fileName);
            int read = fis.read();
            BufferedInputStream bis = new BufferedInputStream(fis);
            while(read != -1) {
                char a = (char) read;
                result += a;
                read = fis.read();
            }
            return result;
        }catch (IOException e){
           return e.getMessage();
        }

    }
    public static void main(String[] args) {
        try{
            File file = new File("data.dat");
            file.createNewFile();
            String s = "Ahiii ahihihihihihihiihihihi";
            writeData(s,"data.dat");
            System.out.println(readData("data.dat"));

        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
