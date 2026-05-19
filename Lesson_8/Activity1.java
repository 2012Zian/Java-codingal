package Lesson_8;
class parent{
    int age, id;
    String name;
    void naming(String name){
        System.out.println("Name:" + name);
    }
}

class child extends parent{
    void age(int age){
        System.out.println("Age of student is : " +age);
    }
}
public class Activity1 {
    public static void main(String[] args) {
        child s = new child();
        s.naming("teacher");
        s.age(14);
    }
}
