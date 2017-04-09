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
public class Entidades implements ServicoAvaliacao {

    private String nome;
    private String Endereco;

    private int avaliacao = 0;
    private int contAvaliacoes = 0;

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
    
    
    
}
