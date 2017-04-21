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

        BorderLayout bl = new BorderLayout(20, 30);
        setLayout(bl);

        JPanel pNorte = criarPainelNorte();
        JPanel pEste = criarPainelEste();
        JPanel pOeste = criarPainelOeste();
        JPanel pCentro = criarPainelCentro();
        JPanel pSul = criarPainelSul();
        

        add(pNorte, BorderLayout.NORTH);
        add(pEste, BorderLayout.EAST);
        add(pOeste, BorderLayout.WEST);
        add(pCentro, BorderLayout.CENTER);
        add(pSul, BorderLayout.SOUTH);
        

        //        criarComponentes();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(JANELA_LARGURA, JANELA_ALTURA);
        setVisible(true);

    }

    private JPanel criarPainelNorte() {
        JPanel pNorte = new JPanel();

        JButton btnUm = new JButton("Um");
        pNorte.add(btnUm);
        JButton btnDois = new JButton("Dois");
        pNorte.add(btnDois);
        JButton btnTres = new JButton("Três");
        pNorte.add(btnTres);
        pNorte.setBackground(Color.YELLOW);

        return pNorte;

    }

    private JPanel criarPainelEste() {
        JPanel pEste = new JPanel();

        JButton btnQuatro = new JButton("Quatro");
        pEste.add(btnQuatro);
        pEste.setBackground(Color.BLUE);

        add(pEste, BorderLayout.EAST);

        return pEste;
    }

    private JPanel criarPainelOeste() {
        JPanel pOeste = new JPanel();

        JButton btnSeis = new JButton("Seis");
        pOeste.add(btnSeis);
        pOeste.setBackground(Color.BLUE);

        add(pOeste, BorderLayout.WEST);

        return pOeste;
    }

    private JPanel criarPainelCentro() {
        JPanel pCentro = new JPanel();

        JButton btnCinco = new JButton("Cinco");
        pCentro.add(btnCinco);
        pCentro.setBackground(Color.RED);

        add(pCentro, BorderLayout.CENTER);

        return pCentro;
    }

    private JPanel criarPainelSul() {
        JPanel pSul = new JPanel();

        JButton btnSete = new JButton("Sete");
        pSul.add(btnSete);
        pSul.setBackground(Color.YELLOW);

        add(pSul, BorderLayout.SOUTH);

        return pSul;
    }

//    /**
//     * Cria e adiciona componentes à janela.
//     */
//    private void criarComponentes(){
//        
//        String[] titulos = {"Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete"};
//        
//        add(new JButton(titulos[0]), BorderLayout.NORTH);
//        add(new JButton(titulos[1]), BorderLayout.WEST);
//        add(new JButton(titulos[2]), BorderLayout.CENTER);
//        add(new JButton(titulos[3]), BorderLayout.EAST);
//        add(new JButton(titulos[4]), BorderLayout.SOUTH);       
//    }
    /**
     * Para testar a janela JanelaBorderLayout.
     *
     * @param args as opções de execução
     */
    public static void main(String[] args) {

        JanelaBorderLayout janela = new JanelaBorderLayout("Gestor de Posicionamento: BorderLayout");

    }
}
