/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author 10724270619
 */
import javax.swing.JOptionPane;
import model.Triangulo;

public class Principal {
    public static void main (String [] args) {
        //Declara a instância o objeto
        Triangulo tri1 = new Triangulo();
        
        //Entrada
        tri1.setBase(Double.parseDouble(JOptionPane.
                showInputDialog("Digite a base do triângulo")));
        tri1.setAltura(Double.parseDouble(JOptionPane.
                showInputDialog("Digite a altura do triângulo")));
        
        //Saida
        JOptionPane.showMessageDialog(null,"A área do triângulo é " + tri1);
               
    }
    
}
