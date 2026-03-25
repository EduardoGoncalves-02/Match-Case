/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.profissoes;

import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class Profissoes {

    public static void main(String[] args) {
        String profissao;
        
        profissao = JOptionPane.showInputDialog("""
                                    Qual a profissão de Tibúrcio?
                                    e - Engenheiro
                                    m - Médico
                                    d - Designer
                                    p - Programador
                                    a - Advogado
                                    """);
        char profissaoCHAR = profissao.charAt(0);
        
        switch (profissaoCHAR){
            case 'e':
                JOptionPane.showMessageDialog(null, "A profissão de Tibúrcio é Engenheiro");
                break;
            case 'm':
                JOptionPane.showMessageDialog(null, "A profissão de Tibúrcio é Médico");
                break;
            case 'd':
                JOptionPane.showMessageDialog(null, "A profissão de Tibúrcio é Designer");
                break;
            case 'p':
                JOptionPane.showMessageDialog(null, "A profissão de Tibúrcio é Programador");
                break;
            case 'a':
                JOptionPane.showMessageDialog(null, "A profissão de Tibúrcio é Advogado");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Tibúrcio é DESEMPREGADO");
                break;
        }
    }
}
