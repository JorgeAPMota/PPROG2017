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
public class TesteEmpregado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
//a) Crie e visualize uma instância de Data para representar a data atual;
    Data datahoje = Data.dataAtual();
    
//b) Crie e visualize duas instâncias de Tempo;
    Tempo tempo1 = new Tempo(21,21,21);
    Tempo tempo2 = new Tempo(42,42,42);
        
//c) Crie duas instâncias de Empregado usando para o efeito as instâncias de Data e de Tempo criadas anteriormente;
    Empregado empregado1 = new Empregado("Joaquim", "Silva", datahoje, 08, 17);
    Empregado empregado2 = new Empregado("Bruno", "Mars", datahoje, 8, 17);
    
    
//d) Teste se os atributos do tipo Data dos empregados criados possuem referências partilhadas;

//e) Teste se os atributos do tipo Tempo dos empregados criados possuem referências partilhadas;

//f) Altere o conteúdo do objeto Data e o conteúdo dos objetos Tempo inicialmente criados;

//g) Visualize as instâncias de Data e de Tempo, bem como as instâncias de Empregado criadas;

//h) Altere a data de contrato e as horas de entrada e de saída do segundo empregado;

//i) Armazene as instâncias de Empregado criadas num contentor de objetos do tipo array;

//j) Liste todos os empregados;

//k) Liste o nome, o número de horas de trabalho por semana e a antiguidade de cada um dos empregados.
    
    
    
    
}
