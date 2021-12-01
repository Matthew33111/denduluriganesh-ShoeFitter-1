package untitled.src.View;

import untitled.src.Controller.Controller;
import untitled.src.Model.Customer;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginUI extends JFrame{

    private Controller theLoginCntl;
    private JPanel panel1;
    private JLabel lblUserName;
    private JLabel lblPassword;
    private JTextField txtUserName;
    private JTextField txtPassword;
    private JButton btnCancel;
    private JButton btnLogin;

    public LoginUI(Controller loginCntl){
        this.theLoginCntl = loginCntl;
        this.add(panel1);
        this.setSize(400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Customer customer = new Customer("", "", "", "", txtUserName.getText(), txtPassword.getText());
                theLoginCntl.requestAuthenticate(customer);
            }
        });
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
    }
}
