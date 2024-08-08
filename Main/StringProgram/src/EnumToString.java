public class EnumToString {

    public static void main(String[] args) {

        System.out.println(Fruits.Orange.name());
        System.out.println(Fruits.Apple.name());
        System.out.println(Fruits.Banana.name());
        System.out.println(Fruits.Mango.name());
    }
}

enum Fruits {
    Orange,
    Apple,
    Banana,
    Mango;
}
