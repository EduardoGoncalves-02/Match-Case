/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.descontos;

import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class Descontos {

    public static void main(String[] args) {
        double preco, precoFinal;
        String nome, categoria;

        nome = JOptionPane.showInputDialog("Informe o nome do cliente: ");
        preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto: "));
        categoria = JOptionPane.showInputDialog("""
                                                Categoria do produto:
                                                a - 10% de desconto.
                                                b - 15% de desconto.
                                                c - 20% de desconto.
                                                d - 25% de desconto.
                                                e - 50% de desconto.
                                                """);
        char categoriaCHAR = categoria.charAt(0);

        switch (categoriaCHAR) {
            case 'a':
                precoFinal = preco - (preco * 0.1);
                JOptionPane.showMessageDialog(null, "Preço final: " + precoFinal);
                break;
            case 'b':
                precoFinal = preco - (preco * 0.15);
                JOptionPane.showMessageDialog(null, "Preço final: " + precoFinal);
                break;
            case 'c':
                precoFinal = preco - (preco * 0.2);
                JOptionPane.showMessageDialog(null, "Preço final: " + precoFinal);
                break;
            case 'd':
                precoFinal = preco - (preco * 0.25);
                JOptionPane.showMessageDialog(null, "Preço final: " + precoFinal);
                break;
            case 'e':
                precoFinal = preco - (preco * 0.5);
                JOptionPane.showMessageDialog(null, "Preço final: " + precoFinal);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Categoria Inválida");
        }

    }
}
