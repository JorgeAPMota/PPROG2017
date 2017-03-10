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
    
public ContadoresElectBiHorarios (String nome, int consumoHorasVazio , int consumoForaHorasVazio){
    super(nome, consumoHorasVazio);
    this.consumoForaHorasVazio = consumoForaHorasVazio;
}    
    

    
}
