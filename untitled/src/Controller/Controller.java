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
import untitled.src.View.RegisterUI;

public class Controller {
    Model model;
    View view;

    private LoginUI theLoginUI;
    private CustomerList theCustomerList;
    public Customer sessionUser;
    private RegisterUI registerUI;

    public void showLoginUI(){
        theLoginUI.setVisible(true);
    }

    public void requestAuthenticate(Customer customer){
        if(theCustomerList.authenticate(customer)==true){
            System.out.println("Valid user");
            setUser(customer);
            untitled.src.View.View.InitialSetUp();
        }
        else
            System.out.println("Invalid username/password");
    }

    public Controller(View v, Model m) {
        model = m;
        view = v;

        MainFrame myFrame = new MainFrame();
        RegisterUI myRegistration = new RegisterUI();
        theLoginUI = new LoginUI(this);
        theCustomerList = new CustomerList();
        TestHarness.TestHarness();



        myFrame.getJb().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showLoginUI();
            }
        });

        myRegistration.getJb().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showLoginUI();
            }
        });
    }

    public void setUser (Customer sessionUser){
        this.sessionUser = sessionUser;
    }

    public Customer getUser(){
        return sessionUser;
    }
}
