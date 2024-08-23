package constructor_concept;

public class Lab004 {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        System.out.println(ba.bankName);
        ba.printDetails();
        BankAccount icici=new BankAccount("icici",123456,"ICICERTY");
        System.out.println(icici.bankName);
        System.out.println(icici.balance);
        System.out.println(icici.bankCode);
    }
}
