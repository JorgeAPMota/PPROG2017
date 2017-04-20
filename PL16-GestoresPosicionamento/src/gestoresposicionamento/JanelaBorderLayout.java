package gestoresposicionamento;

import java.awt.*;
import javax.swing.*;

/**
 * Representa uma janela cujo ContentPane tem um gestor de posicionamento 
 * BorderLayout.
 * 
 * @author ISEP-DEI-PPROG
 */
public class JanelaBorderLayout extends JFrame {
    
    /**
     * A largura da janela em píxeis.
     */
    private static final int JANELA_LARGURA = 400;
    
    /**
     * A altura da janela em píxeis.
     */
    private static final int JANELA_ALTURA = 200;    
    
    
    /**
     * Constrói uma instância de JanelaBorderLayout.
     * 
     * @param titulo o título da janela
     */    
    public JanelaBorderLayout(String titulo) {

        super(titulo);

        getContentPane().setBackground(Color.CYAN);

        BorderLayout bl = new BorderLayout();
        setLayout(bl);
        
        criarComponentes();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(JANELA_LARGURA, JANELA_ALTURA);
        setVisible(true);
    }
    
    /**
     * Cria e adiciona componentes à janela.
     */
    private void criarComponentes(){
        
        String[] titulos = {"Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete"};
        
        add(new JButton(titulos[0]), BorderLayout.NORTH);
        add(new JButton(titulos[1]), BorderLayout.WEST);
        add(new JButton(titulos[2]), BorderLayout.CENTER);
        add(new JButton(titulos[3]), BorderLayout.EAST);
        add(new JButton(titulos[4]), BorderLayout.SOUTH);       
    }
    
    /**
     * Para testar a janela JanelaBorderLayout.
     * 
     * @param args as opções de execução
     */
    public static void main(String [] args) {

        JanelaBorderLayout janela = new JanelaBorderLayout("Gestor de Posicionamento: BorderLayout");
        
    }
}
