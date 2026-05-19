package Lesson_8;
class mammals{
    void mam(){
        System.out.println("inside mammal class");

    }
}
class lion1 extends mammals{
    void roar1(){
        System.out.println("inside lion class");

    }
}
class human extends mammals{
    void hum(){
        System.out.println("inside human class");

    }
}
public class Activity3 {
    public static void main(String[] args) {
        lion1 obj = new lion1();
        obj.roar1();
        obj.mam();
    }
}
