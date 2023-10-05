import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        Customer c1 = new Customer("Didrik", "Declan", "Bueskytte");
        customers.add(c1);
        System.out.println(customers);
    }

    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer j : customers) {
            System.out.println(j);

        }
    }
}