package untitled.src.Model;
import java.io.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.*;

public class CustomerList implements Serializable{
    private ArrayList<Customer> listOfCustomers = new ArrayList();
    final static String outputFilePath = "listOfUsers.ser";
    public File file = new File(outputFilePath);


    public CustomerList(){
        Customer u1 = new Customer("5708798797", "Jeff", "Dunham", "123 Atherton Street", "MegaPenguin", "password123");
        Customer u2 = new Customer("5709729729", "Steven", "Mahler", "140 Austin Avenue", "Matt", "password999");
        listOfCustomers.add(u1);
        listOfCustomers.add(u2);
    }

    public ArrayList getListOfCustomers() {
        return listOfCustomers;
    }

    public void setListOfCustomers(ArrayList<Customer> listOfCustomers) {
        this.listOfCustomers = listOfCustomers;
    }

    public void addCustomerList(Customer newCustomer){

        listOfCustomers.add(newCustomer);
    }

    public void deleteCustomerList(Integer i){
        this.listOfCustomers.remove(i);
    }

    public void editCustomerList(Integer i, Customer customerNew){

        this.listOfCustomers.set(i, customerNew);
    }

    public boolean authenticate(Customer customer){
        this.readUserListFile();
        for(Customer u:listOfCustomers){
            if(customer.getUserName().equals(u.getUserName()) && customer.getPassword().equals(u.getPassword())){
                return true;
            }
        }
        return false;
    }
    public boolean checkUserName(Customer Customer){
        for(Customer u:listOfCustomers){
            if(Customer.getUserName().equals(u.getUserName())){
                return true;
            }
        }
        return false;
    }

    public boolean checkPassword(Customer Customer){
        for(Customer u:listOfCustomers){
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

        try{
          fis = new FileInputStream(outputFilePath);
          in = new ObjectInputStream(fis);
          listOfCustomers = (ArrayList) in.readObject();
          in.close();
          if(!listOfCustomers.isEmpty()){
              System.out.println("There are customer in the customer list");
          }
        } catch (FileNotFoundException fne){
            System.out.println("File was not found, a new one will be created");
        } catch (IOException ex){
            ex.printStackTrace();
        } catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }

        public void writeUserListFile() {
        FileOutputStream fos = null;
        ObjectOutputStream out = null;

        try{
            fos = new FileOutputStream(outputFilePath);
            out = new ObjectOutputStream(fos);
            out.writeObject(listOfCustomers);
            out.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public void createTestUserList() {
        for (int i = 5; i < 20; i++) {
            listOfCustomers.add(new Customer("666","kyle","Smith","123 home Add","TestUser" + i,"password"));
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
