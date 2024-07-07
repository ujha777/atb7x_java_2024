package mypack;

public class Lab001 {
    public static void main(String[] args) {
        //super()
        //1. Use of super with Variables,Methods and Constructor

        // super key word reference to the parent class
        //variable of the parent
        //method of the parent
        //constructor of the parent

        Car c = new Car();
        c.display();

    }


}
class Car extends Vehicle{
    int maxSpeed=180;
    void display(){
        System.out.println("Maximum speed of car"+ super.maxSpeed);
        System.out.println("Maximum speed of car"+this.maxSpeed);
    }
}
class Vehicle {
    int maxSpeed =100;
    void message(){
        System.out.println("This is Vehicle class");

    }
}
