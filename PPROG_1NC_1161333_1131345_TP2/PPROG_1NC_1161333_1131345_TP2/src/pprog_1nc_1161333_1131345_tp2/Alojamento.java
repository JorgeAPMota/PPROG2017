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

    public boolean isServicoTransfer() {
        return servicoTransfer;
    }

    public void setServicoTransfer(boolean servicoTransfer) {
        this.servicoTransfer = servicoTransfer;
    }

    @Override
    public String toString() {
        return "Alojamento{" +super.toString()+ "servicoTransfer=" + isServicoTransfer() + '}';
    }

    @Override
    public boolean validarServicoTransfer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    

}
