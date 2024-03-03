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


        do{

            int carta_1, carta_2, carta_3;

            int filaDeckRand1, filaDeckRand2, filaDeckRand3;
            int colDeckRand1, colDeckRand2, colDeckRand3;
        
            do{
                    //seccion cartas del usuario
            //genero un random para las cartas del usuario:
            filaDeckRand1 =  (int) (Math.random() * filaDeck);
            colDeckRand1 =   (int) (Math.random() * colDeck);

            filaDeckRand2 =  (int) (Math.random() * filaDeck);
            colDeckRand2 =   (int) (Math.random() * colDeck);

            filaDeckRand3 =  (int) (Math.random() * filaDeck);
            colDeckRand3 =   (int) (Math.random() * colDeck);

            //cartas que tocan al usuario
            carta_1 = deck[filaDeckRand1][colDeckRand1];
            carta_2 = deck[filaDeckRand2][colDeckRand2];
            carta_3 = deck[filaDeckRand3][colDeckRand3];

            } while (carta_1 == carta_2 || carta_2 == carta_3 || carta_1 == carta_3);

        
        //hago coincidir deck con deckImg
        int filaDeckImgRand1 = filaDeckRand1;
        int colDeckImgRand1 = colDeckRand1;

        int filaDeckImgRand2 = filaDeckRand2;
        int colDeckImgRand2 = colDeckRand2;

        int filaDeckImgRand3 = filaDeckRand3;
        int colDeckImgRand3 = colDeckRand3;


        //imgs de las cartas usuario
        ImageIcon carta_1_img = deckImg[filaDeckImgRand1][colDeckImgRand1];
        ImageIcon carta_2_img = deckImg[filaDeckImgRand2][colDeckImgRand2];
        ImageIcon carta_3_img = deckImg[filaDeckImgRand3][colDeckImgRand3];

        

        

        //seccion cartas del PC
        int carta_1_PC, carta_2_PC, carta_3_PC;

        int filaDeckRandPC1, filaDeckRandPC2, filaDeckRandPC3;
        int colDeckRandPC1, colDeckRandPC2, colDeckRandPC3;

        for (;;) {
            // Genero un random para las cartas del PC:
            filaDeckRandPC1 = (int) (Math.random() * filaDeck);
            colDeckRandPC1 = (int) (Math.random() * colDeck);
        
            filaDeckRandPC2 = (int) (Math.random() * filaDeck);
            colDeckRandPC2 = (int) (Math.random() * colDeck);
        
            filaDeckRandPC3 = (int) (Math.random() * filaDeck);
            colDeckRandPC3 = (int) (Math.random() * colDeck);
        
            // Cartas que tocan a la PC
            carta_1_PC = deck[filaDeckRandPC1][colDeckRandPC1];
            carta_2_PC = deck[filaDeckRandPC2][colDeckRandPC2];
            carta_3_PC = deck[filaDeckRandPC3][colDeckRandPC3];
        
            if (!((carta_1 == carta_1_PC || carta_1 == carta_2_PC || carta_1 == carta_3_PC) ||
                  (carta_2 == carta_1_PC || carta_2 == carta_2_PC || carta_2 == carta_3_PC) ||
                  (carta_3 == carta_1_PC || carta_3 == carta_2_PC || carta_3 == carta_3_PC) ||
                  (carta_1_PC == carta_2_PC || carta_2_PC == carta_3_PC || carta_1_PC == carta_3_PC))) {
                break; // Salir del bucle si la condición no se cumple
            }
        }
        
        //hago coincidir deck con deckImg
        int filaDeckImgPCRand1 = filaDeckRandPC1;
        int colDeckImgPCRand1 = colDeckRandPC1;

        int filaDeckImgPCRand2 = filaDeckRandPC2;
        int colDeckImgPCRand2 = colDeckRandPC2;

        int filaDeckImgPCRand3 = filaDeckRandPC3;
        int colDeckImgPCRand3 = colDeckRandPC3;

        
        //imgs de las cartas PC
        ImageIcon carta_1_imgPC = deckImg[filaDeckImgPCRand1][colDeckImgPCRand1];
        ImageIcon carta_2_imgPC = deckImg[filaDeckImgPCRand2][colDeckImgPCRand2];
        ImageIcon carta_3_imgPC = deckImg[filaDeckImgPCRand3][colDeckImgPCRand3];



    // Crear un panel para contener las imágenes
    JPanel CartasMano1 = new JPanel();
    CartasMano1.add(new JLabel(carta_1_img));
    CartasMano1.add(new JLabel(carta_2_img)); //en vez de "panel" uso CartasImg1 para distinguir entre manos
    CartasMano1.add(new JLabel(carta_3_img));

    String[] opciones = {"ok", "cancel"};


    

            int Mostrarmanouser = JOptionPane.showOptionDialog(
                null,
                CartasMano1,
    
                "cartas user",
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]
            );
            


            JPanel manopc = new JPanel();
            manopc.add(new JLabel(carta_1_imgPC));
            manopc.add(new JLabel(carta_2_imgPC));
            manopc.add(new JLabel(carta_3_imgPC));
    
            String[] PC = {"Ok", "cancel"};
    
            int MostrarmanoPC = JOptionPane.showOptionDialog(
                null,
                manopc,
    
                "cartas PC",
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE,
                null,
                PC,
                PC[0]
            );
         

    

        } while (true);

    }
}

//TO DO: IMAGENES Y

