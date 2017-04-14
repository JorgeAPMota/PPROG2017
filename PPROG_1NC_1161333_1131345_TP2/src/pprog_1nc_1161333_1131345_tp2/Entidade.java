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
     * Constrói uma instância recebendo nome e endereço
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

    /**
     * devolve o nome da entidade
     *
     * @return o nome da entidade
     */
    public String getNome() {
        return nome;
    }

    /**
     * devolve o endereço da entidade
     *
     * @return o endereço da entidade
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * devolva a avaliação total da entidade
     *
     * @return a avaliação total da entidade
     */
    public int getAvaliacao() {
        return avaliacao;
    }

    /**
     * devolve o contador com nº de avaliações feitas à entidade
     *
     * @return contador com o nº de avaliações feitas à entidade
     */
    public int getContAvaliacoes() {
        return contAvaliacoes;
    }

    /**
     * Define o nome da entidade
     *
     * @param nome o nome da entidade
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * define o endereço da entidade
     *
     * @param endereco o endereço da entidade
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * devolve uma string com o nome, endereço e avaliação média da entidade
     *
     * @return string com o nome, endereço e avaliação média da entidade
     */
    @Override
    public String toString() {
        return "\n  nome: " + getNome() + "\n  endereço: " + getEndereco() + "\n  avaliacao média: " + obterAvaliacao();
    }

    /**
     * compara a entidade com o objecto recebido
     *
     * @param obj o objecto que se compara com a entidade
     * @return true se o objecto recebido representar uma entidade equivalente à
     * entidade. Caso contrário retorna false
     */
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

    /**
     * compara uma entidade com outra entidade recebida por parâmetro
     *
     * @param outraEntidade a ser comparada
     * @return o valor 0 ,se as entidades pertencerem à mesma classe, -1 ou 1 se
     * pertencerem a classes diferentes. Caso pertençam à mesma classe então
     * ordena alfabeticamente, retornando o valor -1 se, alfabeticamente, o nome
     * da entidade for anterior ao nome da outraEntidade; o valor 1 se,
     * alfabeticamente, o nome da entidade for posterior ao nome da
     * outraEntidade, ou 0 se os nomes forem iguais.
     *
     */
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
     * Metodo que obtem a media de todas as avaliações feitas a uma instância
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
     * Metodo que recebe um inteiro e actualiza a avaliação da instancia.
     * contAvaliacoes conta nº total de avaliacoes feitas à instancia
     *
     * @param val - inteiro atribuido por utilizador que reflecte a avaliacao
     * feita à entidade
     */
    @Override
    public void atualizarAvaliacao(int val) {
        avaliacao = avaliacao + val;
        ++contAvaliacoes;
    }

}
