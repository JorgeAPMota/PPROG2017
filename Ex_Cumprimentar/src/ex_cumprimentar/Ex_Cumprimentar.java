package ex_cumprimentar;

import java.util.Scanner;

/**
 *
 * @author Jorge Mota
 */
public class Ex_Cumprimentar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**Alínea 1*/
        /**Vai pedir o nome...*/
        Scanner input = new Scanner(System.in);
        System.out.println("Introduza o nome da pessoa...");
        String nome = input.next();
        /**Vai dar a saudação de acordo*/
        System.out.println("Bem-vindo" + nome );
        
    /**Objectos...*/
        Pessoa p1 = new Pessoa ("Jorge" , 30);     
        Pessoa p2 = new Pessoa ("João", 20);
       
    }
    
    
}
