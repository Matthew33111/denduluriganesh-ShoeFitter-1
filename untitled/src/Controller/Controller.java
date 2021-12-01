package untitled.src.Controller;

import untitled.src.Model.Model;
import untitled.src.Model.TestHarness;
import untitled.src.View.RegisterUI;
import untitled.src.View.View;
import untitled.src.Model.Customer;
import untitled.src.Model.CustomerList;
import untitled.src.View.LoginUI;
import untitled.src.View.MainFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Controller {
    Model model;
    View view;

    private LoginUI theLoginUI;
    private CustomerList theCustomerList;

    public CustomerList getCustomerList(){
        return theCustomerList;
    }



    public Controller(View v, Model m) {
        model = m;
        view = v;

        MainFrame myFrame = new MainFrame();
        RegisterUI myRegistration = new RegisterUI();
        theLoginUI = new LoginUI(this);
        theCustomerList = new CustomerList();
        TestHarness.TestHarness();
    }

    public void requestAuthenticate(Customer customer){
        if(theCustomerList.authenticate(customer)==true){
            System.out.println("Valid user");
        }
        else
            System.out.println("Invalid username/password");
    }

    private void addListeners(){
        userLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lu.setVisible(true);
            }
        });

        registerNewUserButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ru.setVisible(true);
            }
        });
    }
}
