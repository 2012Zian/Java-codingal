package Lesson_8;
class animal{
    void eat(){
        System.out.println("eating...animal class...eat method");

    }
}
class lion extends animal{
    void roar(){
        System.out.println("roar...lion class...roar method");
        
    }
}
class babylion extends lion{
    void weep(){
        System.out.println("weeping...babylion class...weep method");

    }
}

public class Activity2 {
    public static void main(String[] args) {
        babylion b = new babylion();
        b.weep();
        b.roar();
        b.eat();
    }
}
