package untitled.src.Model;
import java.util.HashMap;
import java.util.ArrayList;

public class CustomerList {
    private HashMap<Integer, Customer> listOfCustomers = new HashMap<Integer, Customer>();

    public CustomerList(){
        Customer u1 = new Customer("5708798797", "Jeff", "Dunham", "123 Atherton Street", "MegaPenguin", "password123");
        Customer u2 = new Customer("5709729729", "Steven", "Mahler", "140 Austin Avenue", "Matt", "password999");
        listOfCustomers.put(0, u1);
        listOfCustomers.put(1,u2);

    }

    public HashMap<Integer, Customer> getListOfCustomers() {
        return listOfCustomers;
    }

    public void setListOfCustomers(HashMap<Integer, Customer> listOfCustomers) {
        this.listOfCustomers = listOfCustomers;
    }

    public void addCustomerList(Customer newCustomer){
        int a = 0;
        a = listOfCustomers.size();
        listOfCustomers.put(a, newCustomer);
    }

    public void deleteCustomerList(Integer i){
        this.listOfCustomers.remove(i);
    }

    public void editCustomerList(Integer i, Customer customerNew){
         Customer customerOld = listOfCustomers.get(i);
        this.listOfCustomers.replace(i,customerOld, customerNew);

    }

    public boolean authenticate(Customer Customer){
        for(Customer u:listOfCustomers.values()){
            if(Customer.getUserName().equals(u.getUserName()) && Customer.getPassword().equals(u.getPassword())){
                return true;
            }
        }
        return false;
    }
    public boolean checkUserName(Customer Customer){
        for(Customer u:listOfCustomers.values()){
            if(Customer.getUserName().equals(u.getUserName())){
                return true;
            }
        }
        return false;
    }

    public boolean checkPassword(Customer Customer){
        for(Customer u:listOfCustomers.values()){
            if(Customer.getPassword().equals(u.getPassword())){
                return true;
            }
        }
        return false;
    }

    public boolean authenticateRegistration(Customer customer){
        if(this.checkPassword(customer) || this.checkUserName(customer)){
            System.out.println("User name or password already in use.");
            return false;
        }else{
            System.out.println("Accepted.");
            return true;
        }
    }
}
