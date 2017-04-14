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
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Hotel h1 = new Hotel("Hotel Marlindo", "Rua da Marginal, nº72", 134278476, true, Hotel.CINCO_ESTRELAS, true, true);
    Hotel h2 = new Hotel("Hotel Sol e Mar", "Passeio Alegre, nº14", 763908724, false, Hotel.TRES_ESTRELAS, false, true);
    Hotel h3 = new Hotel("Hotel Montanha branca", "Rua Pico da Serra, nº15", 946123926, true, Hotel.DUAS_ESTRELAS, false, false);
    
    Hostel ho1 = new Hostel("Hostel inn", "Rua da Picaria, nº26", 638924539, true, "aberto 24h");
    Hostel ho2 = new Hostel("Poets Hostel", "Rua Sto Ildefonso, nº89", 629830814, false, "aberto das 10h às 22h");
    
    Restaurante r1 = new Restaurante("Paparoca", "Avenida Brasil, nº66", 156488299, 35.5f, Restaurante.COZINHA_TRADICIONAL_PORTUGUESA);
    Restaurante r2 = new Restaurante("xixuan", "Rua da Constituição, nº25", 256389640, 12.7f, Restaurante.COZINHA_CHINESA);
    Restaurante r3 = new Restaurante("Ciao Bella!", "Rua Costa Cabral, nº356", 628040345, 17.3f, Restaurante.COZINHA_ITALIANA);
    
    PontoInteresse p1 = new PontoInteresse("Miradouro da Fé", "Rua Sta Catarina", PontoInteresse.OUTRO);
    PontoInteresse p2 = new PontoInteresse("Mosteiro de Leça do Balio", "Rua do Mosteiro, nº7", PontoInteresse.MONUMENTO_CLASSICO);
    PontoInteresse p3 = new PontoInteresse("Museu de Serralves", "Av Marechal Gomes da Costa, nº519", PontoInteresse.MONUMENTO_CONTEMPORANEO);
    PontoInteresse p4 = new PontoInteresse("Sé do Porto", "Rua da Sé, nº216", PontoInteresse.MONUMENTO_CLASSICO);
    
    
    
    
    }
}
          
   
        
    
    

