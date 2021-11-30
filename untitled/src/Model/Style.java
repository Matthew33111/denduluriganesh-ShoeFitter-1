package untitled.src.Model;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Style implements ActionListener{

        private String color,model,brand,material,sole,size;
        public Style(String color, String model, String brand,String material, String sole, String size) {
            this.color = color;
            this.model = model;
            this.brand = brand;
            this.material = material;
            this.sole = sole;
            this.size = size;
        }

        public Style() {
            color = "color";
            model = "model";
            brand = "brand";
            material = "material";
            sole = "sole";
            size = "size";
        }


    public String setAttribute(int n ){
        String attribute = "";

        switch(n){
            case 0:
                attribute = this.color;
                break;
            case 1:
                attribute = this.model;
                break;
            case 2:
                attribute = this.brand;
                break;
            case 3:
                attribute = this.material;
                break;
            case 4:
                attribute = this.sole;
                break;
            case 5:
                attribute = this.size;
                break;
        }
        return attribute;
    }


    public ArrayList<String> setAttributes(){
        ArrayList<String> attributes = new ArrayList();
        for(int i = 0; i < 6; ++i){
            attributes.add(setAttribute(i));
        }
        return attributes;
    }


    public String getAttributeName(int n){
        String name = "";

        switch(n){
            case 0:
                name = "color";
                break;
            case 1:
                name = "model";
                break;
            case 2:
                name = "brand";
                break;
            case 3:
                name = "material";
                break;
            case 4:
                name = "sole";
                break;
            case 5:
                name = "size";
                break;
        }
        return name;
    }



    public ArrayList <String> getAttributeNames(){
        ArrayList<String> names = new ArrayList();
        for(int i = 0; i < 6; ++i){
            names.add(getAttributeName(i));
        }
        return names;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getMaterial() {return material; }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getSole() {
            return sole;
        }

        public void setSole(String sole) {
            this.sole = sole;
        }

        public String getSize() {
        return size;
    }

        public void setSize(String size) {
        this.size = size;
    }

        @Override
        public String toString(){
            return "Color: " + getColor() + " Model: " + getModel() + " Brand: " + getBrand() + " Material: " +
                    getMaterial() + " Sole: " + getSole() + " Size:" +getSize();
        }


}

