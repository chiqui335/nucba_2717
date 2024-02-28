package Introduccion_Programacion.FINAL;

import java.io.IOException;
import java.nio.file.Paths;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*; 
import java.io.File;
import java.util.Scanner;

public class Mini_truco {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
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
        
        deckImg[0][0] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/esp1.png");
        deckImg[0][1] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/esp2.png");
        deckImg[0][2] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/esp3.png");
        deckImg[0][3] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/esp4.png");
        deckImg[0][4] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/esp5.png");
        deckImg[0][5] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/esp6.png");
        deckImg[0][6] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/esp7.png");
        deckImg[0][7] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/esp10.png");
        deckImg[0][8] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/esp11.png");
        deckImg[0][9] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/esp12.png");
        deckImg[1][0] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/basto1.png"); 
        deckImg[1][1] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/basto2.png");
        deckImg[1][2] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/basto3.png"); 
        deckImg[1][3] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/basto4.png");
        deckImg[1][4] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/basto5.png");
        deckImg[1][5] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/basto6.png");
        deckImg[1][6] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/basto7.png");
        deckImg[1][7] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/basto10.png");
        deckImg[1][8] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/basto11.png");
        deckImg[1][9] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/basto12.png");
        deckImg[2][0] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/oro1.png");
        deckImg[2][1] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/oro2.png");
        deckImg[2][2] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/oro3.png");
        deckImg[2][3] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/oro4.png");
        deckImg[2][4] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/oro5.png");
        deckImg[2][5] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/oro6.png");
        deckImg[2][6] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/oro7.png");
        deckImg[2][7] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/oro10.png");
        deckImg[2][8] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/oro11.png");
        deckImg[2][9] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/oro12.png");
        deckImg[3][0] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/copa1.png");
        deckImg[3][1] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/copa2.png");
        deckImg[3][2] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/copa3.png");
        deckImg[3][3] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/copa4.png");
        deckImg[3][4] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/copa5.png");
        deckImg[3][5] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/copa6.png");
        deckImg[3][6] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/copa7.png");
        deckImg[3][7] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/copa10.png");
        deckImg[3][8] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/copa11.png");
        deckImg[3][9] = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/copa12.png");

         //----------------------------------------------------------------

        int filaDeck = deck.length;
        int colDeck = deck[0].length;

        int puntajeUser = 0;
        int puntajePC = 0;

