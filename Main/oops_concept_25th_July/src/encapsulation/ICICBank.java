package encapsulation;

public class ICICBank {
    private String name;
    private long bal;

    public ICICBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal,boolean isAdmin) {
        if (isAdmin) {
            this.bal = bal;
        }
        else {
            System.out.println("Not Allowed");
        }
    }
}
