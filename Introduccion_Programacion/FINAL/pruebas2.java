package Introduccion_Programacion.FINAL;

import java.io.IOException;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*; 
import java.io.File;
public class pruebas2 {
    public static void main(String[] args){

        //ARMO EL MAZO
        int deck[][] = new int[4][10];


         // Asignar valores a cada elemento de la matriz


        // 0=espada; 1=basto; 2=oro; 3=copa
        deck[0][0] = 13;   // 1 espada
        deck[0][1] = 8;
        deck[0][2] = 9;
        deck[0][3] = 0;
        deck[0][4] = 1;
        deck[0][5] = 2;
        deck[0][6] = 11;   //7 espada
        deck[0][7] = 4;
        deck[0][8] = 5;
        deck[0][9] = 6;    //12 espada
        deck[1][0] = 12;   //1 basto
        deck[1][1] = 8;
        deck[1][2] = 9;
        deck[1][3] = 0;
        deck[1][4] = 1;
        deck[1][5] = 2;
        deck[1][6] = 3;
        deck[1][7] = 4;
        deck[1][8] = 5;
        deck[1][9] = 6;    //12 basto
        deck[2][0] = 7;    //1 oro
        deck[2][1] = 8;
        deck[2][2] = 9;
        deck[2][3] = 0;
        deck[2][4] = 1;
        deck[2][5] = 2;
        deck[2][6] = 10;   //7 oro
        deck[2][7] = 4;
        deck[2][8] = 5;
        deck[2][9] = 6;    //12 oro
        deck[3][0] = 7;    //1 copa
        deck[3][1] = 8;
        deck[3][2] = 9;
        deck[3][3] = 0;
        deck[3][4] = 1;
        deck[3][5] = 2;
        deck[3][6] = 3;
        deck[3][7] = 4;
        deck[3][8] = 5;
        deck[3][9] = 6;    //12 copa
       
        //mazo con valores para envido
        int deckEnvido[][] = new int[4][10];

        // 0=espada; 1=basto; 2=oro; 3=copa
        deckEnvido[0][0] = 1;   // 1 espada
        deckEnvido[0][1] = 2;
        deckEnvido[0][2] = 3;
        deckEnvido[0][3] = 4;
        deckEnvido[0][4] = 5;
        deckEnvido[0][5] = 6;
        deckEnvido[0][6] = 7;   //7 espada
        deckEnvido[0][7] = 0;
        deckEnvido[0][8] = 0;
        deckEnvido[0][9] = 0;    //12 espada
        deckEnvido[1][0] = 1;   //1 basto
        deckEnvido[1][1] = 2;
        deckEnvido[1][2] = 3;
        deckEnvido[1][3] = 4;
        deckEnvido[1][4] = 5;
        deckEnvido[1][5] = 6;
        deckEnvido[1][6] = 7;
        deckEnvido[1][7] = 0;
        deckEnvido[1][8] = 0;
        deckEnvido[1][9] = 0;    //12 basto
        deckEnvido[2][0] = 1;    //1 oro
        deckEnvido[2][1] = 2;
        deckEnvido[2][2] = 3;
        deckEnvido[2][3] = 4;
        deckEnvido[2][4] = 5;
        deckEnvido[2][5] = 6;
        deckEnvido[2][6] = 7;   //7 oro
        deckEnvido[2][7] = 0;
        deckEnvido[2][8] = 0;
        deckEnvido[2][9] = 0;    //12 oro
        deckEnvido[3][0] = 1;    //1 copa
        deckEnvido[3][1] = 2;
        deckEnvido[3][2] = 3;
        deckEnvido[3][3] = 4;
        deckEnvido[3][4] = 5;
        deckEnvido[3][5] = 6;
        deckEnvido[3][6] = 7;
        deckEnvido[3][7] = 0;
        deckEnvido[3][8] = 0;
        deckEnvido[3][9] = 0;    //12 copa
        

        ImageIcon [][] deckImg = new ImageIcon [4][10];
 
        deckImg[0][1] = new ImageIcon ("/Cartas/esp2.png");
        deckImg[0][2] = new ImageIcon ("/Cartas/esp3.png");
        deckImg[0][3] = new ImageIcon ("/Cartas/esp4.png");
        deckImg[0][4] = new ImageIcon ("/Cartas/esp5.png");
        deckImg[0][5] = new ImageIcon ("/Cartas/esp6.png");
        deckImg[0][6] = new ImageIcon ("/Cartas/esp7.png");
        deckImg[0][7] = new ImageIcon ("/Cartas/esp10.png");
        deckImg[0][8] = new ImageIcon ("/Cartas/esp11.png");
        deckImg[0][9] = new ImageIcon ("/Cartas/esp12.png");
        deckImg[1][0] = new ImageIcon ("/Cartas/basto1.png"); 
        deckImg[1][1] = new ImageIcon ("/Cartas/basto2.png");
        deckImg[1][2] = new ImageIcon ("/Cartas/basto3.png"); 
        deckImg[1][3] = new ImageIcon ("/Cartas/basto4.png");
        deckImg[1][4] = new ImageIcon ("/Cartas/basto5.png");
        deckImg[1][5] = new ImageIcon ("/Cartas/basto6.png");
        deckImg[1][6] = new ImageIcon ("/Cartas/basto7.png");
        deckImg[1][7] = new ImageIcon ("/Cartas/basto10.png");
        deckImg[1][8] = new ImageIcon ("/Cartas/basto11.png");
        deckImg[1][9] = new ImageIcon ("/Cartas/basto12.png");
        deckImg[2][0] = new ImageIcon ("/Cartas/oro1.png");
        deckImg[2][1] = new ImageIcon ("/Cartas/oro2.png");
        deckImg[2][2] = new ImageIcon ("/Cartas/oro3.png");
        deckImg[2][3] = new ImageIcon ("/Cartas/oro4.png");
        deckImg[2][4] = new ImageIcon ("/Cartas/oro5.png");
        deckImg[2][5] = new ImageIcon ("/Cartas/oro6.png");
        deckImg[2][6] = new ImageIcon ("/Cartas/oro7.png");
        deckImg[2][7] = new ImageIcon ("/Cartas/oro10.png");
        deckImg[2][8] = new ImageIcon ("/Cartas/oro11.png");
        deckImg[2][9] = new ImageIcon ("/Cartas/oro12.png");
        deckImg[3][0] = new ImageIcon ("/Cartas/copa1.png");
        deckImg[3][1] = new ImageIcon ("/Cartas/copa2.png");
        deckImg[3][2] = new ImageIcon ("/Cartas/copa3.png");
        deckImg[3][3] = new ImageIcon ("/Cartas/copa4.png");
        deckImg[3][4] = new ImageIcon ("/Cartas/copa5.png");
        deckImg[3][5] = new ImageIcon ("/Cartas/copa6.png");
        deckImg[3][6] = new ImageIcon ("/Cartas/copa7.png");
        deckImg[3][7] = new ImageIcon ("/Cartas/copa10.png");
        deckImg[3][8] = new ImageIcon ("/Cartas/copa11.png");
        deckImg[3][9] = new ImageIcon ("/Cartas/copa12.png");

         // Imprimir la matriz con los valores asignados (test)
         for (int i = 0; i < deck.length; i++) {
             for (int j = 0; j < deck[i].length; j++) {
                 System.out.print(deck[i][j] + " ");
             }
             System.out.println();
         }

         //----------------------------------------------------------------

        //Seccion para repartir las cartas
        //reparto 3 cartas al usuario

        // int [][] cartasUser = repartirRand(deck, deckImg, 3);

        // mostrarCartas(cartasUser, deckImg, "Cartas del usuario");

        // //reparto 3 cartas a la CPU

        // int [][] cartasCPU = repartirRand(deck, deckImg, 3);

        // mostrarCartas(cartasUser, deckImg, "Cartas de la CPU");


        int filaDeck = deck.length;
        int colDeck = deck[0].length;

        //genero un random para la carta 1:

        int filaDeckRand1 =  (int) (Math.random() * filaDeck);
        int colDeckRand1 =   (int) (Math.random() * colDeck);

        //carta 2
        int filaDeckRand2 =  (int) (Math.random() * filaDeck);
        int colDeckRand2 =   (int) (Math.random() * colDeck);

        //carta 3
        int filaDeckRand3 =  (int) (Math.random() * filaDeck);
        int colDeckRand3 =   (int) (Math.random() * colDeck);

        //imagenes para las cartas
        //carta 1
        int filaDeckImgRand1 = filaDeckRand1;
        int colDeckImgRand1 = colDeckRand1;

        //carta 2
        int filaDeckImgRand2 = filaDeckRand2;
        int colDeckImgRand2 = colDeckRand2;

        //carta 3
        int filaDeckImgRand3 = filaDeckRand3;
        int colDeckImgRand3 = colDeckRand3;

        //cartas que tocan al usuario
        int carta_1 = deck[filaDeckRand1][colDeckRand1];
        int carta_2 = deck[filaDeckRand2][colDeckRand2];
        int carta_3 = deck[filaDeckRand3][colDeckRand3];
        
        //imgs de las cartas usuario
        ImageIcon carta_1_img = deckImg[filaDeckImgRand1][colDeckImgRand1];
        ImageIcon carta_2_img = deckImg[filaDeckImgRand2][colDeckImgRand2];
        ImageIcon carta_3_img = deckImg[filaDeckImgRand3][colDeckImgRand3];

        //test2
        System.out.println("carta 1: " + carta_1 + " Palo: " + filaDeckRand1);
        System.out.println("carta 2: " + carta_2 + " Palo: " + filaDeckRand2);
        System.out.println("carta 3: " + carta_3 + " Palo: " + filaDeckRand3);

        //test para saber si coinciden ambos array
        System.out.println("deck fila: " + filaDeckRand1 + " col fila: " + colDeckRand1);
        System.out.println("img fila: " + filaDeckImgRand1 + " col fila: " + colDeckImgRand1);
        
        int[] cartasSeleccionadas = {carta_1, carta_2, carta_3};
        ImageIcon[] cartasImgSeleccionadas = {carta_1_img, carta_2_img, carta_3_img};

        //IMG DE CARTAS
        // JFrame frame = new JFrame("tus cartas");
        // frame.setSize(500, 200);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JPanel panel = new JPanel(new GridLayout(1, 3));

        // for (int i = 0; i < cartasSeleccionadas.length; i++){
        //     try {
        //         BufferedImage image = ImageIO.read(pruebas2.class.getResource(cartasImgSeleccionadas[i]));
        //         JLabel label = new JLabel(new ImageIcon(image));
        //         panel.add(label);
        //     } catch(IOException e){
        //         e.printStackTrace();
        //     }
        // }
        // frame.getContentPane().add(panel);

        // frame.setVisible(true);
        JOptionPane.showMessageDialog(null, carta_3_img, "display Image", JOptionPane.INFORMATION_MESSAGE);
    }
}
