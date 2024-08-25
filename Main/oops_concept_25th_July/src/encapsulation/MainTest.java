package encapsulation;

public class MainTest {
    public static void main(String[] args) {
        VMLogin vm = new VMLogin("admin","pwd123");
        System.out.println(vm.getUsername());
        vm.setUsername("pramod");
        System.out.println(vm.getUsername());

    }
}
