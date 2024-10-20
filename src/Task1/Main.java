package Task1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

     ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer("Sean", "Hansen", "Bobcat"));
        customers.add(new Customer("Leah", "Conor", "MurderCat"));
        customers.add(new Customer("Alva", "Johon", "bitCat"));

        printCustomers(customers);
}
public static void printCustomers(ArrayList<Customer> customers){
        for (Customer c : customers) {
            System.out.println(c);
        }
    }

}
