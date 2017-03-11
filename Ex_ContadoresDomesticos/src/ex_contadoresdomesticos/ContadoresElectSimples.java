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
public class ContadoresElectSimples extends ContadoresElectricos {
    
    static float potencia;
    static float limitePotencia = 6.9f;
    static float custo1 = 0.13f;
    static float custo2 = 0.16f;
    static float consumoFinal;
    
    public static final float POTENCIA_POR_OMISSAO = 1;
    
public ContadoresElectSimples (String nomeCliente, int consumo, float potencia) {
    super (nomeCliente, consumo);
    this.potencia = POTENCIA_POR_OMISSAO;
}

    /**
     *
     * @return
     */
    @Override
public float calculoConsumoFinal(){
    if (potencia < limitePotencia)
        consumoFinal = custo1 * consumo;
    else 
        consumoFinal = custo2 * consumo;
return consumoFinal;    
 }
}    

