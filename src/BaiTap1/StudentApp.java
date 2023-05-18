package BaiTap1;

import ThucHanh3.ProductProcess;

import java.io.File;
import java.io.IOException;

public class StudentApp {
    public static void main(String[] args) {
        File file = new File("Student.dat");
        try{
            file.createNewFile();
            String file1 = String.valueOf(file);
            Student student1 = new Student("101"," Trọng", 19,"IBSK1D1");
            Student student2 = new Student("102"," Tuấn", 19,"IBSK1D1");
            Student student3 = new Student("103"," Vinh", 18,"IBSK1D2");
            Student student4 = new Student("104"," Mi", 19,"IBSK1D1");

            StudentProcess sp = new StudentProcess();
            sp.writeStudent(student1, file1);
            sp.writeStudent(student2, file1);
            sp.writeStudent(student3, file1);
            sp.writeStudent(student4, file1);

            Student[] students = sp.readStudent(file1);
            for (Student st:students
                 ) {
                System.out.println(st);
                if(st == null){
                    break;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
