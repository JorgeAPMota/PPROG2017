package gui;

import javax.swing.*;

public class Main {
    
    public static void main(String[] args) {
        Janela janela = null;
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            // Estilos alternativos
//             UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//             UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
//             UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
             
              janela = new Janela("Conversor Celsius - Fahrenheit");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(janela, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
