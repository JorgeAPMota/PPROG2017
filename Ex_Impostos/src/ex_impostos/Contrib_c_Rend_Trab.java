/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_impostos;

/**
 *
 * @author Jorge Mota
 */
public abstract class Contrib_c_Rend_Trab extends Contribuinte {

    public Contrib_c_Rend_Trab(String nomeContribuinte, String morada, int NIF){
        super(nomeContribuinte, morada, NIF);
        
    }
    
    
    
    
    @Override   
    /**
     * 
     * @return 
     */
    public abstract double CalcularImposto();    

}
