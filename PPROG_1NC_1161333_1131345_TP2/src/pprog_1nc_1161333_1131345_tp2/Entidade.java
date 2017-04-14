/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pprog_1nc_1161333_1131345_tp2;

import java.util.Objects;

/**
 * PPROG 2016/2017 Trabalho Prático nº2 - TP2
 *
 * @author 1161333 - Joana Gusmao Guedes
 * @author 1131345 - Jorge Mota
 *
 * @since 17/04/2017
 */
public abstract class Entidade implements ServicoAvaliacao, Comparable<Entidade> {

    private String nome;
    private String endereco;
    private int avaliacao = 0;
    private int contAvaliacoes = 0;

    private static final String NOME_POR_DEFEITO = "sem nome";
    private static final String ENDERECO_POR_DEFEITO = "sem endereco";

    /**
     * Construtor completo para Entidades
     *
     * @param nome - Nome da instancia de Entidades
     * @param endereco - Endereço da instancia de Entidades
     */
    public Entidade(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    /**
     * Construtor vazio
     */
    public Entidade() {
        this.nome = NOME_POR_DEFEITO;
        this.endereco = ENDERECO_POR_DEFEITO;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
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

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setContAvaliacoes(int contAvaliacoes) {
        this.contAvaliacoes = contAvaliacoes;
    }

    @Override
    public String toString() {
        return "\n  nome: " + getNome() + "\n  endereço: " + getEndereco() + "\n  avaliacao média: " + obterAvaliacao();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Entidade outraEntidade = (Entidade) obj;
        return this.nome.equalsIgnoreCase(outraEntidade.nome) && this.endereco.equalsIgnoreCase(outraEntidade.endereco);
    }

    @Override
    public int compareTo(Entidade outraEntidade) {
        String entidadeA = this.getClass().getSimpleName();
        String entidadeB = outraEntidade.getClass().getSimpleName();
        int comparacao = entidadeA.compareTo(entidadeB);
        if (comparacao == 0) { //mesma classe, comparar por nome
            return this.getNome().compareToIgnoreCase(outraEntidade.getNome());
        } else {
            return comparacao; //classes diferentes, usar comparação por classe
        }
    }

    /**
     * Metodo que obtem a media de avaliações de uma instância
     *
     * @return media - média das avaliações da instâmcia
     */
    @Override
    public float obterAvaliacao() {
        if (contAvaliacoes > 0) {
            float media = avaliacao / contAvaliacoes;
            return media;
        } else {
            return 0;
        }
    }

    /**
     * Metodo que recebe um inteiro e actualiza a avaliação da instancia
     * contAvaliacoes conta o total de avaliacoes obtida para cada instancia
     *
     * @param val - inteiro atribuido por utilizador que reflecte a avaliacao feita à
     * entidade
     */
    @Override
    public void atualizarAvaliacao(int val) {
        avaliacao = avaliacao + val;
        ++contAvaliacoes;
    }

}
