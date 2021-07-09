/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author Borja
 */
public class PatrimonialListView {
    
    ArrayList<PatrimonialElement> list;
    Controller controller;

    public PatrimonialListView(ArrayList<PatrimonialElement> list, Controller controller) {
        this.list = list;
        this.controller = controller;
    }

    public ArrayList<PatrimonialElement> getPatrimonialList  (Thematic thematic) {
        return list;
    }
    
    
    
}
