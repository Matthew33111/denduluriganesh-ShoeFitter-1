package untitled.src.View;

import untitled.src.Model.Customer;
import untitled.src.Model.CustomerList;
import untitled.src.Controller.Controller;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountUI extends JFrame{
    private JButton updateInformationButton;
    private JButton cancelButton;
    private JButton deleteUserButton;
    private JTextField LastNameField;
    private JTextField FirstNameField;
    private JTextField AddressField;
    private JTextField UserNameField;
    private JPasswordField passwordField1;
    private JTextField PhoneNumberField;
    private JPanel AccountUIFrame;
    public Controller userList;

    CustomerList myList = new CustomerList();

    public AccountUI(){
        setContentPane(AccountUIFrame);
        setTitle("Main Menu");
        setSize(500, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        updateInformationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Customer customer = new Customer(PhoneNumberField.getText(), FirstNameField.getText(), LastNameField.getText(), AddressField.getText(), UserNameField.getText(), passwordField1.getText());
                CustomerList myUser = new CustomerList();
                userList.getUser();
                int i = userList.hashCode();
                myList.editCustomerList(i, customer);
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

}
