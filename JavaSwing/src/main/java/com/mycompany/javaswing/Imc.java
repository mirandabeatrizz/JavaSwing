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
public class Imc {
    public static void main(String[] args) {
        double peso, altura, imc;
        String digita = JOptionPane.showInputDialog("Informe seu peso");
        peso = Double.parseDouble(digita);//Double maiusculo é a classe minusculo é o tipo
        digita = JOptionPane.showInputDialog("Informe sua altura: ");
        altura = Double.parseDouble(digita);
        
        imc = peso/(altura*altura);
        
        JOptionPane.showMessageDialog(null, "O resultado do IMC é: "+imc);
    }
}
