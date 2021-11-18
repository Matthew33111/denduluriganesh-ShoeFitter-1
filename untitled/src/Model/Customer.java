package untitled.src.Model;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Customer implements ActionListener{

    private String phoneNumber,fName,lName,address,userName,password;
    public Customer(String phoneNumber, String fName, String lName, String address, String userName, String password) {
        this.phoneNumber = phoneNumber;
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.userName = userName;
        this.password = password;

    }

    public Customer(String s, String s1, String text, String txtPasswordText) {
        phoneNumber = "phoneNumber";
        fName = "firstName";
        lName = "lastName";
        address = "address";
        userName = "userName";
        password = "password";

    }

    public String setAttribute(int n ){
        String attribute = "";

        switch(n){
            case 0:
                attribute = this.phoneNumber;
                break;
            case 1:
                attribute = this.fName;
                break;
            case 2:
                attribute = this.lName;
                break;
            case 3:
                attribute = this.address;
                break;
            case 4:
                attribute = this.userName;
                break;
            case 5:
                attribute = this.password;
                break;
        }
        return attribute;
    }


    public ArrayList<String> setAttributes(){
        ArrayList<String> attributes = new ArrayList();
        for(int i = 0; i < 5; ++i){
            attributes.add(setAttribute(i));
        }
        return attributes;
    }


    public String getAttributeName(int n){
        String name = "";

        switch(n){
            case 0:
                name = "phoneNumber";
                break;
            case 1:
                name = "fName";
                break;
            case 2:
                name = "lName";
                break;
            case 3:
                name = "address";
                break;
            case 4:
                name = "userName";
                break;
            case 5:
                name = "password";
                break;
        }
        return name;
    }


    public ArrayList <String> getAttributeNames(){
        ArrayList<String> names = new ArrayList();
        for(int i = 0; i < 5; ++i){
            names.add(getAttributeName(i));
        }
        return names;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getAddress() {return address; }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return "PhoneNumber: " + getPhoneNumber() + " First Name: " + getFName() + "Last Name: " + getLName() + " Address: " + getAddress() + "UserName: " + getUserName() + "Password: " + getPassword();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}