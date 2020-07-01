/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesaje;

import javax.swing.*;

/**
 *
 * @author Notebook
 */
public class Mesaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Mensaje
        
// Mensaje con alerta
        // JOptionPane.INFORMATION_MESSAGE.
        // JOptionPane.WARNING_MESSAGE.
        // JOptionPane.ERROR_MESSAGE.
        // JOptionPane.QUESTION_MESSAGE.
        // JOptionPane.PLAIN_MESSAGE.
       
        JOptionPane.showMessageDialog(null,"Esto es un simple mensaje");
        
        JOptionPane.showMessageDialog(null,"Este es un mensaje de Advertencia","TITULO",JOptionPane.ERROR_MESSAGE);
        
        
    }
    
}
