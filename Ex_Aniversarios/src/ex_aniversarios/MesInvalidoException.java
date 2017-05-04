/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_aniversarios;

/**
 *
 * @author Jorge Mota
 */
public class MesInvalidoException extends IllegalArgumentException {

    public MesInvalidoException() {
        super("Mês inserido inválido");
        

    public MesInvalidoException(String msg){
        super(msg);
    }

}
