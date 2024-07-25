package abstraction_concept;

public abstract class Shape {
    //Combination of abstract menthod with no implemenatation and concrete method without implementation
    //fields and concrete methods can be defined in the abstract class
    protected  String color;
   //Parametrized constructor
    public Shape(String color) {
        this.color = color;
    }
    //concrete method

    public String getColor() {
        return this.color;
    }
    //abstract method
    public abstract double getArea();

}
