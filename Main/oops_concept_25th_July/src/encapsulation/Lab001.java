package encapsulation;

public class Lab001 {
    public static void main(String[] args) {
        ICICBank amit=new ICICBank("Amit",100);
        amit.setBal(10000,true);
        ICICBank admin=new ICICBank("admin",100);
        admin.setBal(5000,true);
        System.out.println(admin.getName());
        System.out.println(admin.getBal());
    }
}
