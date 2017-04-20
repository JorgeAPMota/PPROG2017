package gestoresposicionamento;

import java.awt.*;
import javax.swing.*;

/**
 * Representa uma janela cujo ContentPane tem um gestor de posicionamento
 * FlowLayout.
 *
 * @author ISEP-DEI-PPROG
 */
public class JanelaFlowLayout extends JFrame {

    /**
     * A largura da janela em píxeis.
     */
    private static final int JANELA_LARGURA = 400;

    /**
     * A altura da janela em píxeis.
     */
    private static final int JANELA_ALTURA = 200;
    

    /**
     * Constrói uma instância de JanelaFlowLayout.
     *
     * @param titulo o título da janela
     */
    public JanelaFlowLayout(String titulo) {
        super(titulo);

        getContentPane().setBackground(Color.CYAN);

        /**
         * Na construção do objecto/gestor de posicionamento FlowLayout, é logo enviado por parâmetro
         * o posicionamento do gestor (CENTRO), e o espaçamento vertical, e espaçamento horizontal entre
         * os objectos do mesmo;
         */
        FlowLayout fl = new FlowLayout(FlowLayout.RIGHT, 20, 30);
        setLayout(fl);
        

        /**
         * A seguinte invocação do método setAlignment sobre o objecto f1 vai fazer com que o mesmo
         * fique alinhado à esquerda
         *
         * fl.setAlignment(LEFT);
         */
        
        
        /**
         * A seguinte invocação dos métodos sobre fl vai: 
         * fl.setHgap(20); -  Determinar o espaçamento horizontal em 20 pixeis
         * fl.setVgap(30); -  Determinar o espaçamento vertical em 30 pixeis
         */
        
        criarComponentes();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(JANELA_LARGURA, JANELA_ALTURA);

        setVisible(true);
    }



    /**
     * Cria e adiciona componentes à janela.
     */
    private void criarComponentes() {

        String[] titulos = {"Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete"};
        
        /**
         * Este for each vai para cada ciclo criar um botão, determinar o seu tamanho predefinido, 
         * e adicionar o botão a cada título
        */
        for (String titulo : titulos) { 
            JButton btn = new JButton(titulo);
            btn.setPreferredSize(new Dimension(75, 30));
            add(btn);
        }
        

    }

    /**
     * Para testar a janela JanelaFlowLayout.
     *
     * @param args as opções de execução
     */
    public static void main(String[] args) {

        JanelaFlowLayout janela = new JanelaFlowLayout("Gestor de Posicionamento: FlowLayout");

    }
}
