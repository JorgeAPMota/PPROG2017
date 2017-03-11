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
public class ContadoresElectBiHorarios extends ContadoresElectricos {

    static float custoEmVazio = 0.066f;
    static float custoForaVazio = 0.14f;
    int consumoForaHorasVazio = 0 ;
    int consumoHorasVazio = consumo;
    static float consumoFinal;
    
public ContadoresElectBiHorarios (String nomeCliente, int consumoHorasVazio , int consumoForaHorasVazio){
    super(nomeCliente, consumoHorasVazio);
    this.nomeCliente = nomeCliente;
    this.consumoHorasVazio = consumoHorasVazio;
    this.consumoForaHorasVazio = consumoForaHorasVazio;
}    
    
@Override
public float calculoConsumoFinal(){
    consumoFinal = (consumoHorasVazio * custoEmVazio) + (consumoForaHorasVazio * custoForaVazio);
return consumoFinal;    
 }

    
}
