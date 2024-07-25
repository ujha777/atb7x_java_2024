package abstraction_concept;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String color,double width, double height) {
        super(color);
        this.height=height;
        this.width=width;
    }
    //implementation of abstarct method defined in the super class
    @Override
    public double getArea() {
        return this.width*this.height;
    }
}
