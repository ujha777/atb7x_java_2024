package static_concept;

public class ATB {
    static {
        System.out.println("static block");
    }
    {
        System.out.println("IIB");
    }
    private String name;
    static String course_Name="ATB";

    public ATB(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCourse_Name() {
        return course_Name;
    }

    public static void setCourse_Name(String course_Name) {
        ATB.course_Name = course_Name;
    }
    static void assign(){
        System.out.println("Do assignment");
    }
}
