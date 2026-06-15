package Lesson_15;
class animal {
    private String name;
    private int age;
    public animal(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void makeSound() {
        System.out.println("The animal makes sound");
    }
}
class dog extends animal{
    private String breed;
    public dog(String name,int age , String breed){
        super(name,age);
        this.breed =breed;
    }
    public String getBreed(){
        return breed;
    }
    @Override
    public void makeSound(){
        System.out.println("The dog barks");
    }
}
class cat extends animal{
    private boolean isIndoor;
    public cat(String name, int age, boolean isIndoor){
        super(name,age);
        this.isIndoor =isIndoor;
    }
    public boolean getIsIndoor(){
        return isIndoor;
    }
    @Override
    public void makeSound(){
        System.out.println("The cat meows");
    }
}
public class inherit {
    public static void main(String[] args) {
        dog d= new dog("buddy" , 3 , "Labrador");
        cat c = new cat("Kitty" , 2 , true);
        System.out.println(d.getName() + " - " + d.getAge() + " - " + d.getBreed());
        d.makeSound();
        System.out.println(c.getName() + " - " + c.getAge() + " - " + c.getIsIndoor());
        c.makeSound();
    }
}
