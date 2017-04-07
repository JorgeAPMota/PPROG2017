/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_exposicao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author i131345
 */
public class Quadro implements Comparable<Quadro>{
  
    private String autor;
    private String designacao;
    private int ano;
    
    public Quadro (String designacao, String autor, int ano){
        this.designacao = designacao;
        this.autor = autor;
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }
    

    
//Método equals reescrito.

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
        final Quadro other = (Quadro) obj;
        if (this.ano != other.ano) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (!Objects.equals(this.designacao, other.designacao)) {
            return false;
        }
        return true;
    }

//ArrayLista de quadros
List<Quadro> quadros = new ArrayList<>();

//ForEach listarquadros() para percorrer o array:
private static void listarQuadros(List<Quadro> quadros){
    for (Quadro quadro:quadros){
    }
}    
    
//CompareTo para comparar autores
    @Override
    public int compareTo(Quadro outroQuadro){
        String nome1 = this.getAutor();
        String nome2 = outroQuadro.getAutor();
        
        return nome1.compareToIgnoreCase(nome2);
    }
    
//Deve implementar a interface Comparable para estabelecer uma ordem nas suas instâncias, segundo o nome do autor.
public void ordenarAutores(){
        Collections.sort(quadros);
}    
    
}
