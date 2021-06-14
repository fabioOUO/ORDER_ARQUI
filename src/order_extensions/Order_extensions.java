/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package order_extensions;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.Main;

/**
 *
 * @author fabio
 */
public class Order_extensions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        //coloca como padrão interface graficas igual do windows...
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        
        Main main = new Main();
        main.setVisible(true); 
    }
    
}
