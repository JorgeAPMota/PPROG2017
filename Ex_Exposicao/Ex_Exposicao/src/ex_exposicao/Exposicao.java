/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_exposicao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author i131345
 */
public class Exposicao implements Comparable{
    
//Deve representar uma exposição através da designação, do ano de realização e dos quadros 
//exibidos.
//
    private String designacao;
    private int anorealizacao;
    
    
    public Exposicao (String designacao, int anorealizacao){
        this.designacao = designacao;
        this.anorealizacao = anorealizacao;
    }

  public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public int getAnorealizacao() {
        return anorealizacao;
    }

    public void setAnorealizacao(int anorealizacao) {
        this.anorealizacao = anorealizacao;
    }


    
//ArrayLista de quadros
List<Quadro> quadros = new ArrayList<>();

//ForEach listarquadros() para percorrer o array:
private static void listarQuadros(List<Quadro> quadros){
    for (Quadro quadro:quadros){
    }
}
    
    
    
//Método equals reescrito
   @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Exposicao other = (Exposicao) obj;
        if (this.anorealizacao != other.anorealizacao) {
            return false;
        }
        if (!Objects.equals(this.designacao, other.designacao)) {
            return false;
        }
        if (!Objects.equals(this.quadros, other.quadros)) {
            return false;
        }
        return true;
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
collections.sort(quadros);




 

  
  
    
    

    
}
