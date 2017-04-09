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
public interface ServicoAvaliacao {

    public static final int FRACO = 1;
    public static final int RAZOAVEL = 2;
    public static final int BOM = 3;
    public static final int MUITO_BOM = 4;
    public static final int EXCELENTE = 5;

    public abstract float obterAvaliacao();

    public abstract void atualizarAvaliacao (int val);

}
