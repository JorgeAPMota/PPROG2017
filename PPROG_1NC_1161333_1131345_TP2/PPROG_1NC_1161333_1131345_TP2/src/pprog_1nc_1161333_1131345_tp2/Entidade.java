/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pprog_1nc_1161333_1131345_tp2;


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
        super();
        this.nome = NOME_POR_DEFEITO;
        this.endereco = ENDERECO_POR_DEFEITO;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Entidade{" + "nome=" + getNome() + ", endereco=" + getEndereco() + ", avaliacao média=" + obterAvaliacao() + '}';
    }

    @Override
    public int compareTo(Entidade outraEntidade) {

        String nome1 = this.getNome();
        String nome2 = outraEntidade.getNome();

        return nome1.compareToIgnoreCase(nome2);

    }

    @Override
    public abstract float obterAvaliacao();

    @Override
    public abstract void atualizarAvaliacao(int val);

}

