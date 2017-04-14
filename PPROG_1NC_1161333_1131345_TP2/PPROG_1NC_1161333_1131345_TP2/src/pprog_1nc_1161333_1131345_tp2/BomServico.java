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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

    public void setEntidadesBomServico(List<Entidade> entidadesBomServico) {
        this.entidadesBomServico = entidadesBomServico;
    }

    /**
     * Método toString
     *
     * @return - string com nome, telefone e nif
     */
    @Override
    public String toString() {
        return "- Empresa Bom Servico" + "\n  nome: " + nome + "\n  telefone: " + telefone + "\n  NIF: " + NIF + "\n  Lista de entidades de Bom Servico:\n " + entidadesBomServico.toString();
    }

    /**
     * percorre o array de entidadesBomServico e imprime
     *
     */
    public void listar() {
        for (Entidade elemento : entidadesBomServico) {
            System.out.println(elemento.toString());
        }
    }

    /**
     * lista todas as entidades do array list pertecnebtes à classe passada como
     * parâmetro
     *
     * @param tipo - string com o nome da classe
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
     * cria novo arraylist para conter apenas elementos da classe que é passada
     * por parâmetro
     *
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

    //Método para adicionar a instância de Entidade recebida por parâmetro. Se a operação 
    //for bem sucedida, deve retornar true. Caso contrário deve retornar false.
    public boolean adicionaEntidade(Entidade entidade) {
        boolean adiciona = entidadesBomServico.add(entidade);
        Collections.sort(entidadesBomServico);
        return adiciona;
    }

    //Método para remover a instância de Entidade recebida por parâmetro. Se a operação 
    //for bem sucedida, deve retornar true. Caso contrário deve retornar false.
    //será para usar equals??
    public boolean removeEntidade(Entidade entidade) {
        return entidadesBomServico.remove(entidade);
    }

    public void atualizarAvaliacaoEntidade(Entidade entidade, int val) {

        entidade.atualizarAvaliacao(val);
    }

    public static Scanner in = new Scanner(System.in);

    public void obterAvaliacaoEntidade(Entidade entidade) {

        System.out.println(entidade.getNome() + ", avaliação média: " + entidade.obterAvaliacao());
    }

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

    public void listaOrdenadaHoteis(String categoria) {

        int cont = 0;
        for (Entidade elemento : retornarPorTipo("hotel")) {
            Hotel hotel = (Hotel) elemento;
            if (hotel != null && hotel.getCategoria().equals(categoria) && hotel.validarServicoTransfer()) {
                System.out.println( hotel.getNome() + "; tem serviço Guia? " + hotel.validarServicoTransfer());
                ++cont;
            }
        }
        if (cont == 0) {
            System.out.println("nenhum hotel encontrado");

        }
    }

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
