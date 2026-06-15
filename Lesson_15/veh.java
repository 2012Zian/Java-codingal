package Lesson_15;
abstract class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
         this.make = make;
         this.model = model;
         this.year = year;
    }
    public abstract void drive();

}

class Car extends Vehicle {
    private int numDoors;
    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors =numDoors;
    }

    @Override
    public void drive() {
        System.out.println("Driving car,,,");
    }
    public int getNumDoors() {
        return numDoors;
    }

}
public class veh{
    
}
