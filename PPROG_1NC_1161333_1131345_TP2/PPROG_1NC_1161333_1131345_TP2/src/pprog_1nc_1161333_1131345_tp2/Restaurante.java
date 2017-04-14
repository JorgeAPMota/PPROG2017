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
public class Restaurante extends EntidadeComNIF implements ServicoPrecoMedio, ServicoRestaurante {

    private float precoMedio;
    private int tipoComida;
    private int avaliacao = 0;
    private int contAvaliacoes = 0;

//    private static final int TIPO_COMIDA_POR_OMISSAO = 1;
    private static final int PRECO_MEDIO_POR_OMISSAO = 0;

    public Restaurante(String nome, String endereco, int nif, float precoMedio, int tipoComida) {
        super(nome, endereco, nif);
        this.precoMedio = precoMedio;
        this.tipoComida = tipoComida;
    }

    public Restaurante() {
        super();
        this.precoMedio = PRECO_MEDIO_POR_OMISSAO;
        this.tipoComida = COZINHA_TRADICIONAL_PORTUGUESA;
    }

    public float getPrecoMedio() {
        return precoMedio;
    }

    public int getTipoComida() {
        return tipoComida;
    }

    public String getTipoComidaExtenso() {
        if (tipoComida == 1) {
            return "Cozinha tradicional Portuguesa";
        }
        if (tipoComida == 2) {
            return "Cozinha Italiana";
        }
        if (tipoComida == 3) {
            return "Cozinha Chinesa";
        }
        if (tipoComida == 4) {
            return "Outra";
        }
        return "categoria inválida!";
    }

    public void setPrecoMedio(float precoMedio) {
        this.precoMedio = precoMedio;
    }

    public void setTipoComida(int tipoComida) {
        this.tipoComida = tipoComida;
    }

    @Override
    public String toString() {
        return "Restaurante{" + super.toString() + "precoMedio=" + getPrecoMedio() + ", tipoComida=" + getTipoComidaExtenso() + '}';
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

    @Override
    public float obterPrecoMedioPorPessoa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}



