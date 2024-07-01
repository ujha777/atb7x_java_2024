public class Lab003 {
    public static void main(String[] args) {
        ATBPerson atb = new ATBPerson();
        atb.name="Ajay";
        System.out.println(atb.name);
        ATBPerson atb1= new ATBPerson("Amit");
        ATBPerson atb2 = new ATBPerson("Pramod");
        System.out.println(atb2.name);
        System.out.println(atb1.name);
    }
}
