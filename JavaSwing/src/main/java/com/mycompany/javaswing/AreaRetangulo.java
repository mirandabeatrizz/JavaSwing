/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaswing;
import javax.swing.JOptionPane;


/**
 *
 * @author beatriz.miranda
 */
public class AreaRetangulo {
    public static void main(String[] args) {
        double lado1, lado2, resultado;
        String leia = JOptionPane.showInputDialog("Digite o primeiro lado do retangulo: ");
        lado1 =  Double.parseDouble(leia);
        leia = JOptionPane.showInputDialog("Digite o primeiro lado do retangulo: ");
        lado2 =  Double.parseDouble(leia);
        
        resultado = lado1*lado2;
        
       JOptionPane.showMessageDialog(null, "A área do retangulo é igual a: " +resultado);
        
        
    }
    
}
