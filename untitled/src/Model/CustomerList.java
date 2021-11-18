package untitled.src.Model;

import java.util.ArrayList;

public class CustomerList {
    private ArrayList<Customer> listOfCustomers = new ArrayList<>();

    public CustomerList(){
        Customer u1 = new Customer("5708798797", "Jeff", "Dunham", "123 Atherton Street", "MegaPenguin", "password123");
        listOfCustomers.add(u1);

    }

    public ArrayList<Customer> getListOfCustomers() {
        return listOfCustomers;
    }

    public void setListOfCustomers(ArrayList<Customer> listOfCustomers) {
        this.listOfCustomers = listOfCustomers;
    }
    public boolean authenticate(Customer Customer){
        for(Customer u:listOfCustomers){
            if(Customer.getUserName().equals(u.getUserName()) && Customer.getPassword().equals(u.getPassword())){
                return true;
            }
        }
        return false;
    }
}
