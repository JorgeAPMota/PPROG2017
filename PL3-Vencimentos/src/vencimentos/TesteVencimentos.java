package vencimentos;

public class TesteVencimentos {

    public static void main(String[] args) {
        
/**3.)
Nesta classe de teste, crie 3 objetos, um para cada tipo de trabalhador:
 Objeto do tipo TrabalhadorPeca, de nome Jorge Silva que produziu 20 peças do tipo 1 e 30 do tipo 2;
*/  
TrabalhadorPeca JorgeSilva = new TrabalhadorPeca("Jorge Silva", 20, 30);
     
        
/**
 Objeto  do  tipo TrabalhadorComissao de  nome  Susana  Ferreira,  com  o  salário  base  de 
//500,00€ e uma comissão de 6% sobre as vendas efetuadas que totalizaram  o  valor  de 1500,00€;
*/
TrabalhadorComissao SusanaFerreira = new TrabalhadorComissao("Susana Ferreira", (float)500.00, (float)1500.00, 6.0f );

/**
Objeto  do  tipo TrabalhadorHora,  de  nome  Carlos Miguel,  que  ganha  por  hora  3,50€ 
* e com um total de horas de trabalho igual a 160.*/
TrabalhadorHora CarlosMiguel = new TrabalhadorHora("Carlos Miguel", 160, 3.5f);
        
/**4.)
Crie um contentor de objetos para guardar os objetos existentes. Este contentor deve ser um 
array do tipo Object com comprimento 10.*/
Trabalhador[] trabalhadores = new Trabalhador[10];

/**5.) Guarde os objetos existentes no contentor.*/
trabalhadores[0] = JorgeSilva;
trabalhadores[1] = SusanaFerreira;
trabalhadores[2] = CarlosMiguel;

/**6.Programe  as  seguintes  listagens independentes,  obtidas  através  do  varrimento  do  contentor  com 
uma instrução for tradicional:
 Listagem das representações textuais dos trabalhadores;*/
for (int i = 0; i<trabalhadores.length; i++){
    if (trabalhadores[i]!= null);{
        System.out.println(trabalhadores[i].toString());       
    }
}

/** Listagem das representações textuais apenas dos trabalhadores à hora;*/
System.out.println("Listagem das representações textuais apenas dos trabalhadores à hora:");
for (int i = 0; i<trabalhadores.length; i++){
    if (trabalhadores[i] instanceof TrabalhadorHora);{
        System.out.println(trabalhadores[i].toString());       
    }
}

/** Listagem    dos    nomes    dos    trabalhadores existentes,    acompanhadas    dos    respetivos 
vencimentos.*/
System.out.println("Listagem    dos    nomes    dos    trabalhadores existentes,    acompanhadas    dos    respetivos \n" +
"vencimentos:");
for (int i = 0; i<trabalhadores.length; i++){
    if(trabalhadores[i]!=null){
        System.out.println("Nome=" + trabalhadores[i].getNome() + "Vencimento=" + trabalhadores[i].calcularVencimento());
    }
}

/**7. Substitua  o  tipo 
Object do array pelo  tipo Trabalhador (é  o  tipo  mais  genérico  da  hierarquia  de 
classes).*/

/**8.Simplifique o código das listagens.*/

    
    }
}
