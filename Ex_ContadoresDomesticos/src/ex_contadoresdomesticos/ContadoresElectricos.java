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
public abstract class ContadoresElectricos extends ContadoresDomesticos {

    static int totalElectricos;
    
public ContadoresElectricos (String nomeCliente, int consumo){
    super(nomeCliente, consumo, totalElectricos);    
}

public abstract float calculoConsumoFinal();
    
}
