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
        
        // CAOLÍN
        if (SiO2 > 45 && SiO2 < 60) {
            if (Al2O3 > 25 && Al2O3 < 38) {
                if (Fe2O3 > 0.3 && Fe2O3 < 2) {
                    if (CaO > 0.02 && CaO < 0.22) {
                        if (MgO < 0.4) {
                            if (Na2O > 0.04 && Na2O < 0.8) {
                                if (K2O > 0.5 && K2O < 2.5) {
                                    if (TiO2 < 0.5) {
                                        if (PPC > 8 && PPC < 13.6) {
                                            System.out.println("El material es caolín.");
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        //ARENA FELDESPÁTICA GENÉRICA
        if (SiO2 > 80 && SiO2 < 97) {
            if (Al2O3 > 2 && Al2O3 < 11) {
                if (Fe2O3 > 0.05 && Fe2O3 < 0.15) {
                    if (CaO < 0.08) {
                        if (MgO < 0.2) {
                            if (Na2O > 0.1 && Na2O < 0.6) {
                                if (K2O > 1 && K2O < 4) {
                                    if (TiO2 < 0.03) {
                                        if (PPC < 2) {
                                            System.out.println("El material es desgrasante - arena feldespática genérica.");
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        // CARBONATO CÁLCICO GENERICO
        if (SiO2 > 0.1 && SiO2 < 3) {
            if (Al2O3 < 1) {
                if (Fe2O3 <= 3.5) {
                    if (CaO > 50 && CaO < 56) {
                        if (MgO < 2.5) {
                            if (PPC > 40 && PPC < 45) {
                                System.out.println("El material es carbonato cálcico genérico.");
                                return;
                            }
                        }
                    }
                }
            }
        }

        
        
    }


    
}
