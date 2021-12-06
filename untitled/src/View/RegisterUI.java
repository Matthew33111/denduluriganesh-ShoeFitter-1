package untitled.src.View;

import javax.swing.*;

import untitled.src.Model.Customer;
import untitled.src.Model.CustomerList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterUI extends JFrame{
    private JTextField phoneNumberTextField;
    private JTextField firstNameTextField;
    private JTextField lastNameTextField;
    private JTextField addressTextField;
    private JTextField userNameTextField;
    private JPasswordField passwordField1;
    private JButton registerUserButton;
    private JButton cancelButton;
    private JPanel RegisterPanel;

    CustomerList myList = new CustomerList();

    public RegisterUI() {
        setContentPane(RegisterPanel);
        setTitle("Registration");
        setSize(500, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        registerUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Customer customer = new Customer(phoneNumberTextField.getText(), firstNameTextField.getText(), lastNameTextField.getText(), addressTextField.getText(), userNameTextField.getText(), passwordField1.getText());
                if(myList.authenticateRegistration(customer)){
                    myList.addCustomerList(customer);
                }
                System.out.println(myList.getListOfCustomers());
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
    }
    public void setJb(JButton registerUserButton){this.registerUserButton = registerUserButton;}

    public JButton getJb(){return registerUserButton;}

}
