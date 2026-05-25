package Lesson_9;
class parent{
    public void sayHello(){
        System.out.println("hello from Parent");

    }
}

class child extends parent {
    @Override
    public void sayHello(){
        System.out.println("Hello from Child");
    }
}
public class activity2 {
    public static void main(String[] args){
        parent p = new child();
        parent p1 = new parent();
        p.sayHello();
        p1.sayHello();
    }
}
