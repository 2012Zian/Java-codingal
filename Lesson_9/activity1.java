package Lesson_9;
class student {
    int id;
    String name;
    float stipend;

    student(){}
    student(int id,String name){
        this.id = id;
        this.name = name;

    }
    student(int id,String name, float stipend){
        this.id = id;
        this.name=name;
        this.stipend=stipend;

    }
    void displaydetails(){
        System.out.println(this.id + "|" +this.name + "|" +this.stipend);

    }
}
public class activity1 {
   public static void main(String[] args) {
    student s1 = new student();
    student s2 = new student(45, "Zian");
    student s3 = new student(45,"dove" , 100000 );
    s1.displaydetails();
    s2.displaydetails();
    s3.displaydetails();
    
   }
}
