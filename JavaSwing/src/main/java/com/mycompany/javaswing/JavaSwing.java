/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaswing;
import javax.swing.JOptionPane;

/**
 *
 * @author beatriz.miranda
 */
public class JavaSwing {

    public static void main(String[] args) {
         int numero1,numero2,resultado;
        String digitacao = JOptionPane.showInputDialog("informe seu numero 1");
        numero1 = Integer.parseInt(digitacao);
        digitacao = JOptionPane.showInputDialog("informe seu numero 2 ");
        numero2 = Integer.parseInt(digitacao);
        resultado = numero1 + numero2;
        JOptionPane.showMessageDialog(null, "O resultado é " + resultado + "\nParabéns");
    }
}
