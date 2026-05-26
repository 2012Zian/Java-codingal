package Lesson_10;
class student{
private String name;
public String getName(){
    return name;
}
public void setName(String name){
    this.name=name;
  }

}

class getset{
    public static void main(String[] args) {
        student s = new student();
        s.setName("dovie");
        System.out.println(s.getName());
    }
}