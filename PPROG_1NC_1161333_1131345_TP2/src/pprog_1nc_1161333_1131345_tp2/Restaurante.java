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

    public int getTipoComida() {
        return tipoComida;
    }

    private String getTipoComidaExtenso() {
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
        return "- Restaurante" + super.toString() + "\n  preço médio por pessoa: " + obterPrecoMedioPorPessoa() + "\n  tipo de comida: " + getTipoComidaExtenso() + "\n";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Restaurante outroRest = (Restaurante) obj;
        return this.precoMedio == outroRest.precoMedio && this.tipoComida==outroRest.tipoComida;
    }

    @Override
    public float obterPrecoMedioPorPessoa() {
        return precoMedio;
    }

}
