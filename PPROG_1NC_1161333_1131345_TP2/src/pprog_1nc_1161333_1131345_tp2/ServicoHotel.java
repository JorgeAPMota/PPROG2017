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
public interface ServicoHotel extends ServicoAlojamento {

    public static final String UMA_ESTRELA = "*";
    public static final String DUAS_ESTRELAS = "**";
    public static final String TRES_ESTRELAS = "***";
    public static final String QUATRO_ESTRELAS = "****";
    public static final String CINCO_ESTRELAS = "*****";
    public static final String CATEGORIA_POR_OMISSAO = UMA_ESTRELA;


    public abstract boolean validarServicoGuia();
    

    public abstract boolean validarServicoSPA();
}
