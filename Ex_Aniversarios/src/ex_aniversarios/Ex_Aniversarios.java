package ex_aniversarios;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Jorge Mota
 */
public class Ex_Aniversarios {

    /**
     * @param args the command line arguments
     */
    private static String dataIn;
    private static Data d = null;
    private static boolean dadosInvalidos = false;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Introduza uma data sff...");
        do {
            try {
                //Data é introduzida e separada por / ;
                String[] dataIn = in.nextLine().split("/");
                if (dataIn.length != 8) {
                    throw new NumberFormatException();
                }
                d = new Data(Integer.parseInt(dataIn[0]), Integer.parseInt(dataIn[1]), Integer.parseInt(dataIn[2]));
                System.out.printf("%nData por Extenso: %s%n", d);
                dadosInvalidos = true;   
            } 
            catch (MesInvalidoException | DiaInvalidoException exp) {
                System.out.println("\nERRO: " + exp.getMessage() + "\n");
                System.out.print("Introduza novamente uma data no formato aaaa/mm/dd: ");
            } 
            catch (NumberFormatException exp) {
                System.out.println("\nERRO: Não inseriu uma data no formato numérico válido.\n");
                System.out.print("Introduza novamente uma data no formato aaaa/mm/dd: ");
            }
            catch (Exception exp){
                System.out.println("\nErro\n");
            }
        } 
        while (dadosInvalidos);
    }    

//4. Na classe principal criar um método auxiliar para ler, da Consola, uma data com o seguinte formato: 
//ano/mês/dia. Esta leitura deve ser repetida enquanto o utilizador fornecer uma data inválida ou com 
//formato inválido, conforme é exemplificado na Figura 2. A mensagem de erro fornecida ao utilizador 
//deve indicar o tipo de erro: formato ou mês ou dia inválido. No final da execução, este método deve 
//retornar uma instância de Data, representando a data lida. 
//
//5.Testar este método criado.
//
//6.Completar  a  implementação  da  aplicação  de  modo  a 
//satisfazer  o  comportamento  apresentado  na 
//Figura 2
    
}
