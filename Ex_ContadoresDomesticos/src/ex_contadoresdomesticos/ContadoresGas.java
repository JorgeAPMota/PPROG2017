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
public class ContadoresGas extends ContadoresDomesticos{
    
    static float custoUnitario = 0.8f; 
    static float consumoTotalGas; 
    /**Variável para contabilizar os contadores a gas*/
    static int totalGas = 0;
    
    
//  O  custo  do  consumo  de  gás é  dado  pela seguinte  fórmula:  
//  custo  unitário  x  consumo,  sendo  o  custo  unitário  igual  a  0.8€/m3. 
    
    /** Constructor completo do ContadorGas
     * 
     * @param nomeCliente
     * @param consumo 
     */
    public ContadoresGas (String nomeCliente, int consumo){
        super(nomeCliente, consumo, "GAS-" + ++totalGas);
    }
    
    
    private float contagemGas(){
    consumoTotalGas=custoUnitario*consumo;
        System.out.println("O consumo de gás foi de" + consumoTotalGas + "€"); 
        return consumoTotalGas;
}
    
}
