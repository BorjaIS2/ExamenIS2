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
public class Statue extends PatrimonialElement {

    public Statue(String name, String author, int year, String fabricationMethod, ArrayList<String> material, String state, String location, ArrayList<Thematic> thematics) {
        super(name, author, year, fabricationMethod, material, state, location, thematics);
    }
    
}
