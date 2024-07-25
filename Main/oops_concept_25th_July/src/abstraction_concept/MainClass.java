package abstraction_concept;

public class MainClass {

    public static void main(String[] args) {
        Rectangle r = new Rectangle("blue",8,9);
        double areaofrectangle = r.getArea();
        System.out.println(areaofrectangle);
        String colorofrectangle = r.getColor();
        System.out.println(colorofrectangle);
        Circle c= new Circle("red",6);
        double araeofCircle = c.getArea();
        System.out.println(araeofCircle);
        String colorofCircle = c.getColor();
        System.out.println(colorofCircle);
    }
}
