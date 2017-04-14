/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pprog_1nc_1161333_1131345_tp2;

import java.util.ArrayList;
import java.util.Collections;
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

    /**
     * Construtor completo da instancia BomServico
     *
     * @param nome - Atributo nome de uma instancia de Bom Serviço
     * @param telefone - Telefone de uma entidade de Bom Serviço
     * @param NIF - Nº de contribuinte de um objecto de Bom Serviço
     * @param entidadesBomServico - Array que ocntem todas as entidades da
     * empresa BomServiço
     */
    public BomServico(String nome, String telefone, int NIF, List<Entidade> entidadesBomServico) {
        this.nome = nome;
        this.telefone = telefone;
        this.NIF = NIF;
        this.entidadesBomServico = entidadesBomServico;
    }

    /**
     * Método get/acesso para o atributo nome de um objecto de BomServiço
     * @return nome, atributo nome de BomServiço
     */
    public String getNome() {
        return nome;
    }

     /**
     * Método get/acesso para o atributo telefone de um objecto de BomServiço
     * @return telefone, atributo telefone de BomServiço
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Método get/acesso para o atributo NIF (nº de contribuinte) de um objecto de BomServiço
     * @return NIF, atributo NIF (nº de contribuinte) de BomServiço
     */
    public int getNIF() {
        return NIF;
    }

     /**
     * Método set/modificação para o atributo nome de um objecto de BomServiço
     * @param nome - atributo nome de BomServiço
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

     /**
     * Método set/modificação para o atributo telefone de um objecto de BomServiço
     * @param telefone - atributo telefone de BomServiço
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

     /**
     * Método set/modificação para o atributo telefone de um objecto de BomServiço
     * @param telefone - atributo telefone de BomServiço
     */
    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

     /**
     * Método set/modificação para o ArrayList entidadesBomServico de um objecto de BomServiço
     * @param entidadesBomServico - arraylist de BomServiço
     */
    public void setEntidadesBomServico(List<Entidade> entidadesBomServico) {
        this.entidadesBomServico = entidadesBomServico;
    }

    /**
     * Método toString para imprimir o conteúdo do objecto criado em BomServiço
     * @return - string com nome, telefone e nif
     */
    @Override
    public String toString() {
        return "- Empresa Bom Servico" + "\n  nome: " + nome + "\n  telefone: " + telefone + "\n  NIF: " + NIF + "\n  Lista de entidades de Bom Servico:\n " + entidadesBomServico.toString();
    }

    /**
     * Método que percorre o ArrayList entidadesBomServico e imprime
     */
    public void listar() {
        for (Entidade elemento : entidadesBomServico) {
            System.out.println(elemento.toString());
        }
    }

    /**
     * Lista todas as entidades do array list pertencentes à classe passada como parâmetro
     * @param tipo - string com o nome da classe a ser passado por parâmetro
     */
    public void listar(String tipo) {
        String nomeDaClasse;
        for (Entidade elemento : entidadesBomServico) {
            nomeDaClasse = elemento.getClass().getSimpleName();
            if (nomeDaClasse.equalsIgnoreCase(tipo)) {
                System.out.println(elemento.toString());
            }
        }
    }

    /**
     * Método que cria novo arraylist para conter apenas elementos da classe que é passada
     * por parâmetro
     * @param tipo - string com o nome da classe
     * @return - novo arrayList com elementos da classe em questão
     */
    public List<Entidade> retornarPorTipo(String tipo) {
        List<Entidade> lista = new ArrayList<>();
        String nomeDaClasse;
        for (Entidade elemento : entidadesBomServico) {
            nomeDaClasse = elemento.getClass().getSimpleName();
            if (nomeDaClasse.equalsIgnoreCase(tipo)) {
                lista.add(elemento);
            }
        }
        return lista;
    }


    /**
     * Método para adicionar a instância de Entidade recebida por parâmetro. Se a operação 
     * for bem sucedida, deve retornar true, caso contrário deve retornar false.
     * Após isto ordena o arraylist através do collections.sort;
     * @param entidade - objecto do tipo Entidade passado por parâmetro
     * @return 
     */
    public boolean adicionaEntidade(Entidade entidade) {
        boolean adiciona = entidadesBomServico.add(entidade);
        Collections.sort(entidadesBomServico);
        return adiciona;
    }


    /**
     * Método para remover a instância de Entidade recebida por parâmetro. Se a operação 
     * for bem sucedida, deve retornar true. Caso contrário deve retornar false.
     * @param entidade
     * @return - ArrayList entidadesBomserviço com a instância em questão já removida
     */
    public boolean removeEntidade(Entidade entidade) {
        return entidadesBomServico.remove(entidade);
    }

    /**
     * Método que actualiza a avaliação para uma determinade entidade de BomServiço recebendo por parâmetro 
     * a entidade a actualizar a avaliação e o val introduzido pelo utilizador
     * @param entidade - objecto entidade cuja avaliação será actualizada 
     * @param val - valor de avaliação introduzido 
     */
    public void atualizarAvaliacaoEntidade(Entidade entidade, int val) {
        entidade.atualizarAvaliacao(val);
    }

    public static Scanner in = new Scanner(System.in);

    /**
     * Método que obtém a avaliação de um entidade introduzida por parâmetro, e imprime o nome da entidade, 
     * e a avaliação média da mesma
     * @param entidade - Entidade a obter a avaliação
     */
    public void obterAvaliacaoEntidade(Entidade entidade) {
        System.out.println(entidade.getNome() + ", avaliação média: " + entidade.obterAvaliacao());
    }

    /**
     * Método que lista Restaurantes com o tipo de cozinha
     * @param tipocozinha - parâmetro a ser introduzido pelo utilizador
     */
    public void listaOrdenadaRest(int tipocozinha) {
        int cont = 0;
        for (Entidade elemento : retornarPorTipo("restaurante")) {
            Restaurante rest = (Restaurante) elemento;
            if (rest != null && rest.getTipoComida() == tipocozinha) {
                System.out.println("Restaurante= " + rest.getNome() + "; preço médio= " + rest.obterPrecoMedioPorPessoa());
                ++cont;
            }
        }
        if (cont == 0) {
            System.out.println("nenhum restaurante encontrado");

        }
    }

    /**
     * Método que lista instâncias de Hotéis com a categoria introduzida por parâmetro pelo
     * utilizador, de forma ordenada e com serviço de Transfer
     * @param categoria - parâmetro introduzido pelo utilizador 
     */
    public void listaOrdenadaHoteis(String categoria) {
        int cont = 0;
        for (Entidade elemento : retornarPorTipo("hotel")) {
            Hotel hotel = (Hotel) elemento;
            if (hotel != null && hotel.getCategoria().equals(categoria) && hotel.validarServicoTransfer()) {
                System.out.println( hotel.getNome() + "; tem serviço Transfer? " + hotel.validarServicoTransfer());
                ++cont;
            }
        }
        if (cont == 0) {
            System.out.println("nenhum hotel encontrado");

        }
    }

    /**
     * Método que lista instâncias de Pontos de Interesse com grau de avaliação igual ou superior 
     * ao introduzido pelo utilizador
     * @param grau - Grau de avaliação enviado por parâmetro, introduzido pelo utilizador
     */
    public void listaOrdenadaPI(int grau) {
        int cont = 0;
        for (Entidade elemento : retornarPorTipo("pontointeresse")) {
            PontoInteresse pontointeresse = (PontoInteresse) elemento;
            if (pontointeresse != null && pontointeresse.obterAvaliacao() >= grau) {
                System.out.println(pontointeresse.toString());
                ++cont;
            }
        }
        if (cont == 0) {
            System.out.println("nenhum ponto de interesse encontrado");

        }
    }

}
