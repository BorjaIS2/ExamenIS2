/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import model.PatrimonialElement;

/**
 *
 * @author Borja
 */
public class PatrimonialView {
    PatrimonialElement element;
    Controller controller;
    
    public PatrimonialView(PatrimonialElement element) {
        this.element = element;
    }

    public PatrimonialView(PatrimonialElement element, Controller controller) {
        this.element = element;
        this.controller = controller;
    }
    
    public PatrimonialElement getPatrimonialElementData(PatrimonialElement element){
        return element;
    }
}
