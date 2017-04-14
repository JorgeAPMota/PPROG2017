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
public abstract class Alojamento extends EntidadeComNIF implements ServicoAlojamento {

    private boolean servicoTransfer;

    public Alojamento(String nome, String endereco, int nif, boolean servicoTransfer) {
        super(nome, endereco, nif);
        this.servicoTransfer = servicoTransfer;
    }

    public Alojamento() {
        super();
        this.servicoTransfer = SERVICO_POR_OMISSAO;
    }

    public void setServicoTransfer(boolean servicoTransfer) {
        this.servicoTransfer = servicoTransfer;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Tem servico de transfer? " + validarServicoTransfer();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Alojamento outroAlojamento = (Alojamento) obj;
        return this.servicoTransfer == outroAlojamento.servicoTransfer;
    }

    @Override
    public boolean validarServicoTransfer() {
        if (servicoTransfer == true) {
            return true;
        } else {
            return false;
        }
    }

}
