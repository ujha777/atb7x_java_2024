package constructor_concept;

public class BankAccount {
    String bankName;
    int balance;
    String bankCode;

    BankAccount(){
        bankName="SBI";
        balance=44;
        bankCode="SBI2345";

    }
    void  printDetails(){
        System.out.println(bankName+" "+bankCode+" "+balance);
    }
    BankAccount(String Bname,int bal,String bCode){
        this.bankName=Bname;
        this.balance=bal;
        this.bankCode=bCode;
    }
}
