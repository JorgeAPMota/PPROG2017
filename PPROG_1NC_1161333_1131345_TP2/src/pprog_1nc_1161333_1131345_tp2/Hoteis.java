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
public class Hoteis extends Alojamento implements ServicoAlojamento, ServicoHotel{

private boolean servicoGuia;
private boolean servicoSPA;

private static int contHoteis = 0;
    
    @Override
    public boolean validarServicoTransfer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validarServicoGuia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validarServicoSPA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}