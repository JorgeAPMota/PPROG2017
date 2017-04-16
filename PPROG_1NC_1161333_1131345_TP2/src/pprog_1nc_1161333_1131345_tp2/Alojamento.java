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

    /**
     * inicializa o nome, endereço, nif e servicoTransfer do Alojamento, com os
     * valores passados por parâmetro
     *
     * @param nome - Nome do objecto (hotel ou hostel) de alojamento
     * @param endereco - Endereço do objecto de alojamento
     * @param nif - Nº de contribuinte do objecto de alojamento
     * @param servicoTransfer - Boolean, retornando true se tiver serviço de
     * transfer, ou false se não tiver
     */
    public Alojamento(String nome, String endereco, int nif, boolean servicoTransfer) {
        super(nome, endereco, nif);
        this.servicoTransfer = servicoTransfer;
    }

    /**
     * inicializa o nome, endereço, nif e servicoTransfer do Alojamento, com os
     * valores por omissão
     */
    public Alojamento() {
        super();
        this.servicoTransfer = SERVICO_POR_OMISSAO;
    }

    /**
     * Método set/modificação para serviçoTransfer
     *
     * @param servicoTransfer
     */
    public void setServicoTransfer(boolean servicoTransfer) {
        this.servicoTransfer = servicoTransfer;
    }

    /**
     * Método toString para imprimir o conteúdo do objecto criado em Alojamento
     *
     * @return - string com os dados do alojamento
     */
    @Override
    public String toString() {
        return super.toString() + "\n  Tem servico de transfer? " + validarServicoTransfer();
    }

    /**
     * Método equals para comparar obj com outro alojamento já criado e com
     * serviço de transfer
     *
     * @param obj - objeto recebido por parâmetro
     * @return - true se os objectos são iguais
     */
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Alojamento outroAlojamento = (Alojamento) obj;
        return this.servicoTransfer == outroAlojamento.servicoTransfer;
    }

    /**
     * Método para Validar Serviço de Transfer
     *
     * @return true se tiver serviço de transfer ou false se não tiver
     */
    @Override
    public boolean validarServicoTransfer() {
        if (servicoTransfer == true) {
            return true;
        } else {
            return false;
        }
    }

}
