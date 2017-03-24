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
public class TrabalhadorOutrem extends Contrib_c_Rend_Trab{
    
    static String nomeEmpresa;
    
    public static final String NOME_EMPRESA_POR_OMISSAO = "Sem nome de empresa"; 
    
    public TrabalhadorOutrem (String nomeContribuinte, String morada, int NIF, String nomeEmpresa){
        super(nomeContribuinte, morada, NIF);
        this.nomeEmpresa=nomeEmpresa;
    
        
    @Override
    public abstract String toString();
        return String.format ( args);
    }
        
    }
    
}
