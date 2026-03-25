/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class Calculadora {

    public static void main(String[] args) {
        double a, b, resultado;
        int operacao;
        
        operacao = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                  Digite a Operação a ser feita: 
                                                                  1 - Soma
                                                                  2 - Subtração
                                                                  3 - Multiplicação
                                                                  4 - Divisão"""));
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
        
        switch (operacao){
        
            case 1: 
                resultado = a + b;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;
            case 2: 
                resultado = a - b;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;
            case 3: 
                resultado = a * b;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;
            case 4: 
                resultado = a / b;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Não há uma opção com essa entrada");
                break;
        }
    }
}
