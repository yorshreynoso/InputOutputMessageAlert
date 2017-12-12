
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YORSH
 */
public class PayRollDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String inputString;
        String name;
        int hours;
        
        
        //obtener el nombre del usuario y guardarlo
        name =  JOptionPane.showInputDialog("¿Cual es tu nombre? ");
        
        inputString = JOptionPane.showInputDialog("¿Cuantas horas trabajaste a la semana?");
        
        //convertir el String en enteros, ya que no sirve si se pasa directamente a int
        hours = Integer.parseInt(inputString);
        
        System.out.println("trabajaste " + hours + " horas " + name);
        
        JOptionPane.showMessageDialog(null, "trabajaste " + hours + " horas " + name );
    }
    
}
