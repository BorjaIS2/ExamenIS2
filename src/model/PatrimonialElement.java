/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Borja
 */
public  abstract class PatrimonialElement {
    String name;
    String author;
    int year;
    String fabricationMethod;
    ArrayList<String> material;
    String state;
    //ArrayList<Image> images;
    String location;
    ArrayList<Thematic> thematics;

    public PatrimonialElement(String name, String author, int year, String fabricationMethod, ArrayList<String> material, String state, String location, ArrayList<Thematic> thematics) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.fabricationMethod = fabricationMethod;
        this.material = material;
        this.state = state;
        this.location = location;
        this.thematics = thematics;
    }
    

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getFabricationMethod() {
        return fabricationMethod;
    }

    public ArrayList<String> getMaterial() {
        return material;
    }

    public String getState() {
        return state;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<Thematic> getThematics() {
        return thematics;
    }
    
    public PatrimonialElement getPatrimonialElement() {
        return this;
    } 
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFabricationMethod(String fabricationMethod) {
        this.fabricationMethod = fabricationMethod;
    }

    public void setMaterial(ArrayList<String> material) {
        this.material = material;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setThematics(ArrayList<Thematic> Thematics) {
        this.thematics = thematics;
    }
    
        @Override
    public String toString() {
        return "PatrimonialElement{" + "name=" + name + ", author=" + author + ", year=" + year + ", fabricationMethod=" + fabricationMethod + ", material=" + material + ", state=" + state + ", location=" + location + ", thematics=" + thematics + '}';
    }
    
    
    
    
    
}
