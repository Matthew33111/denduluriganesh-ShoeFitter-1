package untitled.src.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import untitled.src.Controller.Controller;
import untitled.src.Model.Customer;
import untitled.src.View.LoginUI;

public class MainFrame extends JFrame{
    private MainFrame mf;
    private JPanel mainPanel;
    private JLabel MainPage;
    private JButton userLoginButton;
    private JButton registerNewUserButton1;
    private LoginUI theLoginUI;
    private RegisterUI ru;
    private LoginUI lu;
    private Controller theLoginCntl;

    public MainFrame(){
        setContentPane(mainPanel);
        setTitle("Main Page");
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        ru = new RegisterUI();
        lu = new LoginUI(theLoginCntl);
/*
        userLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lu.setVisible(true);
            }
        });
*/
        registerNewUserButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ru.setVisible(true);
            }
        });
    }
    
    public void setMainFrame(JButton userLoginButton){this.userLoginButton = userLoginButton;}
    
    public JButton getJb(){return userLoginButton;}

}
