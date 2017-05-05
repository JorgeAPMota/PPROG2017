package ex_shifts;

import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

/**
 *
 * @author 1131345 - Jorge Mota
 */
public class Janela extends JFrame {

    private static int quantidadeDeLetras;

    public Janela() {
        criarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();

        setMinimumSize(new Dimension(getWidth(), getHeight()));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void criarComponentes() {
        JPanel pBotoes = CriarPainelBotoes();
        JPanel pOpcao = CriarPainelOpcao();
        JPanel pLetras = CriarPainelLetras();

        add(pBotoes, BorderLayout.SOUTH);
        add(pOpcao, BorderLayout.NORTH);
        add(pLetras, BorderLayout.CENTER);

        JButton btnConfirmar = new JButton();
        JButton btnEsquerda = new JButton();
        JButton btnDireita = new JButton();

    }

    private JPanel CriarPainelBotoes() {

    }

    private JPanel CriarPainelOpcao() {

    }

    //Criação de array com as letras possíveis...
    JLabel[] letras = new JLabel[7];
    letras[]  = {"A", "B", "C", "D", "E", "F", "G"};

    private JPanel CriarPainelLetras() {
        ArrayList<JLabel> listaLetras = new ArrayList<>();
        for (int i = 0; i < quantidadeDeLetras; i++) {
            listaLetras.add(new JLabel(letras[i]));

            JPanel painelLetras = new JPanel(new GridLayout(1, quantidadeDeLetras));
            for (int i = quantidadeDeLetras - 1; i > 0; i--) {
                painelLetras.add(listaLetras.get(i));
            }
            listaLetras.get(0);
         // indiceLetra = 0;
            return painelLetras;
        }
        
//Array para fazer mover as letras...
//aux = [v0];        
// for (int i=0; i<v.length-1; i++){
// v[i] = v[i+1];
//   v.lenght-1 = aux;
//    }

}
