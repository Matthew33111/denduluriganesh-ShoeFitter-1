package untitled.src.Controller;

import untitled.src.Model.Model;
import untitled.src.Model.TestHarness;
import untitled.src.View.View;
import untitled.src.Model.Customer;
import untitled.src.Model.CustomerList;
import untitled.src.View.LoginUI;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Controller {
    Model model;
    View view;

    private LoginUI theLoginUI;
    private CustomerList theCustomerList;
    public void LoginCntl(){
        theLoginUI = new LoginUI(this);
        theCustomerList = new CustomerList();
        showLoginUI();
    }
    public CustomerList getCustomerList(){
        return theCustomerList;
    }
    public void showLoginUI(){
        theLoginUI.setVisible(true);
    }
    public void requestAuthenticate(Customer customer){
        if(theCustomerList.authenticate(customer)==true){
            System.out.println("Valid user");
        }
        else
            System.out.println("Invalid username/password");

    }

    public Controller(View v, Model m) {
        model = m;
        view = v;

        TestHarness.TestHarness();
       // untitled.src.View.View.InitialSetUp();
    }
}
