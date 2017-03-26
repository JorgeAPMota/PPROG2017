package tp1.socio;

/**
 * PPROG 0216/2017
 * Trabalho Prático nº1 - TP1
 * 
 * @author 1161333 - Joana Gusmao Guedes
 * @author 1131345 - Jorge Mota
 * 
 * @since 26/03/2017
 */
public class testeSocio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
/**
 * Criação de objectos/sócios do tipo Senior:
 */
        Senior s1 = new Senior ("Jose Santos", 134628976, 1955, false);
        Senior s2 = new Senior("Antonio Pereira", 134628976, 1950, true);
        Senior s3 = new Senior("Maria Magalhaes", 134628976, 1953, false);
        Senior s4 = new Senior("Joana Ferreira", 134628976, 1954, true);

/**
 * Criação de objectos/sócios do tipo Menor:
 */
        Menor m1 = new Menor("Andre Pereira", 0, 2000, 3, "Paulo Ferreira");
        Menor m2 = new Menor("Ana Magalhaes", 0, 2003, 2, "Ana Ferreira");
        Menor m3 = new Menor("Sofia Ferreira", 0, 2002, 2, "Catarina Santos");
        Menor m4 = new Menor("Manuela Ferreira", 0, 2009, 1, "Manuel Guedes");

/**
 * Criação de objectos/sócios do tipo Adulto:
 */        
        
        Adulto a1 = new Adulto("Carlos Costa", 263894514, 1981, 2, false);
        Adulto a2 = new Adulto("Miguel Areias", 378134692, 1970, 5, false);
        Adulto a3 = new Adulto("Carolina Valente", 103428157, 1969, 2, true);
        Adulto a4 = new Adulto("Augusto Moura", 398135427, 1965, 6, false);

/**
 * Criação de um array com os 12 objectos/sócios criados anteriormente:
 */       
        Socio[] listaSocios = new Socio[12];
        listaSocios[0] = s1;
        listaSocios[1] = s2;
        listaSocios[2] = s3;
        listaSocios[3] = s4;
        listaSocios[4] = m1;
        listaSocios[5] = m2;
        listaSocios[6] = m3;
        listaSocios[7] = m4;
        listaSocios[8] = a1;
        listaSocios[9] = a2;
        listaSocios[10] = a3;
        listaSocios[11] = a4;

/**
 * Invocação de métodos da classe Socio que tomam por parâmetro o array listaSocios, 
 * e do mesmo array listam respectivamente...
 * 
 * Listagem de sócios:
 */
        Socio.listarSocios(listaSocios);

/**
* Listagem de encarregados e sócios menores a cargo:
*/
        Socio.listarEncarregados(listaSocios);
        
/**
* Listagem de sócios e respectivas mensalidades:
*/
        Socio.listarSociosMensalidades(listaSocios);
        
/**
* Total Mensalidades:
*/
        Socio.listarTotalMensalidades(listaSocios);
        
    }
}
