package BaiTap1;

import java.io.*;

public class StudentProcess {
    Student[] students;
    int count;

    public StudentProcess() {
        students = new Student[100];
        count = 0;
    }

    public boolean writeStudent(Student objStudent, String fileName) {

        try {
            students[count++] = objStudent;
            FileOutputStream fos = new FileOutputStream(fileName);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos);

            oos.writeObject(students);

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
    public Student[] readStudent (String fileName){

        try {
            FileInputStream fis = new FileInputStream(fileName);
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);

            Student[] students1 = (Student[]) ois.readObject();

            ois.close();
            bis.close();
            fis.close();
            return students1;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
