/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.PatrimonialElement;
import model.Thematic;
import view.PatrimonialView;

/**
 *
 * @author Borja
 */
public class Controller {
    
    PatrimonialElement element;
    PatrimonialView view;

    public Controller(PatrimonialElement element, PatrimonialView view) {
        this.element = element;
        this.view = view;
    }
    
    public void execute(){
    }
    
    public ArrayList<PatrimonialElement> sortThematic(Thematic thematic) {
        return new ArrayList<PatrimonialElement>();
    }
    
    public ArrayList<PatrimonialElement> sortList() {
        return new ArrayList<PatrimonialElement>();
    }
    
    public void viewPatrimonialElement(PatrimonialElement element) {
    }
    
}
