/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ceramica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

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
    
    private JButton jButtonIdentifier;
    private materialTypes materialTypes;
    
    public startScreen() {
        setTitle("Identificación de arcillas");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        
        add(jLabelsio = new JLabel("SiO2 %"));
        add(jTextFieldsio = new JTextField(5));
                
        add(jLabelfe2o = new JLabel("Fe2O3 %"));
        add(jTextFieldfe2o3 = new JTextField(5));
        
        add(jLabelal2o = new JLabel("Al2O3 %"));
        add(jTextFieldal2o = new JTextField(5));
        
        add(jLabelcao = new JLabel("CaO %"));
        add(jTextFieldcao = new JTextField(5));
        
        add(jLabelmgo = new JLabel("MgO %"));
        add(jTextFieldmgo = new JTextField(5));
        
        add(jLabelna2o = new JLabel("Na2O %"));
        add(jTextFieldna2o = new JTextField(5));
        
        add(jLabelk2o = new JLabel("K2O %"));
        add(jTextFieldk2o = new JTextField(5));
        
        add(jLabeltio2 = new JLabel("TiO2 %"));
        add(jTextFieldtio2 = new JTextField(5));
        
        add(jlabelppc = new JLabel("PPC %"));
        add(jTextFieldppc = new JTextField(5));
        
        jButtonIdentifier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                materialTypes = new materialTypes(Double.parseDouble(jTextFieldsio.getText()), Double.parseDouble(jTextFieldfe2o3.getText()), Double.parseDouble(jTextFieldal2o.getText()), 
                        Double.parseDouble(jTextFieldcao.getText()), Double.parseDouble(jTextFieldmgo.getText()), Double.parseDouble(jTextFieldna2o.getName()), 
                        Double.parseDouble(jTextFieldk2o.getName()), Double.parseDouble(jTextFieldtio2.getName()), Double.parseDouble(jTextFieldppc.getName()));
                
                materialTypes.materialCalculate();
            }
        });

    }

    
    
    
    
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new startScreen().setVisible(true);
            }
        });
    }
    
}
