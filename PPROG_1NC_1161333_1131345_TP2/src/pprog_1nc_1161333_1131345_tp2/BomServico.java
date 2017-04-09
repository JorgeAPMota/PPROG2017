/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pprog_1nc_1161333_1131345_tp2;

import java.util.ArrayList;
import java.util.List;

/**
 * PPROG 2016/2017
 * Trabalho Prático nº2 - TP2
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
    List<Entidades> entidadesBomServico = new ArrayList<>();   

    /**
     * Constructor completo da instancia BomServico
     * @param nome
     * @param telefone
     * @param NIF
     * @param entidadesBomServico - Array que ocntem todas as entidades da empresa BomServiço
     */
    public BomServico(String nome, String telefone, int NIF, List<Entidades> entidadesBomServico) {
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

    public List<Entidades> getEntidadesBomServico() {
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

    public void setEntidadesBomServico(List<Entidades> entidadesBomServico) {
        this.entidadesBomServico = entidadesBomServico;
    }

    @Override
    public String toString() {
        return "BomServico{" + "nome=" + nome + ", telefone=" + telefone + ", NIF=" + NIF + ", entidadesBomServico=" + listarEntidadesBomServico() + '}';
    }

    /**
     * Método For Each que vai percorrer o array de entidadesBomServico
     * @param entidadesBomServico - Array com as entidades da empresa Bom Serviço
     */
    public static void listarEntidadesBomServico(List entidadesBomServico) {
        for (Object elemento : entidadesBomServico) {
            System.out.println(elemento.toString());

    }
    
    
}
}
