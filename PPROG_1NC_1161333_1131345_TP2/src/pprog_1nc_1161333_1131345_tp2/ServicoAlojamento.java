/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pprog_1nc_1161333_1131345_tp2;

/**
 * PPROG 2016/2017
 * Trabalho Prático nº2 - TP2
 * 
 * @author 1161333 - Joana Gusmao Guedes
 * @author 1131345 - Jorge Mota
 * 
 * @since 17/04/2017
 */
public interface ServicoAlojamento {

    public static final boolean SERVICO_POR_OMISSAO = false;


    /**
     * Valida serviço de Transfer retornando true ou false caso tenha ou não
     * tenha, respectivamente este serviço
     *
     * @return
     */
    public abstract boolean validarServicoTransfer();

}
