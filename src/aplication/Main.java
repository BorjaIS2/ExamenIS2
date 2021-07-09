/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplication;

import controller.Controller;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.Statue;
import model.Thematic;
import model.Thematic.thematic;
import view.PatrimonialView;

/**
 *
 * @author Borja
 */
public class Main {
    
    public static void main(String[] args) {
        try {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
        }
        
  Statue patrimonialElement = new Statue("David", "Miguel Angel",1501,"manual",("Marmol"),"buen estado","Florencia,Venecia",(Thematic.thematic.art));
  PatrimonialView view = new PatrimonialView(patrimonialElement);
  Controller controller = new Controller(patrimonialElement, view);
  controller.execute();
    }
    
}
