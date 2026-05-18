package Lesson_7;
class Employee{
    int empno;
    String name;
    float sal;
    Employee(){
        System.out.println("**********");
        empno = 101;
        name = "ABC";
        sal = 5000f;
    }

    void displaydetails(){
        System.out.println(empno + "|" + name + "|" + sal);
    }


}
public class Main7 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        emp1.displaydetails();
        emp2.displaydetails();
        emp3.displaydetails();


    }
}
