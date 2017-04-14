/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pprog_1nc_1161333_1131345_tp2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//import java.util.Scanner;

/**
 * PPROG 2016/2017 Trabalho Prático nº2 - TP2
 *
 * @author 1161333 - Joana Gusmao Guedes
 * @author 1131345 - Jorge Mota
 *
 * @since 17/04/2017
 */
public class Teste {

    private static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {

        
        List<Entidade> entidadesBomServico = new ArrayList<>();
        BomServico bomservico = new BomServico("BomServiço", "226578345", 178296416, entidadesBomServico){};

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
        
        bomservico.adicionaEntidade(p4);
        bomservico.adicionaEntidade(h1);
        bomservico.adicionaEntidade(h2);
        bomservico.adicionaEntidade(h3);
        bomservico.adicionaEntidade(ho1);
        bomservico.adicionaEntidade(ho2);
        bomservico.adicionaEntidade(r1);
        bomservico.adicionaEntidade(r2);
        bomservico.adicionaEntidade(r3);
        bomservico.adicionaEntidade(p1);
        bomservico.adicionaEntidade(p2);
        bomservico.adicionaEntidade(p3);
        bomservico.adicionaEntidade(p4);

       
        
//        Hostel ho3 = new Hostel("Hostel out", "Rua do Zambeze, nº33", 627893539, false, "aberto 24h");
//        bomservico.adicionaEntidade(ho3);
//        System.out.println("\nho3 adicionado");
//        bomservico.listar();
//
//        bomservico.removeEntidade(ho3);
//        System.out.println("\nho3 removido");
//        bomservico.listar();
//        
//        Hostel ho4 = new Hostel("Hostel out", "Rua do Zambeze, nº33", 627893539, false, "aberto 24h");
//        bomservico.removeEntidade(ho4);
//        bomservico.listar();

//        bomservico.listaOrdenadaRest(1);
//        bomservico.atualizarAvaliacaoEntidade(ho2, 5);
//        bomservico.obterAvaliacaoEntidade(ho3);


        System.out.println();
        System.out.println("\nInsira o nº correspondente ao tipo de cozinha que procura\n"
                + "     Cozinha Tradicional Portuguesa = 1; \n"
                + "     Cozinha Italiana = 2; \n"
                + "     Cozinha Chinesa = 3; \n"
                + "     Outra = 4; ");
        int tipocozinha = in.nextInt();
        in.nextLine();
        System.out.print("\n### Listagem de preços médios de restaurantes de ");
        switch (tipocozinha) {
            case 1:
                System.out.println("Cozinha Tradicional Portuguesa ###\n");
                break;
            case 2:
                System.out.println("Cozinha Italiana ###\n");
                break;
            case 3:
                System.out.println("Cozinha Chinesa ###\n");
                break;
            case 4:
                System.out.println("Outra Cozinha ###\n");
                break;
        }
        bomservico.listaOrdenadaRest(tipocozinha);
        
        
        String categoria;
        System.out.println("\nInsira o nº de * correspondente à categoria do hotel que pricura\n"
                + "     Uma Estrela = *; \n"
                + "     Duas Estrelas = **; \n"
                + "     Três Estrelas = ***; \n"
                + "     Quatro Estrelas = ****; ");
        categoria = in.nextLine();
        System.out.print("\n### Listagem de hotéis de categoria igual ou superior a ");
        switch (categoria) {
            case "*":
                System.out.print("Uma Estrela");
                break;
            case "**":
                System.out.print("Duas Estrelas");
                break;
            case "***":
                System.out.print("Três Estrelas");
                break;
            case "****":
                System.out.print("Quatro Estrelas");
                break;
        }
        System.out.println(" com serviço de transfer ### ");
        bomservico.listaOrdenadaHoteis(categoria);
        
        
        int grau;
        System.out.print("\nInsira o nº correspondente ao grau de satisfação mínimo do ponto de interesse que procura\n"
                + "        Fraco = 1;\n"
                + "        Razoável = 2; \n"
                + "        Bom = 3;\n"
                + "        Muito Bom = 4;\n"
                + "        Excelente = 5;\n ");
        grau = in.nextInt();
        in.nextLine();
        System.out.println("\n### Listagem de pontos de interesse com grau de satisfação igual ou superior a ");
        switch (grau) {
            case 1:
                System.out.println("Fraco ###\n");
                break;
            case 2:
                System.out.println("Razoável ###\n");
                break;
            case 3:
                System.out.println("Bom ###\n");
                break;
            case 4:
                System.out.println("Muito Bom ###\n");
                break;
            case 5:
                System.out.println("Excelente ###\n");
                break;
        }
        bomservico.listaOrdenadaPI(grau);
        
        
        System.out.print("\n### Listagem das entidades de Bom Serviço agrupadas por Classe e ordenadar alfabeticamente  ###\n");
        Collections.sort(entidadesBomServico);    
        bomservico.listar();
}

}
