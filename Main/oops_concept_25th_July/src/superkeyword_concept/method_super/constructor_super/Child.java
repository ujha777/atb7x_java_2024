package superkeyword_concept.method_super.constructor_super;

public class Child extends Parent{
    Child(){
        // Calling by using
        // Programming(int i,int j)
        // from class Programming.
        super(10, 20);
        System.out.println("Child");
    }

    // Parameterized Constructor
    // for class DP
    public Child(int i, int j)
    {
        System.out.println("Child + +");
    }
}
