package untitled.src.Model;
import java.io.*;
import java.util.HashMap;
import java.util.ArrayList;

public class CustomerList implements Serializable{
    private HashMap<Integer, Customer> listOfCustomers = new HashMap<Integer, Customer>();
    private String listOfUsersFileName = "listOfUsers.ser";

    public CustomerList(){
        Customer u1 = new Customer("5708798797", "Jeff", "Dunham", "123 Atherton Street", "MegaPenguin", "password123");
        Customer u2 = new Customer("5709729729", "Steven", "Mahler", "140 Austin Avenue", "Matt", "password999");
        listOfCustomers.put(0, u1);
        listOfCustomers.put(1,u2);

        this.createTestUserList();
        this.writeUserListFile();
        this.readUserListFile();
        /*
        this.readUserListFile();
        if(listOfCustomers.isEmpty() || listOfCustomers == null) {
            this.createTestUserList();
            this.writeUserListFile();
            this.readUserListFile();
        }
*/
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
        public void readUserListFile() {
            FileInputStream fis = null;
            ObjectInputStream in = null;
            try {
                fis = new FileInputStream(listOfUsersFileName);
                in = new ObjectInputStream(fis);
                listOfCustomers = (HashMap) in.readObject();
                in.close();
                if (!listOfCustomers.isEmpty()) {
                    System.out.println("There are users in the user list");
                }
            } catch (FileNotFoundException fne) {
                System.out.println("File was not found, a new one will be created");
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }

        public void writeUserListFile() {
            FileOutputStream fos = null;
            ObjectOutputStream out = null;
            try {
                fos = new FileOutputStream(listOfUsersFileName);
                out = new ObjectOutputStream(fos);
                out.writeObject(listOfCustomers);
                out.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    public void createTestUserList() {
        for (int i = 5; i < 20; i++) {
            listOfCustomers.put(i, new Customer("666","kyle","Smith","123 home Add","TestUser" + i,"password"));
        }
        System.out.println("Test UserList created");
        System.out.println("The UserList is: " + listOfCustomers.toString());
    }

    public void printUserList() {
        System.out.println("The UserList has these users:");
        for (int i = 0; i < listOfCustomers.size(); i++) {
            Customer currentUser = (Customer) listOfCustomers.get(i);
            System.out.println(currentUser.getUserName());
        }
    }
}
