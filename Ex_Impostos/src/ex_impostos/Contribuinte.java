/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_impostos;

/**
 *
 * @author Jorge Mota
 */
public abstract class Contribuinte {
    
    public String nomeContribuinte;
    public String morada;
    public int NIF;
    
    public static final String NOME_CONTRIBUINTE_POR_OMISSAO = "SEM NOME";
    public static final String MORADA_CONTRIBUINTE_POR_OMISSAO = "SEM MORADA";
    public static final int NIF_POR_OMISSAO = 000000000;
    
    
    /**
     * Constructor completo
     * @param nomeContribuinte
     * @param morada
     * @param NIF 
     */
    
    public Contribuinte (String nomeContribuinte, String morada, int NIF){
        this.nomeContribuinte = nomeContribuinte;
        this.morada = morada;
        this.NIF = NIF;           
    }
    
    /**
     * Contructor vazio
    */
    public Contribuinte (){
        nomeContribuinte = NOME_CONTRIBUINTE_POR_OMISSAO;
        morada = MORADA_CONTRIBUINTE_POR_OMISSAO;
        NIF = NIF_POR_OMISSAO;
    }
    
    @Override
    public String toString(){
        return String.format("O contribuinte possui os seguintes dados:" + "%nNome:%s %nMorada:%s %nNIF:%d", nomeContribuinte, morada, NIF);
            }
        
    public abstract double CalcularImposto();
}
