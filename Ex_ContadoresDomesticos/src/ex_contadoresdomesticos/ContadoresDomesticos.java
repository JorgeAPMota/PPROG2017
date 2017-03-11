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

public abstract class ContadoresDomesticos {

   public String nomeCliente;
   public int identificador; 
   public int consumo;
   public int mes;
   
   public static final int IDENTIFICADOR_POR_OMISSAO = 0;
   public static final int CONSUMO_POR_OMISSAO = 0;
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    /**
     * Constructor cheio do contador.
     *
     * @param identificador o nr do contador
     * @param consumo 
     * @param nomeCliente
     */
    public ContadoresDomesticos(String nomeCliente, int consumo, int identificador ) {
        this.nomeCliente = nomeCliente;
        this.consumo = consumo;
        this.identificador = identificador;
    }
    
    /**
     *Constructor vazio do contador
     *  
     */
    public ContadoresDomesticos(){
        identificador = IDENTIFICADOR_POR_OMISSAO;
        consumo = CONSUMO_POR_OMISSAO;
    }
    
    public abstract float calculoConsumoFinal();
    
    
}
    

