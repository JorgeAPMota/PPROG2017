/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_exposicao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author i131345
 */
public class TesteExposicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//5.Teste a classe Quadro da seguinte forma:
//a)Crie diversas instâncias de Quadro.
        Quadro quadro1 = new Quadro("Mona Lisa", "DaVinci", 1500);
        Quadro quadro2 = new Quadro("Degas1", "Degas", 1800);
        Quadro quadro3 = new Quadro("Degas2", "Degas", 1800);

//b)Armazene essas instâncias num contentor do tipo ArrayList.
        List<Quadro> quadros = new ArrayList<>();

        quadros.add(quadro1);
        quadros.add(quadro2);
        quadros.add(quadro3);

//c)Visualize os objetos do contentor utilizando o método listar.
     listarTeste(quadros);        
    }

//Teste a classe Exposição usando o seguinte procedimento:
//a)Crie  diversas  instâncias  de Exposicao,  usando  as  instâncias  de Quadro
//criadas  anteriormente. Algumas destas instâncias devem ser partilhadas por todas as exposições criadas. 
    
    
//Nesta  classe Teste,  crie  o  método listar para  apresentar,  na  consola,  uma  listagem  dos  objetos  do 
//contentor recebido por parâmetro. Considere um contentor do tipo List
    public static void listarTeste(List lista) {
        for (Object elemento : lista) {
            System.out.println(elemento.toString());

        }
//Teste a classe Exposição usando o seguinte procedimento:
//a)Crie  diversas  instâncias  de Exposicao,  usando  as  instâncias  de Quadro
//criadas  anteriormente. Algumas destas instâncias devem ser partilhadas por todas as exposições criadas.

//b)Armazene estas instâncias num contentor do tipo ArrayList.

//c)Visualize os objetos deste contentor reutilizando o método listar.

//8.Modifique  o  conteúdo  de  uma  das  instâncias  de Quadro partilhada  por  todas  as  exposições.  Para 
//confirmar estas modificações, visualize novamente os objetos do contentor de exposições.

//9.//Programe uma listagem do contentor de exposições por ordem decrescente do ano da exposição.

//10.Teste o método da classe Exposicao para remover um quadro
        
    }
}
