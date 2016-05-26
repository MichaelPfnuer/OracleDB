package oracledb;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class OracleDB {

   
    public static void main(String[] args) {
        
       //Start Swing Application
       SwingUtilities.invokeLater(new Runnable() {

        @Override
        public void run() {
            GUI myGUI = new GUI();
            myGUI.setExtendedState(JFrame.MAXIMIZED_BOTH);
           myGUI.setVisible(true);
           
        }
    });
      
    }
    
}
