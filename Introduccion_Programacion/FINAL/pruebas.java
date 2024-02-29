package Introduccion_Programacion.FINAL;


import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class pruebas {
    public static void main(String[] args) {
        // Rutas de las imágenes (ajusta las rutas según la ubicación de tus imágenes)
        String rutaImagen1 = "Introduccion_Programacion/FINAL/Cartas/basto1.png";
        String rutaImagen2 = "Introduccion_Programacion/FINAL/Cartas/basto2.png";
        String rutaImagen3 = "Introduccion_Programacion/FINAL/Cartas/basto3.png";

        // Cargar las imágenes
        ImageIcon imagen1 = new ImageIcon(rutaImagen1);
        ImageIcon imagen2 = new ImageIcon(rutaImagen2);
        ImageIcon imagen3 = new ImageIcon(rutaImagen3);

        // Crear un panel para contener las imágenes
        JPanel panel = new JPanel();
        panel.add(new JLabel(imagen1));
        panel.add(new JLabel(imagen2));
        panel.add(new JLabel(imagen3));

        // Mostrar el panel en JOptionPane
        JOptionPane.showMessageDialog(
                null,
                panel,
                "Tres Imágenes",
                JOptionPane.PLAIN_MESSAGE
        );



    }
}


