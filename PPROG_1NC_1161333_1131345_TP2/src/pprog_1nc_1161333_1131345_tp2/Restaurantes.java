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
public class Restaurantes extends EntidadesComNIF {
    
    private float precoMedio;
    private String tipoComida;
    
    private static int contRestaurantes = 0;
    
    private static final int COZINHA_TRADICIONAL_PORTUGUESA = 1;
    private static final int COZINHA_ITALIANA = 2;    
    private static final int COZINHA_CHINESA = 3;
    private static final int OUTRA = 4;
    
    private static final int TIPO_COMIDA_POR_OMISSAO = 1;
    
}
