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
public abstract class EntidadeComNIF extends Entidade {

    private int nif;

    private static final int NIF_POR_DEFEITO = 0;

    public EntidadeComNIF(String nome, String endereco, int nif) {
        super(nome, endereco);
        this.nif = nif;
    }

    public EntidadeComNIF() {
        super();
        this.nif = NIF_POR_DEFEITO;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  nif: " + nif;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        EntidadeComNIF outroEntNIF = (EntidadeComNIF) obj;
        return this.nif == outroEntNIF.nif;
    }
}
