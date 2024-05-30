/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ceramica;

/**
 *
 * @author alu10825617
 */
public class materialTypes {
    
    private double[] elementos;

    // Constructor
    public materialTypes(double SiO2, double Al2O3, double Fe2O3, double CaO, double MgO, double Na2O, double K2O, double TiO2, double PPC) {
        elementos = new double[9];
        elementos[0] = SiO2;
        elementos[1] = Al2O3;
        elementos[2] = Fe2O3;
        elementos[3] = CaO;
        elementos[4] = MgO;
        elementos[5] = Na2O;
        elementos[6] = K2O;
        elementos[7] = TiO2;
        elementos[8] = PPC;
    }

    // Método para obtener los elementos
    public double[] getElementos() {
        return elementos;
    }
    
    public void materialCalculate() {
        
        double SiO2 = elementos[0];
        double Al2O3 = elementos[1];
        double Fe2O3 = elementos[2];
        double CaO = elementos[3];
        double MgO = elementos[4];
        double Na2O = elementos[5];
        double K2O = elementos[6];
        double TiO2 = elementos[7];
        double PPC = elementos[8];
        
        //ARCILLA ROJA GENERICA
        // ARCILLA ROJA GENÉRICA
        if (SiO2 > 30 && SiO2 < 65) {
            if (Al2O3 > 12 && Al2O3 < 25) {
                if (Fe2O3 > 3.5 && Fe2O3 < 8) {
                    if (MgO > 0.8 && MgO < 3) {
                        if (Na2O > 0.1 && Na2O < 0.9) {
                            if (K2O > 3 && K2O < 5) {
                                if (TiO2 < 1.2) {
                                    System.out.println("El material es arcilla roja genérica.");
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        
        
        
        //ARCILLA BLANCA GENERICA
        if ((SiO2 > 48 && SiO2 < 79) &&
            (Al2O3 > 10 && Al2O3 < 35) &&
            (Fe2O3 > 0.8 && Fe2O3 < 5) &&
            (TiO2 > 0.3 && TiO2 < 2) &&
            (CaO < 0.9) &&
            (MgO < 0.8) &&
            (K2O > 0.7 && K2O < 3.5) &&
            (Na2O > 0.1 && Na2O < 1) &&
            (PPC > 3.5 && PPC < 12)) {
            System.out.println("El material es arcilla blanca.");
        } else {
            System.out.println("El material no es arcilla blanca.");
        }
        
        //
        
    }


    
}
