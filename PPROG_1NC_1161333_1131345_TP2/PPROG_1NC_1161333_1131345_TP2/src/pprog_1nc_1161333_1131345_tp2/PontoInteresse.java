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
public class PontoInteresse extends Entidade implements ServicoPontoInteresse {

    private static int categoria;

    private int avaliacao = 0;
    private int contAvaliacoes = 0;

    private static final int CATEGORIA_POR_OMISSAO = 1;

    public PontoInteresse(String nome, String endereco, int categoria) {
        super(nome, endereco);
        this.categoria = categoria;
    }

    public PontoInteresse() {
        super();
        this.categoria = OUTRO;
    }

    public static int getCategoria() {
        return categoria;
    }

    public static String getCategoriaExtenso() {
        if (categoria == 1) {
            return "outro";
        }
        if (categoria == 2) {
            return "Monumento Clássico";
        }
        if (categoria == 3) {
            return "Monumento Contemporâneo";
        }
        if (categoria == 4) {
            return "Praça";
        }
        return "categoria inválida!";
    }

    public static void setCategoria(int categoria) {
        PontoInteresse.categoria = categoria;
    }

    @Override
    public String toString() {
        return "PontoInteresse{" + super.toString() + "categoria " + getCategoriaExtenso() + '}';
    }

    /**
     * Metodo que obtem a media de avaliações de uma instância
     *
     * @return media - média das avaliações da instâmcia
     */
    @Override
    public float obterAvaliacao() {
        float media = avaliacao / contAvaliacoes;
        return media;
    }

    /**
     * Metodo que recebe um inteiro e actualiza a avaliação da instancia
     * contAvaliacoes conta o total de avaliacoes obtida para cada instancia
     *
     * @param val - inteiro atribuido por utilizador que reflecte a avaliacao da
     * entidade
     */
    @Override
    public void atualizarAvaliacao(int val) {
        avaliacao = avaliacao + val;
        ++contAvaliacoes;
    }

}
