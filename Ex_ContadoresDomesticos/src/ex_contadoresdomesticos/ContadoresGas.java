/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_contadoresdomesticos;

/**
 *
 * @author Jorge Mota
 */
public class ContadoresGas extends ContadoresDomesticos {
    
    static float custoUnitario = 0.8f; 
    static float consumoGas;
    static float consumoTotalGas;
    
//  O  custo  do  consumo  de  gás é  dado  pela seguinte  fórmula:  
//  custo  unitário  x  consumo,  sendo  o  custo  unitário  igual  a  0.8€/m3. 
    
    
    
    private float contagemGas(){
    consumoTotalGas=custoUnitario*consumoGas;
        System.out.println("O consumo de gás foi de" + consumoTotalGas); 
        return consumoTotalGas;
}
    
}
