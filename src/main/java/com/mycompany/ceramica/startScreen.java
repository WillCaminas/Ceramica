/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ceramica;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Guill
 */
public class startScreen extends JFrame{
    
//TextFields
    private JTextField jTextFieldfe2o3;
    private JTextField jTextFieldsio;
    private JTextField jTextFieldal2o;
    private JTextField jTextFieldcao;
    private JTextField jTextFieldmgo;
    private JTextField jTextFieldna2o;
    private JTextField jTextFieldk2o;
    private JTextField jTextFieldtio2;
    private JTextField jTextFieldppc;

//Labels
    private JLabel jLabelfe2o;
    private JLabel jLabelsio;
    private JLabel jLabelal2o;
    private JLabel jLabelcao;
    private JLabel jLabelmgo;
    private JLabel jLabelna2o;
    private JLabel jLabelk2o;
    private JLabel jLabeltio2;
    private JLabel jlabelppc;
    private JLabel jLabelResult;
    
    private JButton jButtonIdentifier;
    
    public startScreen() {
        setTitle("Identificación de arcillas");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
    }

    
    
    
    
    
    public static void main(String[] args) {
        
    }
    
}