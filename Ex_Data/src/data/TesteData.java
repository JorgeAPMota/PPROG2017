/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.time.LocalDateTime;
import java.util.Calendar;

/**
 *
 * @author Jorge Mota
 */
public class TesteData {


    
    public static void main(String[] args) {
        
    
    
    /** a) Crie uma instância da classe Data com o nome data1 e que represente a data de hoje.*/
    Data data1 = new Data (23, 2, 2017); 
    
    /**b) Mostre data1 usando o formato por extenso.*/
    System.out.println(data1.toString()); 
    
    /**c) Crie uma outra instância da classe Data chamada data2 que guarde a data 25 de abril de 1974.*/
    Data data2 = new Data (25, 4, 1974);

    /**d)Mostre data2 no formato "ano/mês/dia".*/
    System.out.println(data2.toAnoMesDiaString());
    
    /**e)Utilize o método de instância isMaior para confirmar que, de facto,
    data1 é mais recente do que data2.*/
    System.out.println(data1.isMaior(data2));
    
    /**f)Determine o número de dias entre data1 e data2.*/
    data1.diferenca(data2);    
    
    /**g)Determine  o  número  de  dias  que  faltam  para  o  Natal,  usando  o  método  que  recebe,  por 
parâmetro, o dia, o mês e o ano de uma data.*/
    System.out.println(data1.diferenca(2017,12,25));

    /**h) Determine o dia da semana em que ocorreu o dia 25 de abril de 1974.*/
        System.out.println(data2.diaDaSemana());
        
    /** i)Verifique se o ano 1974 foi bissexto, invocando o método de classe isAnoBissexto: 
             Através do objeto data2;*/ 
            //int ano = data2.getAno();     
            //Data.isAnoBissexto(ano);
            System.out.println(Data.isAnoBissexto(data2.getAno()));
            
         /** Através da classe Data. */
            System.out.println(Data.isAnoBissexto(1974));       
    
    }
}
