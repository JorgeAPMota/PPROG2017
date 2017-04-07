/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_exposicao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author i131345
 */
public class Exposicao implements Comparable<Exposicao>{
    
//Deve representar uma exposição através da designação, do ano de realização e dos quadros 
//exibidos.
//
    private String designacao;
    private int anorealizacao;
    private int anoRealizacao1;
    private int anoRealizacao2;

    
    //Constructor completo que recebe por parâmetro: a designação da exposição, 
    //o ano de realização e uma lista de quadros
    public Exposicao (String designacao, int anorealizacao, List<Quadro> quadros){
        this.designacao = designacao;
        this.anorealizacao = anorealizacao;
    }

  public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public int getAnoRealizacao() {
        return anorealizacao;
    }

    public void setAnoRealizacao(int anorealizacao) {
        this.anorealizacao = anorealizacao;
    }


    
//ArrayLista de quadros
List<Quadro> quadros = new ArrayList<>();

//ForEach listarquadros() para percorrer o array:
private void listarQuadros(List<Quadro> quadros){
    String quadroTemp = "";
    for (Quadro quadro:quadros){
    quadroTemp = quadroTemp + toString();
    }
}

//CompareTo para comparar Exposicao por ano de realizacao
@Override
    public int compareTo(Exposicao outraExposicao){
        int anoRealizacao1 = this.getAnoRealizacao();
        int anoRealizacao2 = outraExposicao.getAnoRealizacao();
        
        if(anoRealizacao1<anoRealizacao2)
            return -1;
        else if(anoRealizacao1>anoRealizacao2)
            return 1;
        else
            return 0;           
        }
    

    
    

//Método para adicionar a instância de Quadro recebida por parâmetro. Se a operação 
//for bem sucedida, deve retornar true. Caso contrário deve retornar false.
    public boolean adicionaQuadro(Quadro quadro){
        return quadros.add(quadro);
    }
//
//Método para remover a instância de Quadro recebida por parâmetro. Se a operação 
//for bem sucedida, deve retornar true. Caso contrário deve retornar false.
        public boolean removeQuadro(Quadro quadro){
        return quadros.remove(quadro);
    }
//
//O método toString deve descrever os quadros por ordem alfabética dos autores.
//
        
//Deve implementar a interface Comparable para estabelecer uma ordem nas suas instâncias, 
//segundo o ano de realização da exposição.
public void ordenarAnoExposicao(){
        Collections.sort(quadros);
}
  
    
    

    
}