        do{

            //seccion cartas del usuario
        //genero un random para las cartas del usuario:
        int filaDeckRand1 =  (int) (Math.random() * filaDeck);
        int colDeckRand1 =   (int) (Math.random() * colDeck);

        int filaDeckRand2 =  (int) (Math.random() * filaDeck);
        int colDeckRand2 =   (int) (Math.random() * colDeck);

        int filaDeckRand3 =  (int) (Math.random() * filaDeck);
        int colDeckRand3 =   (int) (Math.random() * colDeck);

        //hago coincidir deck con deckEnvido
        int filaDeckEnv1 = filaDeckRand1;
        int colDeckEnv1 = colDeckRand1;

        int filaDeckEnv2 = filaDeckRand2;
        int colDeckEnv2 = colDeckRand2;

        int filaDeckEnv3 = filaDeckRand3;
        int colDeckEnv3 = colDeckRand3;

        //hago coincidir deck con deckImg
        int filaDeckImgRand1 = filaDeckRand1;
        int colDeckImgRand1 = colDeckRand1;

        int filaDeckImgRand2 = filaDeckRand2;
        int colDeckImgRand2 = colDeckRand2;

        int filaDeckImgRand3 = filaDeckRand3;
        int colDeckImgRand3 = colDeckRand3;

        //cartas que tocan al usuario
        int carta_1 = deck[filaDeckRand1][colDeckRand1];
        int carta_2 = deck[filaDeckRand2][colDeckRand2];
        int carta_3 = deck[filaDeckRand3][colDeckRand3];

        //Valor de las cartas para envido
        int cartaEnv_1 = deckEnvido[filaDeckEnv1][colDeckEnv1];
        int cartaEnv_2 = deckEnvido[filaDeckEnv2][colDeckEnv2];
        int cartaEnv_3 = deckEnvido[filaDeckEnv3][colDeckEnv3];

        //imgs de las cartas usuario
        ImageIcon carta_1_img = deckImg[filaDeckImgRand1][colDeckImgRand1];
        ImageIcon carta_2_img = deckImg[filaDeckImgRand2][colDeckImgRand2];
        ImageIcon carta_3_img = deckImg[filaDeckImgRand3][colDeckImgRand3];

        //seccion cartas del PC
        //genero un random para las cartas del usuario:
        int filaDeckRandPC1 =  (int) (Math.random() * filaDeck);
        int colDeckRandPC1 =   (int) (Math.random() * colDeck);

        int filaDeckRandPC2 =  (int) (Math.random() * filaDeck);
        int colDeckRandPC2 =   (int) (Math.random() * colDeck);

        int filaDeckRandPC3 =  (int) (Math.random() * filaDeck);
        int colDeckRandPC3 =   (int) (Math.random() * colDeck);

        //hago coincidir deck con deckEnvido
        int filaDeckEnvPC1 = filaDeckRandPC1;
        int colDeckEnvPC1 = colDeckRandPC1;

        int filaDeckEnvPC2 = filaDeckRandPC2;
        int colDeckEnvPC2 = colDeckRandPC2;

        int filaDeckEnvPC3 = filaDeckRandPC3;
        int colDeckEnvPC3 = colDeckRandPC3;

        //cartas que tocan a la PC
        int carta_1_PC = deck[filaDeckRandPC1][colDeckRandPC1];
        int carta_2_PC = deck[filaDeckRandPC2][colDeckRandPC2];
        int carta_3_PC = deck[filaDeckRandPC3][colDeckRandPC3];

        //Valor de las cartas para envido PC
        int cartaEnv_1_PC = deckEnvido[filaDeckEnvPC1][colDeckEnvPC1];
        int cartaEnv_2_PC = deckEnvido[filaDeckEnvPC2][colDeckEnvPC2];
        int cartaEnv_3_PC = deckEnvido[filaDeckEnvPC3][colDeckEnvPC3];


        // //////////////////////////////////////////////////////////////
        // //test2 para ver si todo coincide
        // System.out.println("carta 1: " + carta_1 + " Palo: " + filaDeckRand1);
        // System.out.println("carta 2: " + carta_2 + " Palo: " + filaDeckRand2);
        // System.out.println("carta 3: " + carta_3 + " Palo: " + filaDeckRand3);

        // //test para saber si coinciden los array
        // System.out.println("deck fila: " + filaDeckRand1 + " col fila: " + colDeckRand1 + " " + carta_1);
        // System.out.println("img fila: " + filaDeckImgRand1 + " img col: " + colDeckImgRand1 + " " + carta_1_img);
        // System.out.println("deck envido: " + filaDeckEnv1 + " col envido: " + colDeckEnv1 + " " + cartaEnv_1);
        // /////////////////////////////////////////////////////////////
       
        
        
        int[] cartasSeleccionadasUser = {carta_1, carta_2, carta_3};
        ImageIcon[] cartasImgSeleccionadasUser = {carta_1_img, carta_2_img, carta_3_img};

        int[] cartasSeleccionadasPC = {carta_1_PC, carta_2_PC, carta_3_PC};

        System.out.println("carta 1: " + carta_1 + " Palo: " + filaDeckRand1);
        System.out.println("carta 2: " + carta_2 + " Palo: " + filaDeckRand2);
        System.out.println("carta 3: " + carta_3 + " Palo: " + filaDeckRand3);

        System.out.println("carta 1 PC: " + carta_1_PC + " Palo: " + filaDeckRandPC1);
        System.out.println("carta 2 PC: " + carta_2_PC + " Palo: " + filaDeckRandPC2);
        System.out.println("carta 3 PC: " + carta_3_PC + " Palo: " + filaDeckRandPC3);
        
            ////////////////////////////////////////////////////////////////////

            // String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");

            

        // ImageIcon TEST = new ImageIcon ("");
        //     JOptionPane.showMessageDialog(null,
        //                                 " TU CARTA ",
        //                                 "carta_1_img",
        //                                 JOptionPane.PLAIN_MESSAGE,
        //                                 carta_1_img);


    


   

    // Crear un panel para contener las imágenes
    JPanel panel = new JPanel();
    panel.add(new JLabel(carta_1_img));
    panel.add(new JLabel(carta_2_img));
    panel.add(new JLabel(carta_3_img));

    // Mostrar el panel en JOptionPane
    JOptionPane.showMessageDialog(
            null,
            panel,
            "Tus cartas",
            JOptionPane.PLAIN_MESSAGE);

                                        

        } while (true);

    }
}

//TO DO: IMAGENES Y VERIFICAR QUE LAS CARTAS NO SE REPITAN (puedo usar if carta 1 = carta 1 pc && carta 1 = carta 2 pc etc...)
