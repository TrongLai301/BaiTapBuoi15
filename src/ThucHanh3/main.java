package ThucHanh3;

import java.io.File;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        Product pd1 = new Product("1","Trọng",4000);
        Product pd2 = new Product("2","Tuấn",3000);
        Product pd3 = new Product("3","Vinh",2000);
        Product pd4 = new Product("4","Mi",1000);
        try {
            File file = new File("object.dat");
            file.createNewFile();
            ProductProcess pp = new ProductProcess();
            String file1 = String.valueOf(file);

            pp.writeObject(pd1, file1);
            pp.writeObject(pd2, file1);
            pp.writeObject(pd3, file1);
            pp.writeObject(pd4, file1);

            Product[] products= pp.readObjectData(file1);
            for (Product pd: products
                 ) {
                System.out.println(pd);
                if(pd == null){
                    break;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
