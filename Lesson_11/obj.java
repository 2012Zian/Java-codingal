package Lesson_11;
abstract class Objects{
abstract void showShape();

public void shape() {
        System.out.println("i'm from abstact class");
    }
}
class Sphere extends Objects {
    void showShape() {
        System.out.println("Object type is Sphere ");
    }
}
class cuboid extends Objects {
    void showShape() {
        System.out.println("Object type is cuboid ");
    }
}
class prism extends Objects {
    void showShape() {
        System.out.println("Object type is prism ");
    }
}
public class obj {
    public static void main(String[] args) {
        Objects obj = new Sphere();
        obj.shape();
        obj.showShape();

        obj = new cuboid();
        obj.shape();
        obj.showShape();

        obj = new prism();
        obj.shape();
        obj.showShape();
    }
}
