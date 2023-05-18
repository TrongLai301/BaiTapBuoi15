package BaiTap1;

import java.io.Serializable;

public class Student implements Serializable {
    String id;
    String name;
    int age;

    String classRoom;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }
    public  Student (){}
    public Student(String id, String name, int age, String classRoom) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classRoom = classRoom;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classRoom='" + classRoom + '\'' +
                '}';
    }
}
