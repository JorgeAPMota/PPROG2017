/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pprog_1nc_1161333_1131345_tp2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * PPROG 2016/2017 Trabalho Prático nº2 - TP2
 *
 * @author 1161333 - Joana Gusmao Guedes
 * @author 1131345 - Jorge Mota
 *
 * @since 17/04/2017
 */
public class BomServico {

    private String nome;
    private String telefone;
    private int NIF;

    //ArrayList para entidades de BomServico
    List<Entidade> entidadesBomServico = new ArrayList<>();
    //ArrayLists para cada tipo de entidade BomServiço
    List<PontoInteresse> pontosInteresse = new ArrayList<>();
    List<Restaurante> restaurantes = new ArrayList<>();
    List<Hotel> hoteis = new ArrayList<>();
    List<Hostel> hostels = new ArrayList<>();

    /**
     * Construtor completo da instancia BomServico
     *
     * @param nome
     * @param telefone
     * @param NIF
     * @param entidadesBomServico - Array que ocntem todas as entidades da
     * empresa BomServiço
     */
    public BomServico(String nome, String telefone, int NIF, List<Entidade> entidadesBomServico) {
        this.nome = nome;
        this.telefone = telefone;
        this.NIF = NIF;
        this.entidadesBomServico = entidadesBomServico;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getNIF() {
        return NIF;
    }

    public List<Entidade> getEntidadesBomServico() {
        return entidadesBomServico;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

    /**
     * Método For Each que vai percorrer o array de entidadesBomServico
     *
     * @param entidadesBomServico - Array com as entidades da empresa Bom
     * Serviço
     */
    public static void listarEntidadesBomServico(List entidadesBomServico) {
        for (Object elemento : entidadesBomServico) {
            System.out.println(elemento.toString());
        }
    }

    //ver se é possível fazer de outra forma.
    public float obterAvaliacao(Entidade entidade) {
        return entidade.obterAvaliacao();
    }

    //Método para adicionar a instância de Entidade recebida por parâmetro. Se a operação 
    //for bem sucedida, deve retornar true. Caso contrário deve retornar false.
    public boolean adicionaEntidade(Entidade entidade) {
        return entidadesBomServico.add(entidade);
    }

    //Método para remover a instância de Entidade recebida por parâmetro. Se a operação 
    //for bem sucedida, deve retornar true. Caso contrário deve retornar false.
    public boolean removeEntidade(Entidade entidade) {
        return entidadesBomServico.remove(entidade);
    }

    public void subdividirArrayEntidades(List entidadesBomServico) {
        for (Object elemento : entidadesBomServico) {
            if (elemento instanceof PontoInteresse) {
                pontosInteresse.add((PontoInteresse) elemento);
            }
            if (elemento instanceof Restaurante) {
                restaurantes.add((Restaurante) elemento);
            }
            if (elemento instanceof Hotel) {
                hoteis.add((Hotel) elemento);
            }
            if (elemento instanceof Hostel) {
                hostels.add((Hostel) elemento);
            }
        }
    }

    Scanner in = new Scanner(System.in);
    
        public void listaOrdenadaRest(List<Restaurante> restaurantes) {
        int tipoCozinha;
        System.out.println("Insira o nº correspondente ao tipo de cozinha que procura\n"+
        "     Cozinha Tradicional Portuguesa = 1; \n"+
        "     Cozinha Italiana = 2; \n"+
        "     Cozinha Chinesa = 3; \n"+
        "     Outra = 4; ");
        System.out.println();
        tipoCozinha = in.nextInt();

        for (Restaurante elemento : restaurantes) {
            if (elemento.getTipoComida() == tipoCozinha) {
                System.out.println(elemento.toString());
            }
        }
    }

        
        public void listaOrdenadaHoteis(List<Hotel> hoteis) {
        String categoria;
        System.out.println("Insira o nº de * correspondente à categoria do hotel que pricura\n"+
        "     Uma Estrela = *; \n"+
        "     Duas Estrelas = **; \n"+
        "     Três Estrelas = ***; \n"+
        "     Quatro Estrelas = ****; ");
        System.out.println();
        categoria = in.nextLine();

        for (Hotel elemento : hoteis) {
            if (elemento.getCategoria().equalsIgnoreCase(categoria) && elemento.validarServicoTransfer()) {
                System.out.println(elemento.toString());
            }
        }
    }
         
         
    public void listaOrdenadaPI(List<PontoInteresse> pontosInteresse) {
        int grau;
        System.out.println("Insira o nº correspondente ao grau de satisfação mínimo do ponto de interesse que procura\n"+ 
"        Fraco = 1;\n" +
"        Razoáveln" +
"        Bom = 3;\n" +
"        Muito Bom = 4;\n" +
"        Excelente = 5; "); 
        
        System.out.println();
        grau = in.nextInt();

        for (PontoInteresse elemento : pontosInteresse) {
            if (elemento.obterAvaliacao() >= grau) {
                System.out.println(elemento.toString());
            }
        }
    }

}
