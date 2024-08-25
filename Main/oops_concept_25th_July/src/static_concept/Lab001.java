package static_concept;

public class Lab001 {
    public static void main(String[] args) {
        System.out.println(ATB.course_Name);
        ATB a1=new ATB("amit");
        System.out.println(a1.getName());
        ATB a2=new ATB("pramod");
        System.out.println(a2.getName());
        ATB.assign();

    }
}
