package Introduccion_Programacion.FINAL;


import javax.swing.ImageIcon;
import javax.swing.JComboBox;
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





 // Crear un array de opciones
 Object[] opciones = {"Quiero", "No quiero", "Vale Cuatro"};

 // Mostrar el diálogo de opciones
 int seleccion = JOptionPane.showOptionDialog(
         null,
         "La PC dice RETRUCO",
         "Retruco",
         JOptionPane.YES_NO_CANCEL_OPTION,
         JOptionPane.INFORMATION_MESSAGE,
         null,
         opciones,
         opciones[0]);

 // Manejar la respuesta del usuario
 switch (seleccion) {
     case JOptionPane.YES_OPTION:
         System.out.println("El usuario eligió Quiero");
         // Agregar aquí el código para la opción Quiero
         break;
     case JOptionPane.NO_OPTION:
         System.out.println("El usuario eligió No quiero");
         // Agregar aquí el código para la opción No quiero
         break;
     case JOptionPane.CANCEL_OPTION:
         System.out.println("El usuario eligió Vale Cuatro");
         // Agregar aquí el código para la opción Vale Cuatro
         break;
     default:
         System.out.println("Opción no válida");
         break;
 }


 int Mano1 = 1;
        
        String seleccionMano1 = ""; // le doy un valor por defecto a la variable para que el switch no se queje

        do {
            

            // Crear un panel para contener las imágenes
            JPanel CartasMano1 = new JPanel();
            CartasMano1.add(new JLabel(carta_1_img));
            CartasMano1.add(new JLabel(carta_2_img));    //en vez de "panel" uso CartasImg1 para distinguir entre manos
            CartasMano1.add(new JLabel(carta_3_img));
            

            String[] opcionesMano1 = {"Jugar primera carta", "Jugar segunda carta", "Jugar tercera carta", "Cantar Envido", "Cantar truco"};
            JComboBox<String> comboBox = new JComboBox<>(opcionesMano1);
            CartasMano1.add(comboBox);

            // Mostrar el panel en JOptionPane
            int result = JOptionPane.showConfirmDialog(
                    null,
                    CartasMano1,
                    "Tus cartas",
                    JOptionPane.PLAIN_MESSAGE);

            if (result == JOptionPane.OK_OPTION) {
                seleccionMano1 = (String) comboBox.getSelectedItem();   
            }

            switch (seleccionMano1) {
                case "Jugar primera carta":
                    if (!carta1Seleccionada) {
                        System.out.println("elegiste carta 1");
                        carta1Seleccionada = true;
                        Mano1 = 0;  // Establecer Mano1 en = 0 para salir del bucle

                        cartaJugadaUser = carta_1;

                        System.out.println("la carta jugada es: " + cartaJugadaUser);
                    } else {
                        System.out.println("ya elegiste la carta 1");
                    }
                        break;

                case "Jugar segunda carta":
                    if (!carta2Seleccionada) {
                        System.out.println("elegiste carta 2");
                        carta2Seleccionada = true;
                        Mano1 = 0;

                        cartaJugadaUser = carta_2;
                    } else {
                        System.out.println("ya elegiste la carta 2");
                    }
                        break;

                case "Jugar tercera carta":
                    if (!carta3Seleccionada) {
                        System.out.println("elegiste carta 3");
                        carta3Seleccionada = true;
                        Mano1 = 0;  
                    
                        cartaJugadaUser = carta_3;
                    } else {
                        System.out.println("ya elegiste la carta 3");
                    }
                        break;

                case "Cantar truco":
                    System.out.println("elegiste truco");
                    Mano1 = 0;
                    TrucoCantado = true;
                    break;

                case "Cantar Envido":
                    System.out.println("elegiste envido");
                    Mano1 = 0;
                    EnvidoCantado = true;
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (Mano1 != 0);














        boolean carta1Seleccionada = false;
        boolean carta2Seleccionada = false;
        boolean carta3Seleccionada = false;

        int Mano1 = 1;
        
        int seleccionMano1; // le doy un valor por defecto a la variable para que el switch no se queje

        // Crear un panel para contener las imágenes
        JPanel CartasMano1 = new JPanel();
        CartasMano1.add(new JLabel(carta_1_img));
        CartasMano1.add(new JLabel(carta_2_img));    //en vez de "panel" uso CartasImg1 para distinguir entre manos
        CartasMano1.add(new JLabel(carta_3_img));

        //array de objetos que representa las opciones que se mostrarán al usuario
        String[] opcionesMano1 = {"Jugar primera carta", "Jugar segunda carta", "Jugar tercera carta"};

        // Mostrar el panel en JOptionPane
        seleccionMano1 = JOptionPane.showOptionDialog(
                null,
                CartasMano1, 
                "Tus cartas", //titulo
                JOptionPane.YES_NO_CANCEL_OPTION, //muestra los botones
                JOptionPane.INFORMATION_MESSAGE, 
                null, //ícono que se mostrará junto al mensaje, qui se utiliza null para usar el ícono predeterminado
                opcionesMano1, 
                opcionesMano1[0]); //Indica cuál de las opciones es la predeterminada