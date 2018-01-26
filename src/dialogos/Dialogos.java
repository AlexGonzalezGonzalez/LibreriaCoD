/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogos;

import javax.swing.JOptionPane;

/**
 *Clase dialogos de CoD
 * @author agonzalezgonzalez
 */
public class Dialogos {
    /**
     *Este metodo es un intento de hacer que dependiendo de lo que le metas trabaja con un tipo o otro de variable.
     * Dentro de este metodo hay un switch para los tipos de variables(aun en proceso)
     * 
     */
     

    public static void IntroduceDato() {
        int op = Integer.parseInt("Opcion 1: int, Opcion 2: double");

        switch (op) {
            case 1:
                String entero = "introduce entero";
                JOptionPane.showInputDialog(entero);
                int enteroi = Integer.parseInt(entero);
                System.out.println(enteroi);

            case 2:
                String doubles = "Introduce double";
                JOptionPane.showInputDialog(doubles);
                double doubless = Double.parseDouble(doubles);
                System.out.println(doubless);

        }

    }
    /**
     * 
     * @param pregunta ESta variable es la pregunta a responder para confirmar o denegar.
     * @param titulo Esta variable es el encabezamiento de la pregnta para la confirmacion.
     * 
     * @return Retorna un true o false dependiendo de la respuesta.
     */    
   
    
    
    public static boolean confirmacion(String pregunta, String titulo) {
        int a;
        a = JOptionPane.YES_NO_OPTION;
        JOptionPane.showConfirmDialog(null, pregunta, titulo, a = JOptionPane.YES_NO_OPTION);
        if (a == 1) {
            return true;
        } else {
            return false;
        }

    }
       /**
        * Un metodo al que le mandas un String y te lo retorna.
        * @param mensaje ES el mensajeque le mandamos.
        * @return Retorna el mensaje mandado. 
        */
    public static String msg(String mensaje) {
        mensaje=JOptionPane.showInputDialog(null, "Escriba mensaje que deseee mostrar");
        return mensaje;
    }
}
