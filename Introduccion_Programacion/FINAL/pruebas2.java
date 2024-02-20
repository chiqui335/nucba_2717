package Introduccion_Programacion.FINAL;

import java.io.IOException;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*; 
import java.io.File;
import java.util.Scanner;
public class pruebas2 {
    public static void main(String[] args){
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
            //JUGADAS

        boolean carta1Seleccionada = false;
        boolean carta2Seleccionada = false;
        boolean carta3Seleccionada = false;

        boolean carta1SeleccionadaPC = false;
        boolean carta2SeleccionadaPC = false;
        boolean carta3SeleccionadaPC = false;

        boolean EnvidoCantado = false;

        boolean TrucoCantado = false;
        
        int cartaJugadaUser = 0;
        int cartaJugadaPC = 0;

        int manosGanadasUser = 0;
        int manosGanadasPC = 0;

        int Mano1;

        do {
            System.out.print("Ingresa el número de la carta (1, 2 o 3): ");
            Mano1 = sc.nextInt();

            switch (Mano1) {
                case 1:
                    if (!carta1Seleccionada) {
                        System.out.println("elegiste carta 1");
                        carta1Seleccionada = true;
                        Mano1 = 0;  // Establecer Mano1 en un valor que no sea 1, 2, 3, 4 o 5 para salir del bucle

                        cartaJugadaUser = carta_1;

                        System.out.println("la carta jugada es: " + cartaJugadaUser);
                    } else {
                        System.out.println("ya elegiste la carta 1");
                    }
                        break;

                case 2:
                    if (!carta2Seleccionada) {
                        System.out.println("elegiste carta 2");
                        carta2Seleccionada = true;
                        Mano1 = 0;

                        cartaJugadaUser = carta_2;
                    } else {
                        System.out.println("ya elegiste la carta 2");
                    }
                        break;

                case 3:
                    if (!carta3Seleccionada) {
                        System.out.println("elegiste carta 3");
                        carta3Seleccionada = true;
                        Mano1 = 0;  
                    
                        cartaJugadaUser = carta_3;
                    } else {
                        System.out.println("ya elegiste la carta 3");
                    }
                        break;

                case 4:
                    System.out.println("elegiste truco");
                    Mano1 = 0;
                    break;

                case 5:
                    System.out.println("elegiste envido");
                    EnvidoCantado = true;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (Mano1 >= 1 && Mano1 <= 3);
        
        //ENVIDO
        if (EnvidoCantado) {
            int PuntajeEnvPC = 0;
            int PuntajeEnvUser= 0;

            if (filaDeckEnv1 == filaDeckEnv2) {
                PuntajeEnvUser = cartaEnv_1 + cartaEnv_2 + 20;
            }else if (filaDeckEnv2 == filaDeckEnv3){
                PuntajeEnvUser = cartaEnv_2 + cartaEnv_3 + 20;
            }else{
                PuntajeEnvUser = cartaEnv_1 + cartaEnv_3 + 20;
            }

            if (filaDeckRandPC1 == filaDeckRandPC2) {
                PuntajeEnvPC = cartaEnv_1_PC + cartaEnv_2_PC + 20;
            }else if (filaDeckRandPC2 == filaDeckRandPC3){
                PuntajeEnvPC = cartaEnv_2_PC + cartaEnv_3_PC + 20;
            }else{ 
                PuntajeEnvPC = cartaEnv_1_PC + cartaEnv_3_PC + 20;
            }


            if (PuntajeEnvUser > PuntajeEnvPC){
                System.out.println("El usuario gana el envido");
                System.out.println("user: " + PuntajeEnvUser + " " + "PC: " + PuntajeEnvPC);
            }else{
                System.out.println("La PC gana el envido");
                System.out.println("user: " + PuntajeEnvUser + " " + "PC: " + PuntajeEnvPC);
            }
        }

        ////////////////////////////////

        if (EnvidoCantado) {
            EnvidoCantado = false;
            do {
                System.out.print("Ingresa el número de la carta (1, 2 o 3): ");
                Mano1 = sc.nextInt();
    
                switch (Mano1) {
                    case 1:
                        if (!carta1Seleccionada) {
                            System.out.println("elegiste carta 1");
                            carta1Seleccionada = true;
                            Mano1 = 0;  

                            cartaJugadaUser = carta_1;
    
                        } else {
                            System.out.println("ya elegiste la carta 1");
                        }
                            break;
    
                    case 2:
                        if (!carta2Seleccionada) {
                            System.out.println("elegiste carta 2");
                            carta2Seleccionada = true;
                            Mano1 = 0;

                            cartaJugadaUser = carta_2;

                        } else {
                            System.out.println("ya elegiste la carta 2");
                        }
                            break;
    
                    case 3:
                        if (!carta3Seleccionada) {
                            System.out.println("elegiste carta 3");
                            carta3Seleccionada = true;
                            Mano1 = 0;  

                            cartaJugadaUser = carta_3;

                        } else {
                            System.out.println("ya elegiste la carta 3");
                        }
                            break;
        
                    case 4:
                        System.out.println("elegiste truco");
                        TrucoCantado = true;
                        Mano1 = 0;  
                        break;
    
                    default:
                        System.out.println("Opción no válida.");
                }
            } while (Mano1 >= 1 && Mano1 <= 3);
        }

        if(TrucoCantado){
            //truco
        }

        int Mano1PC;

        do {
            System.out.print("Ingresa el número de la carta PC (1, 2 o 3): ");
            Mano1PC = (int) (Math.random()* 3) + 1;

            switch (Mano1PC) {
                case 1:
                    if (!carta1SeleccionadaPC) {
                        System.out.println("elegiste carta 1");
                        carta1SeleccionadaPC = true;
                        Mano1PC = 0;

                        cartaJugadaPC = carta_1_PC;
                    } else {
                        System.out.println("ya elegiste la carta 1");
                    }
                        break;

                case 2:
                    if (!carta2SeleccionadaPC) {
                        System.out.println("elegiste carta 2");
                        carta2SeleccionadaPC = true;
                        Mano1PC = 0;

                        cartaJugadaPC = carta_2_PC;
                    } else {
                        System.out.println("ya elegiste la carta 2");
                    }
                        break;

                case 3:
                    if (!carta3SeleccionadaPC) {
                        System.out.println("elegiste carta 3");
                        carta3SeleccionadaPC = true;
                        Mano1PC = 0;  // Establecer Mano1PC en un valor que no sea 1, 2 o 3 para salir del bucle

                        cartaJugadaPC = carta_3_PC;
                    } else {
                        System.out.println("ya elegiste la carta 3");
                    }
                        break;

                // case 4:
                //     System.out.println("elegiste truco");
                //     break;

                // case 5:
                //     System.out.println("elegiste envido");
                //     EnvidoCantado = true;
                //     break;

                default:
                    break;
            }
        } while (Mano1PC >= 1 && Mano1PC <= 3);
        
        // //ENVIDO PC
        // if (EnvidoCantado) {
        //     int PuntajeEnvPC = 0;
        //     int PuntajeEnvUser= 0;

        //     if (filaDeckEnv1 == filaDeckEnv2) {
        //         PuntajeEnvUser = cartaEnv_1 + cartaEnv_2 + 20;
        //     }else if (filaDeckEnv2 == filaDeckEnv3){
        //         PuntajeEnvUser = cartaEnv_2 + cartaEnv_3 + 20;
        //     }else{
        //         PuntajeEnvUser = cartaEnv_1 + cartaEnv_3 + 20;
        //     }

        //     if (filaDeckRandPC1 == filaDeckRandPC2) {
        //         PuntajeEnvPC = cartaEnv_1_PC + cartaEnv_2_PC + 20;
        //     }else if (filaDeckRandPC2 == filaDeckRandPC3){
        //         PuntajeEnvPC = cartaEnv_2_PC + cartaEnv_3_PC + 20;
        //     }else{ 
        //         PuntajeEnvPC = cartaEnv_1_PC + cartaEnv_3_PC + 20;
        //     }


        //     if (PuntajeEnvUser > PuntajeEnvPC){
        //         System.out.println("El usuario gana el envido");
        //         System.out.println("user: " + PuntajeEnvUser + " " + "PC: " + PuntajeEnvPC);
        //     }else{
        //         System.out.println("La PC gana el envido");
        //         System.out.println("user: " + PuntajeEnvUser + " " + "PC: " + PuntajeEnvPC);
        //     }
        // }
        // ////////////////////////////////

        // if (EnvidoCantado) {
        //     do {
        //         System.out.print("Ingresa el número de la carta PC (1, 2 o 3): ");
        //         Mano1PC = (int) (Math.random()* 3) + 1;
    
        //         switch (Mano1PC) {
        //             case 1:
        //                 if (!carta1SeleccionadaPC) {
        //                     System.out.println("elegiste carta 1");
        //                     carta1SeleccionadaPC = true;
        //                     Mano1PC = 0;
    
        //                 } else {
        //                     System.out.println("ya elegiste la carta 1");
        //                 }
        //                     break;
    
        //             case 2:
        //                 if (!carta2SeleccionadaPC) {
        //                     System.out.println("elegiste carta 2");
        //                     carta2SeleccionadaPC = true;
        //                     Mano1PC = 0;
        //                 } else {
        //                     System.out.println("ya elegiste la carta 2");
        //                 }
        //                     break;
    
        //             case 3:
        //                 if (!carta3SeleccionadaPC) {
        //                     System.out.println("elegiste carta 3");
        //                     carta3SeleccionadaPC = true;
        //                     Mano1PC = 0;  // Establecer Mano1PC en un valor que no sea 1, 2 o 3 para salir del bucle
        //                 } else {
        //                     System.out.println("ya elegiste la carta 3");
        //                 }
        //                     break;
    
        //             case 4:
        //                 System.out.println("elegiste truco");
        //                 break;

    
        //             default:
        //                 break;
        //         }
        //     } while (Mano1PC >= 1 && Mano1PC <= 3);
        // }
 
        if (cartaJugadaUser >= cartaJugadaPC) {
            manosGanadasUser++;
            System.out.println("El usuario gana la primer mano");
        } else {                                      //aca se checkea cual carta jugada entre user y pc gana la mano, y se suma al contador manosganadas
            manosGanadasPC++;
            System.out.println("La PC gana la primer mano");
        }

        int Mano2;

        do {
            System.out.print("Ingresa el número de la carta (1, 2 o 3): ");
            Mano2 = sc.nextInt();

            switch (Mano2) {
                case 1:
                    if (!carta1Seleccionada) {
                        System.out.println("elegiste carta 1");
                        carta1Seleccionada = true;
                        Mano2 = 0;  

                        cartaJugadaUser = carta_1;

                    } else {
                        System.out.println("ya elegiste la carta 1");
                    }
                        break;

                case 2:
                    if (!carta2Seleccionada) {
                        System.out.println("elegiste carta 2");
                        carta2Seleccionada = true;
                        Mano2 = 0;

                        cartaJugadaUser = carta_2;

                    } else {
                        System.out.println("ya elegiste la carta 2");
                    }
                        break;

                case 3:
                    if (!carta3Seleccionada) {
                        System.out.println("elegiste carta 3");
                        carta3Seleccionada = true;
                        Mano2 = 0;  

                        cartaJugadaUser = carta_3;
                    } else {
                        System.out.println("ya elegiste la carta 3");
                    }
                        break;

                case 4:
                    System.out.println("elegiste truco");
                    Mano2 = 0;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (Mano2 >= 1 && Mano2 <= 3);

        if(TrucoCantado){
            //truco
        }

        int Mano2PC;

        do {
            System.out.print("Ingresa el número de la carta PC (1, 2 o 3): ");
            Mano2PC = (int) (Math.random()* 3) + 1;

            switch (Mano2PC) {
                case 1:
                    if (!carta1SeleccionadaPC) {
                        System.out.println("elegiste carta 1");
                        carta1SeleccionadaPC = true;
                        Mano2PC = 0;

                        cartaJugadaPC = carta_1_PC;

                    } else {
                        System.out.println("ya elegiste la carta 1");
                    }
                        break;

                case 2:
                    if (!carta2SeleccionadaPC) {
                        System.out.println("elegiste carta 2");
                        carta2SeleccionadaPC = true;
                        Mano2PC = 0;

                        cartaJugadaPC = carta_1_PC;

                    } else {
                        System.out.println("ya elegiste la carta 2");
                    }
                        break;

                case 3:
                    if (!carta3SeleccionadaPC) {
                        System.out.println("elegiste carta 3");
                        carta3SeleccionadaPC = true;
                        Mano2PC = 0;  

                        cartaJugadaPC = carta_3_PC;

                    } else {
                        System.out.println("ya elegiste la carta 3");
                    }
                        break;

                case 4:
                    System.out.println("elegiste truco");
                    break;

                default:
                    break;
            }
        } while (Mano2PC >= 1 && Mano2PC <= 3);

        if (cartaJugadaUser >= cartaJugadaPC) {
            manosGanadasUser++;
            System.out.println("El usuario gana la segunda mano");
        } else {                                      //aca se checkea por 2da vez cual carta jugada entre user y pc gana la mano, y se suma al contador manosGanadas
            manosGanadasPC++;
            System.out.println("La PC gana la segunda mano");
        }

        if(manosGanadasUser == 2) {
            puntajeUser++;
            System.out.println("El usuario gana la ronda");
            System.out.println("puntaje usuario: " + puntajeUser + ", puntaje PC: " + puntajePC);
            continue;           //se saltea el resto del loop y comienza una nueva iteracion desde el principio
        }else {
            if (manosGanadasPC == 2){
                puntajePC++;
                System.out.println("La PC gana la ronda");
                System.out.println("puntaje usuario: " + puntajeUser + ", puntaje PC: " + puntajePC);
                continue;
            }
        }

        int Mano3;

        do {
            System.out.print("Ingresa el número de la carta (1, 2 o 3): ");
            Mano3 = sc.nextInt();

            switch (Mano3) {
                case 1:
                    if (!carta1Seleccionada) {
                        System.out.println("elegiste carta 1");
                        carta1Seleccionada = true;
                        Mano3 = 0;  

                        cartaJugadaUser = carta_1;

                    } else {
                        System.out.println("ya elegiste la carta 1");
                    }
                        break;

                case 2:
                    if (!carta2Seleccionada) {
                        System.out.println("elegiste carta 2");
                        carta2Seleccionada = true;
                        Mano3 = 0;

                        cartaJugadaUser = carta_2;
                    } else {
                        System.out.println("ya elegiste la carta 2");
                    }
                        break;

                case 3:
                    if (!carta3Seleccionada) {
                        System.out.println("elegiste carta 3");
                        carta3Seleccionada = true;
                        Mano3 = 0;  

                        cartaJugadaUser = carta_3;
                    } else {
                        System.out.println("ya elegiste la carta 3");
                    }
                        break;

                case 4:
                    System.out.println("elegiste truco");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (Mano3 >= 1 && Mano3 <= 3);

        if(TrucoCantado){
            //truco
        }

        int Mano3PC;

        do {
            System.out.print("Ingresa el número de la carta PC (1, 2 o 3): ");
            Mano3PC = (int) (Math.random()* 3) + 1;

            switch (Mano3PC) {
                case 1:
                    if (!carta1SeleccionadaPC) {
                        System.out.println("elegiste carta 1");
                        carta1SeleccionadaPC = true;
                        Mano3PC = 0;

                        cartaJugadaPC = carta_1_PC;

                    } else {
                        System.out.println("ya elegiste la carta 1");
                    }
                        break;

                case 2:
                    if (!carta2SeleccionadaPC) {
                        System.out.println("elegiste carta 2");
                        carta2SeleccionadaPC = true;
                        Mano3PC = 0;

                        cartaJugadaPC = carta_2_PC;
                        
                    } else {
                        System.out.println("ya elegiste la carta 2");
                    }
                        break;

                case 3:
                    if (!carta3SeleccionadaPC) {
                        System.out.println("elegiste carta 3");
                        carta3SeleccionadaPC = true;
                        Mano3PC = 0;  

                        cartaJugadaPC = carta_3_PC;

                    } else {
                        System.out.println("ya elegiste la carta 3");
                    }
                        break;

                case 5:
                    System.out.println("elegiste truco");
                    break;

                default:
                    break;
            }
        } while (Mano3PC >= 1 && Mano3PC <= 3);

        if (cartaJugadaUser >= cartaJugadaPC) {
            manosGanadasUser++;
            System.out.println("El usuario gana la tercer mano");
        } else {                                      //aca se checkea por 3ra vez cual carta jugada entre user y pc gana la mano, y se suma al contador manosganadas
            manosGanadasPC++;
            System.out.println("La PC gana la tercer mano");
        }

        if(manosGanadasUser == 2) {
            puntajeUser++;
            System.out.println("El usuario gana la ronda");
            System.out.println("puntaje usuario: " + puntajeUser + ", puntaje PC: " + puntajePC);
            continue;           //se saltea el resto del loop y comienza una nueva iteracion desde el principio
        }else {
            if (manosGanadasPC == 2){
                puntajePC++;
                System.out.println("La PC gana la ronda");
                System.out.println("puntaje usuario: " + puntajeUser + ", puntaje PC: " + puntajePC);
                continue;
            }
        }

        } while (puntajeUser <= 15 || puntajePC <= 15);

        if (puntajeUser >= 15){
            System.out.println("El ganador de la partida es el usuario");
        }else{
            
        }
        
        ////////////////////////////////////////////////////////////////////  
    }
}