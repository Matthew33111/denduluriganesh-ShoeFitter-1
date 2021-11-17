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

    public Customer() {
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

        }
        return attribute;
    }


    public ArrayList<String> setAttributes(){
        ArrayList<String> attributes = new ArrayList();
        for(int i = 0; i < 2; ++i){
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
                name = "name";
                break;
            case 2:
                name = "address";
                break;
        }
        return name;
    }


    public ArrayList <String> getAttributeNames(){
        ArrayList<String> names = new ArrayList();
        for(int i = 0; i < 2; ++i){
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {return address; }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return "PhoneNumber: " + getPhoneNumber() + " Name: " + getName() + " Address:" + getAddress();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}