package Lesson_12;
interface MyInterface
{
    public void method1();
    public void method2();

}

class Main implements MyInterface
{
    public void method1()
    {
        System.out.println("Implementation of method1");
    }


    public void method2()
    {
        System.out.println("Implementtion of method 2");
    }
     public static void main(String args[])
     {
        MyInterface obj = new Main();
        obj.method1();
        obj.method2();
     }
}
