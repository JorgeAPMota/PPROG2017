/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empregado;

import utilitarios.Data;
import utilitarios.Tempo;

/**
 *
 * @author Jorge Mota
 */
public class Empregado {
    
    String primeiroNome;
    String ultimoNome;
    Data dataContrato;
    Tempo horaEntrada;
    Tempo horaSaida;
    
    
    public Empregado(String primeiroNome, String ultimoNome, Data dataContrato, Tempo horaEntrada, Tempo horaSaida){
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.dataContrato = new Data(dataContrato);
        this.horaEntrada = new Tempo(horaEntrada);
        this.horaSaida = new Tempo(horaSaida);
        
       
    }
    
    
}
