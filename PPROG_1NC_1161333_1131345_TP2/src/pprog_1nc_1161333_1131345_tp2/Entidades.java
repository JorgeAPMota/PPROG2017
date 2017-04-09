/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pprog_1nc_1161333_1131345_tp2;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;

/**
 * PPROG 2016/2017 Trabalho Prático nº2 - TP2
 *
 * @author 1161333 - Joana Gusmao Guedes
 * @author 1131345 - Jorge Mota
 *
 * @since 17/04/2017
 */
public class Entidades implements ServicoAvaliacao, Comparator<Entidades>{

    private String nome;
    private String endereco;
    
    private final String NOME_POR_DEFEITO = "sem nome";
    private final String ENDERECO_POR_DEFEITO = "sem endereco";
    
    private int avaliacao = 0;
    private int contAvaliacoes = 0;

    
    /**
     * Constuctor completo para Entidades
     * @param nome - Nome da instancia de Entidades
     * @param Endereco - Endereço da instancia de Entidades
     */
    public Entidades(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    /**
     * Constructor vazio 
     */
    public Entidades(){
        this.nome = NOME_POR_DEFEITO;
        this.endereco = ENDERECO_POR_DEFEITO;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNOME_POR_DEFEITO() {
        return NOME_POR_DEFEITO;
    }

    public String getENDERECO_POR_DEFEITO() {
        return ENDERECO_POR_DEFEITO;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public int getContAvaliacoes() {
        return contAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Entidades{" + "nome=" + nome + ", endereco=" + endereco + ", NOME_POR_DEFEITO=" + NOME_POR_DEFEITO + ", ENDERECO_POR_DEFEITO=" + ENDERECO_POR_DEFEITO + ", avaliacao=" + avaliacao + ", contAvaliacoes=" + contAvaliacoes + '}';
    }

        
    
    /**
     * Metodo que obtem a media de avaliações de uma instância de Entidades
     * @return 
     */
    @Override
    public float obterAvaliacao() {
        float media = avaliacao / contAvaliacoes;
        return media;
    }
    
    /**
     * Metodo que recebe um inteiro e actualiza a avaliação da instancia de entidades
     * contAvaliacoes conta o total de avaliacoes obtida para cada instancia
     * @param val - inteiro atribuido por utilizador que reflecte a avaliacao da entidade
     */
    @Override
    public void atualizarAvaliacao(int val) {
        avaliacao = avaliacao + val;
        ++contAvaliacoes;        
    }

        //criterio1  Classe da instancia de Entidades
     Comparator<Entidades> criterio1 = new Comparator<Entidades>() {

    @Override
    public int compare(Entidades entidade1, Entidades entidade2){

                if (entidade1.getNome < entidade2.getNome) {
                    return -1;
                } else if (entidade1.getNome > entidade2.getNome()) {
                    return 1;
                } else {
                    return 0;
                } 
    }
    
    
    
}
