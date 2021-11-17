package untitled.src.Controller;

import untitled.src.Model.Model;
import untitled.src.Model.TestHarness;
import untitled.src.View.View;
import untitled.src.Model.CustomerList;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Controller {
    Model model;
    View view;

    public Controller(View v, Model m) {
        model = m;
        view = v;
        private LoginUI theLoginUI;
        private CustomerList theCustomerList;
        public LoginCntl() {
            theLoginUI = new LoginUI(this);
            theCustomerList = new CustomerList();
            showLoginUI();
        }

        public CustomerList getUserList(){
            return theCustomerList;
        }
        public void showLoginUI(){
            theLoginUI.setVisible(true);
        }
        public void requestAuthenticate(Customer Customer){
            if (theCustomerList.authenticate(Customer) == true) {
                System.out.println("Valid user");
            } else
                System.out.println("Invalid username/password");
        }
        TestHarness.TestHarness();
       // untitled.src.View.View.InitialSetUp();
    }
}
