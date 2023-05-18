package ThucHanh3;

import java.io.*;


public class ProductProcess {
    Product [] products;
    int count;
    public ProductProcess(){
        products = new Product[100];
        count=0;
    }
    public  boolean writeObject(Product objProduct, String fileName) {
        boolean check = false;
        try {
            products[count++]=  objProduct;
            File file = new File(fileName);
            FileOutputStream fos = new FileOutputStream(fileName);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(products);
                oos.close();
                bos.close();
                fos.close();
                return true;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public Product[] readObjectData(String fileName) {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);
            Product[] products = (Product[]) ois.readObject();
            ois.close();
            bis.close();
            fis.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return products;
    }
}
