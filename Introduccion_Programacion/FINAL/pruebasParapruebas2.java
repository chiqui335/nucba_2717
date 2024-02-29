package Introduccion_Programacion.FINAL;

import java.io.IOException;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*; 
import java.io.File;
import java.util.Scanner;
public class pruebasParapruebas2 {
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


        //Valor de las cartas para envido
        int cartaEnv_1 = deckEnvido[filaDeckEnv1][colDeckEnv1];
        int cartaEnv_2 = deckEnvido[filaDeckEnv2][colDeckEnv2];
        int cartaEnv_3 = deckEnvido[filaDeckEnv3][colDeckEnv3];

        //imgs de las cartas usuario
        ImageIcon carta_1_img = deckImg[filaDeckImgRand1][colDeckImgRand1];
        ImageIcon carta_2_img = deckImg[filaDeckImgRand2][colDeckImgRand2];
        ImageIcon carta_3_img = deckImg[filaDeckImgRand3][colDeckImgRand3];

        

        //seccion cartas del PC
        int carta_1_PC, carta_2_PC, carta_3_PC;

        int filaDeckRandPC1, filaDeckRandPC2, filaDeckRandPC3;
        int colDeckRandPC1, colDeckRandPC2, colDeckRandPC3;

        do{
            //genero un random para las cartas del PC:
            filaDeckRandPC1 =  (int) (Math.random() * filaDeck);
            colDeckRandPC1 =   (int) (Math.random() * colDeck);

            filaDeckRandPC2 =  (int) (Math.random() * filaDeck);
            colDeckRandPC2 =   (int) (Math.random() * colDeck);

            filaDeckRandPC3 =  (int) (Math.random() * filaDeck);
            colDeckRandPC3 =   (int) (Math.random() * colDeck);

            //cartas que tocan a la PC
            carta_1_PC = deck[filaDeckRandPC1][colDeckRandPC1];
            carta_2_PC = deck[filaDeckRandPC2][colDeckRandPC2];
            carta_3_PC = deck[filaDeckRandPC3][colDeckRandPC3];


        } while ((carta_1 == carta_1_PC || carta_1 == carta_2_PC || carta_1 == carta_3_PC) ||
                (carta_2 == carta_1_PC || carta_2 == carta_2_PC || carta_2 == carta_3_PC)  ||
                (carta_3 == carta_1_PC || carta_3 == carta_2_PC || carta_3 == carta_3_PC) ||
                (carta_1_PC == carta_2_PC || carta_2_PC == carta_3_PC || carta_1_PC == carta_3_PC));


        //hago coincidir deck con deckEnvido
        int filaDeckEnvPC1 = filaDeckRandPC1;
        int colDeckEnvPC1 = colDeckRandPC1;

        int filaDeckEnvPC2 = filaDeckRandPC2;
        int colDeckEnvPC2 = colDeckRandPC2;

        int filaDeckEnvPC3 = filaDeckRandPC3;
        int colDeckEnvPC3 = colDeckRandPC3;

        

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

        boolean trucoQuerido = false;
        boolean retrucoQuerido = false;
        boolean valeCuatroQuerido = false;

        Boolean EnvidoEjecutado = false;
        Boolean TrucoEjecutado = false;



        int Mano1 = 1;
        
        String seleccion = ""; // le doy un valor por defecto a la variable para que el switch no se queje

        do {
            

            // Crear un panel para contener las imágenes
            JPanel CartasMano1 = new JPanel();
            CartasMano1.add(new JLabel(carta_1_img));
            CartasMano1.add(new JLabel(carta_2_img));    //en vez de "panel" uso CartasImg1 para distinguir entre manos
            CartasMano1.add(new JLabel(carta_3_img));
            

            String[] opciones = {"Jugar primera carta", "Jugar segunda carta", "Jugar tercera carta", "Cantar Envido", "Cantar truco"};
            JComboBox<String> comboBox = new JComboBox<>(opciones);
            CartasMano1.add(comboBox);

            // Mostrar el panel en JOptionPane
            int result = JOptionPane.showConfirmDialog(
                    null,
                    CartasMano1,
                    "Tus cartas",
                    JOptionPane.PLAIN_MESSAGE);

            if (result == JOptionPane.OK_OPTION) {
                seleccion = (String) comboBox.getSelectedItem();   
            }

            switch (seleccion) {
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
        
        //ENVIDO USER
        if (EnvidoCantado == true && EnvidoEjecutado == false) {

            EnvidoEjecutado = true;

            if (filaDeckRandPC1 == filaDeckRandPC2 || filaDeckRandPC2 == filaDeckRandPC3 || filaDeckRandPC1 == filaDeckRandPC3){
                System.out.println("La PC dice QUIERO");

                int PuntajeEnvPC = 0;
                int PuntajeEnvUser= 0;
    
                if (filaDeckEnv1 == filaDeckEnv2) {
                    PuntajeEnvUser = cartaEnv_1 + cartaEnv_2 + 20;
                }else if (filaDeckEnv2 == filaDeckEnv3){
                    PuntajeEnvUser = cartaEnv_2 + cartaEnv_3 + 20;
                }else if (filaDeckEnv1 == filaDeckEnv3){
                    PuntajeEnvUser = cartaEnv_1 + cartaEnv_3 + 20;
                } else {
                    PuntajeEnvUser = Math.max(cartaEnv_1, Math.max(cartaEnv_2, cartaEnv_3));
                    //se toman SOLO las cartas mas altas, en caso que tenga 3 del mismo palo
                }
    
                if (filaDeckRandPC1 == filaDeckRandPC2) {
                    PuntajeEnvPC = cartaEnv_1_PC + cartaEnv_2_PC + 20;
                }else if (filaDeckRandPC2 == filaDeckRandPC3){
                    PuntajeEnvPC = cartaEnv_2_PC + cartaEnv_3_PC + 20;
                }else if (filaDeckRandPC1 == filaDeckRandPC3){ 
                    PuntajeEnvPC = cartaEnv_1_PC + cartaEnv_3_PC + 20;
                } else {
                    PuntajeEnvPC = Math.max(cartaEnv_1_PC, Math.max(cartaEnv_2_PC, cartaEnv_3_PC)); 
                }
    
    
                if (PuntajeEnvUser >= PuntajeEnvPC){
                    System.out.println("El usuario gana el envido");
                    puntajeUser = puntajeUser + 2;
                    System.out.println("user: " + PuntajeEnvUser + " " + "PC: " + PuntajeEnvPC);
                }else{
                    System.out.println("La PC gana el envido");
                    puntajePC = puntajePC + 2;
                    System.out.println("user: " + PuntajeEnvUser + " " + "PC: " + PuntajeEnvPC);
                }
            } else {
                System.out.println("La PC dice NO QUIERO");
                puntajeUser++;
            }


            do {
                System.out.print("Ingresa el número de la carta (1, 2, 3 o 4): ");
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

        ////////////////////////////////


        //TRUCO USER
        if(TrucoCantado == true && TrucoEjecutado == false){

            TrucoEjecutado = true;

            System.out.println("cantaste truco");
            int decisionPCtruco = (int) (Math.random()* 3) + 1;
            int decisionUserREtruco = 0;

            switch (decisionPCtruco) {
                case 1:
                    System.out.println("La PC dice QUIERO");
                    trucoQuerido = true; 
                    
                    break;

                case 2:
                    System.out.println("La PC dice NO QUIERO");
                    puntajeUser++;
                    // TrucoCantado = false;
                    System.out.println("puntaje usuario: " + puntajeUser + ", puntaje PC: " + puntajePC);
                    continue;
                
                case 3:
                    System.out.println("La PC dice RETRUCO");
                    System.out.println("1 = quiero, 2 = NO quiero, 3 = VALECUATRO");
                    
                    decisionUserREtruco = sc.nextInt();

                    switch (decisionUserREtruco) {
                        case 1:
                            System.out.println("El usuario dice QUIERO");
                            retrucoQuerido = true;
                            break;
                        
                        case 2:
                            System.out.println("El usuario dice NO QUIERO");
                            puntajePC++;
                            // TrucoCantado = false;
                            System.out.println("puntaje usuario: " + puntajeUser + ", puntaje PC: " + puntajePC);
                            continue;

                        case 3:
                            System.out.println("El usuario dice VALECUATRO");

                            int decisionPCvalecuatro = (int) (Math.random()* 2) + 1;
                            if (decisionPCvalecuatro == 1){
                                System.out.println("La PC dice QUIERO");
                                valeCuatroQuerido = true;
                            } else {
                                System.out.println("La PC dice NO QUIERO");
                                puntajeUser = puntajeUser + 3;
                                // TrucoCantado = false;
                                System.out.println("puntaje usuario: " + puntajeUser + ", puntaje PC: " + puntajePC);
                                continue;
                            }

                        default:
                            break;
                    }
                default:
                    break;
            }


            do {
                System.out.print("Ingresa el número de la carta (1, 2, 3 o 4): ");
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

                    default:
                        System.out.println("Opción no válida.");
                }
            } while (Mano1 >= 1 && Mano1 <= 3);
        }

        ////////////////////////////////////////////////////////////////////////////////

        int Mano1PC;

        do {
            System.out.print("Ingresa el número de la carta PC (1, 2, 3 o 4): ");
            Mano1PC = (int) (Math.random()* 5) + 1;

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

                case 4:
                    if(TrucoCantado == false){
                        System.out.println("La PC canta TRUCO");
                        Mano1PC = 0;
                        TrucoCantado = true;
                    } else if(TrucoCantado == true){
                        System.out.println("Ya se cantó TRUCO, elige otra opción.");
                    }
                    break;

                case 5:
                    if ((EnvidoCantado == false)){
                        System.out.println("La PC canta ENVIDO");
                        Mano1PC = 0;
                        EnvidoCantado = true;
                        break;
                    } else if (EnvidoCantado == true){
                        System.out.println("Ya se cantó ENVIDO, elige otra opción.");
                    }
                    break;

                default:
                    break;
            }
        } while (Mano1PC >= 1 && Mano1PC <= 5);
        
        // //ENVIDO PC
        if (EnvidoCantado == true && EnvidoEjecutado == false) {

            EnvidoEjecutado = true;

            System.out.println("1: quiero 2: no quiero");
            int decisionUSERenvido = sc.nextInt();
            int PuntajeEnvPC = 0;
            int PuntajeEnvUser= 0;

            if (decisionUSERenvido == 1) {
                if (filaDeckEnv1 == filaDeckEnv2) {
                    PuntajeEnvUser = cartaEnv_1 + cartaEnv_2 + 20;
                }else if (filaDeckEnv2 == filaDeckEnv3){
                    PuntajeEnvUser = cartaEnv_2 + cartaEnv_3 + 20;
                }else if (filaDeckEnv1 == filaDeckEnv3){
                    PuntajeEnvUser = cartaEnv_1 + cartaEnv_3 + 20;
                } else {
                    PuntajeEnvUser = Math.max(cartaEnv_1, Math.max(cartaEnv_2, cartaEnv_3));
                }
    
                if (filaDeckRandPC1 == filaDeckRandPC2) {
                    PuntajeEnvPC = cartaEnv_1_PC + cartaEnv_2_PC + 20;
                }else if (filaDeckRandPC2 == filaDeckRandPC3){
                    PuntajeEnvPC = cartaEnv_2_PC + cartaEnv_3_PC + 20;
                }else if (filaDeckRandPC1 == filaDeckRandPC3){ 
                    PuntajeEnvPC = cartaEnv_1_PC + cartaEnv_3_PC + 20;
                } else {
                    PuntajeEnvPC = Math.max(cartaEnv_1_PC, Math.max(cartaEnv_2_PC, cartaEnv_3_PC)); 
                }
    
    
                if (PuntajeEnvUser >= PuntajeEnvPC){
                    System.out.println("El usuario gana el envido");
                    puntajeUser = puntajeUser + 2;
                    System.out.println("user: " + PuntajeEnvUser + " " + "PC: " + PuntajeEnvPC);
                }else{
                    System.out.println("La PC gana el envido");
                    puntajePC = puntajePC + 2;
                    System.out.println("user: " + PuntajeEnvUser + " " + "PC: " + PuntajeEnvPC);
                }
            } else {
                System.out.println("El usuario dice NO QUIERO");
                puntajePC++;
            }


            do {
                System.out.print("Ingresa el número de la carta PC (1, 2 o 3): ");
                Mano1PC = (int) (Math.random()* 4) + 1;
    
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

                case 4:
                    if(TrucoCantado == false){
                        System.out.println("La PC canta TRUCO");
                        Mano1PC = 0;
                        TrucoCantado = true;
                    } else if(TrucoCantado == true){
                        System.out.println("Ya se cantó TRUCO, elige otra opción.");
                    }
                    break;


                default:
                    break;
                }
            } while (Mano1PC >= 1 && Mano1PC <= 3);
        }
        ////////////////////////////////
 
        
            //TRUCO PC
        if(TrucoCantado == true && TrucoEjecutado == false){

            TrucoEjecutado = true;

            System.out.println("1 = quiero, 2 = NO quiero, 3 = RETRUCO");
            int decisionUSERtruco = sc.nextInt();
            int decisionPCREtruco = 0;

            switch (decisionUSERtruco) {
                case 1:
                    System.out.println("El usuario dice QUIERO");
                    trucoQuerido = true; 
                    
                    break;

                case 2:
                    System.out.println("El usuario dice NO QUIERO");
                    puntajePC++;
                    // TrucoCantado = false;
                    System.out.println("puntaje usuario: " + puntajeUser + ", puntaje PC: " + puntajePC);
                    continue;
                
                case 3:
                    System.out.println("El Usuario dice RETRUCO");

                    decisionPCREtruco = (int) (Math.random()* 3) + 1;

                    switch (decisionPCREtruco) {
                        case 1:
                            System.out.println("La PC dice QUIERO");
                            retrucoQuerido = true;
                            break;
                        
                        case 2:
                            System.out.println("La PC dice NO QUIERO");
                            puntajeUser++;
                            // TrucoCantado = false;
                            System.out.println("puntaje usuario: " + puntajeUser + ", puntaje PC: " + puntajePC);
                            continue;

                        case 3:
                            System.out.println("La PC dice VALECUATRO");
                            System.out.println("1: quiero 2: no quiero");

                            int decisionUSERvalecuatro = sc.nextInt();

                            if (decisionUSERvalecuatro == 1){
                                System.out.println("El usuario dice QUIERO");
                                valeCuatroQuerido = true;
                            } else {
                                System.out.println("El dice NO QUIERO");
                                puntajePC = puntajePC + 3;
                                // TrucoCantado = false;
                                System.out.println("puntaje usuario: " + puntajeUser + ", puntaje PC: " + puntajePC);
                                continue;
                            }

                        default:
                            break;
                    }
                default:
                    break;
            }

            do {
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

                    default:
                        break;
                }
            } while (Mano1PC >= 1 && Mano1PC <= 3);

        }
////////////////////////////////////////////////////////////////////////////////////////////////
        
        if (cartaJugadaUser >= cartaJugadaPC) {
            manosGanadasUser++;
            System.out.println("El usuario gana la primer mano");
        } else {                                      //aca se checkea cual carta jugada entre user y pc gana la mano, y se suma al contador manosganadas
            manosGanadasPC++;
            System.out.println("La PC gana la primer mano");
        }

        int Mano2;

        do {
            System.out.print("Ingresa el número de la carta (1, 2, 3 o 4): ");
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
                if(TrucoCantado == false){
                    System.out.println("En usuario canta TRUCO");
                    Mano2 = 0;
                    TrucoCantado = true;
                } else if(TrucoCantado == true){
                    System.out.println("Ya se cantó TRUCO, elige otra opción.");
                }
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (Mano2 >= 1 && Mano2 <= 4);

            //TRUCO USER
        if(TrucoCantado == true && TrucoEjecutado == false){

            TrucoEjecutado = true;

            System.out.println("cantaste truco");
            int decisionPCtruco = (int) (Math.random()* 3) + 1;
            int decisionUserREtruco = 0;

            switch (decisionPCtruco) {
                case 1:
                    System.out.println("La PC dice QUIERO");
                    trucoQuerido = true; 
                    
                    break;

                case 2:
                    System.out.println("La PC dice NO QUIERO");
                    puntajeUser++;
                    // TrucoCantado = false;
                    System.out.println("puntaje usuario: " + puntajeUser + ", puntaje PC: " + puntajePC);
                    continue;
                
                case 3:
                    System.out.println("La PC dice RETRUCO");
                    System.out.println("1 = quiero, 2 = NO quiero, 3 = VALECUATRO");
                    
                    decisionUserREtruco = sc.nextInt();

                    switch (decisionUserREtruco) {
                        case 1:
                            System.out.println("El usuario dice QUIERO");
                            retrucoQuerido = true;
                            break;
                        
                        case 2:
                            System.out.println("El usuario dice NO QUIERO");
                            puntajePC++;
                            // TrucoCantado = false;
                            System.out.println("puntaje usuario: " + puntajeUser + ", puntaje PC: " + puntajePC);
                            continue;

                        case 3:
                            System.out.println("El usuario dice VALECUATRO");

                            int decisionPCvalecuatro = (int) (Math.random()* 2) + 1;
                            if (decisionPCvalecuatro == 1){
                                System.out.println("La PC dice QUIERO");
                                valeCuatroQuerido = true;
                            } else {
                                System.out.println("La PC dice NO QUIERO");
                                puntajeUser = puntajeUser + 3;
                                // TrucoCantado = false;
                                System.out.println("puntaje usuario: " + puntajeUser + ", puntaje PC: " + puntajePC);
                                continue;
                            }

                        default:
                            break;
                    }
                default:
                    break;
            }

            do {
                System.out.print("Ingresa el número de la carta (1, 2, 3): ");
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

                    default:
                        System.out.println("Opción no válida.");
                }
            } while (Mano2 >= 1 && Mano2 <= 3);

        }
            ///////////////////////////////////////////////////////////////////////////////////////////


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
                    if(TrucoCantado == false){
                        System.out.println("La PC canta TRUCO");
                        Mano2PC = 0;
                        TrucoCantado = true;
                    } else if(TrucoCantado == true){
                        System.out.println("Ya se cantó TRUCO, elige otra opción.");
                    }

                default:
                    break;
            }
        } while (Mano2PC >= 1 && Mano2PC <= 4);


        // TRUCO PC
        if(TrucoCantado == true && TrucoEjecutado == false){

            TrucoEjecutado = true;

            System.out.println("1 = quiero, 2 = NO quiero, 3 = RETRUCO");
            int decisionUSERtruco = sc.nextInt();
            int decisionPCREtruco = 0;

            switch (decisionUSERtruco) {
                case 1:
                    System.out.println("El usuario dice QUIERO");
                    trucoQuerido = true; 
                    
                    break;

                case 2:
                    System.out.println("El usuario dice NO QUIERO");
                    puntajePC++;
                    // TrucoCantado = false;
                    System.out.println("puntaje usuario: " + puntajeUser + ", puntaje PC: " + puntajePC);
                    continue;
                
                case 3:
                    System.out.println("El usuario dice RETRUCO");

                    decisionPCREtruco = (int) (Math.random()* 3) + 1;

                    switch (decisionPCREtruco) {
                        case 1:
                            System.out.println("La PC dice QUIERO");
                            retrucoQuerido = true;
                            break;
                        
                        case 2:
                            System.out.println("La PC dice NO QUIERO");
                            puntajeUser++;
                            // TrucoCantado = false;
                            System.out.println("puntaje usuario: " + puntajeUser + ", puntaje PC: " + puntajePC);
                            continue;

                        case 3:
                            System.out.println("La PC dice VALECUATRO");
                            System.out.println("1: quiero 2: no quiero");

                            int decisionUSERvalecuatro = sc.nextInt();

                            if (decisionUSERvalecuatro == 1){
                                System.out.println("El usuario dice QUIERO");
                                valeCuatroQuerido = true;
                            } else {
                                System.out.println("El dice NO QUIERO");
                                puntajePC = puntajePC + 3;
                                // TrucoCantado = false;
                                System.out.println("puntaje usuario: " + puntajeUser + ", puntaje PC: " + puntajePC);
                                continue;
                            }

                        default:
                            break;
                    }
                default:
                    break;
            }

            do {
                Mano2PC = (int) (Math.random()* 4) + 1;
    
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
    
                            cartaJugadaPC = carta_2_PC;
                        } else {
                            System.out.println("ya elegiste la carta 2");
                        }
                            break;
    
                    case 3:
                        if (!carta3SeleccionadaPC) {
                            System.out.println("elegiste carta 3");
                            carta3SeleccionadaPC = true;
                            Mano2PC = 0;  // Establecer Mano1PC en un valor que no sea 1, 2 o 3 para salir del bucle
    
                            cartaJugadaPC = carta_3_PC;
                        } else {
                            System.out.println("ya elegiste la carta 3");
                        }
                            break;
    
                    case 4:
                        if(TrucoCantado == false){
                            System.out.println("La PC canta TRUCO");
                            Mano2PC = 0;
                            TrucoCantado = true;
                        } else if(TrucoCantado == true){
                            System.out.println("Ya se cantó TRUCO, elige otra opción.");
                        }
                        break;
    
    
                    default:
                        break;
                }
            } while (Mano2PC >= 1 && Mano2PC <= 4);

        }
        
        ////////////////////////////////////////////////////////////////////////

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
            if(trucoQuerido){
                puntajeUser = puntajeUser + 2;      //se suma el puntaje si es que truco fue cantado 
            } else if (retrucoQuerido){
                puntajeUser = puntajeUser + 3;
            } else if (valeCuatroQuerido){
                puntajeUser = puntajeUser + 4;
            }
            System.out.println("puntaje usuario: " + puntajeUser + ", puntaje PC: " + puntajePC);
            continue;           //se saltea el resto del loop y comienza una nueva iteracion desde el principio
        }else {
            if (manosGanadasPC == 2){
                puntajePC++;
                System.out.println("La PC gana la ronda");
                if(trucoQuerido){
                    puntajePC = puntajePC + 2;      //se suma el puntaje si es que truco fue cantado 
                } else if (retrucoQuerido){
                    puntajePC = puntajePC + 3;
                } else if (valeCuatroQuerido){
                    puntajePC = puntajePC + 4;
                }
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
                    Mano3 = 0;
                    TrucoCantado = true;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (Mano3 >= 1 && Mano3 <= 4);

            //TRUCO USER
        if(TrucoCantado == true && TrucoEjecutado == false){

            TrucoEjecutado = true;

            System.out.println("cantaste truco");
            int decisionPCtruco = 3;
            int decisionUserREtruco = 0;

            switch (decisionPCtruco) {
                case 1:
                    System.out.println("La PC dice QUIERO");
                    trucoQuerido = true; 
                    
                    break;

                case 2:
                    System.out.println("La PC dice NO QUIERO");
                    puntajeUser++;
                    // TrucoCantado = false;
                    System.out.println("puntaje usuario: " + puntajeUser + ", puntaje PC: " + puntajePC);
                    continue;
                
                case 3:
                    System.out.println("La PC dice RETRUCO");
                    System.out.println("1 = quiero, 2 = NO quiero, 3 = VALECUATRO");
                    
                    decisionUserREtruco = sc.nextInt();

                    switch (decisionUserREtruco) {
                        case 1:
                            System.out.println("El usuario dice QUIERO");
                            retrucoQuerido = true;
                            break;
                        
                        case 2:
                            System.out.println("El usuario dice NO QUIERO");
                            puntajePC++;
                            // TrucoCantado = false;
                            System.out.println("puntaje usuario: " + puntajeUser + ", puntaje PC: " + puntajePC);
                            continue;

                        case 3:
                            System.out.println("El usuario dice VALECUATRO");

                            int decisionPCvalecuatro = (int) (Math.random()* 2) + 1;
                            if (decisionPCvalecuatro == 1){
                                System.out.println("La PC dice QUIERO");
                                valeCuatroQuerido = true;
                            } else {
                                System.out.println("La PC dice NO QUIERO");
                                puntajeUser = puntajeUser + 3;
                                // TrucoCantado = false;
                                System.out.println("puntaje usuario: " + puntajeUser + ", puntaje PC: " + puntajePC);
                                continue;
                            }

                        default:
                            break;
                    }
                default:
                    break;
            }

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

                    default:
                        System.out.println("Opción no válida.");
                }
            } while (Mano3 >= 1 && Mano3 <= 3);
        }
            /////////////////////////////////





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

                case 4:
                    System.out.println("elegiste truco");
                    Mano3PC = 0;
                    TrucoCantado = true;
                    break;

                default:
                    break;
            }
        } while (Mano3PC >= 1 && Mano3PC <= 4);


// TRUCO PC
if(TrucoCantado == true && TrucoEjecutado == false){

    TrucoEjecutado = true;

    System.out.println("1 = quiero, 2 = NO quiero, 3 = RETRUCO");
    int decisionUSERtruco = sc.nextInt();
    int decisionPCREtruco = 0;

    switch (decisionUSERtruco) {
        case 1:
            System.out.println("El usuario dice QUIERO");
            trucoQuerido = true; 
            
            break;

        case 2:
            System.out.println("El usuario dice NO QUIERO");
            puntajePC++;
            // TrucoCantado = false;
            System.out.println("puntaje usuario: " + puntajeUser + ", puntaje PC: " + puntajePC);
            continue;
        
        case 3:
            System.out.println("El usuario dice RETRUCO");

            decisionPCREtruco = (int) (Math.random()* 3) + 1;

            switch (decisionPCREtruco) {
                case 1:
                    System.out.println("La PC dice QUIERO");
                    retrucoQuerido = true;
                    break;
                
                case 2:
                    System.out.println("La PC dice NO QUIERO");
                    puntajeUser++;
                    // TrucoCantado = false;
                    System.out.println("puntaje usuario: " + puntajeUser + ", puntaje PC: " + puntajePC);
                    continue;

                case 3:
                    System.out.println("La PC dice VALECUATRO");
                    System.out.println("1: quiero 2: no quiero");

                    int decisionUSERvalecuatro = sc.nextInt();

                    if (decisionUSERvalecuatro == 1){
                        System.out.println("El usuario dice QUIERO");
                        valeCuatroQuerido = true;
                    } else {
                        System.out.println("El dice NO QUIERO");
                        puntajePC = puntajePC + 3;
                        // TrucoCantado = false;
                        System.out.println("puntaje usuario: " + puntajeUser + ", puntaje PC: " + puntajePC);
                        continue;
                    }

                default:
                    break;
            }
        default:
            break;
    }

    do {
        Mano3PC = (int) (Math.random()* 4) + 1;

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
                    Mano3PC = 0;  // Establecer Mano1PC en un valor que no sea 1, 2 o 3 para salir del bucle

                    cartaJugadaPC = carta_3_PC;
                } else {
                    System.out.println("ya elegiste la carta 3");
                }
                    break;

            case 4:
                if(TrucoCantado == false){
                    System.out.println("La PC canta TRUCO");
                    Mano3PC = 0;
                    TrucoCantado = true;
                } else if(TrucoCantado == true){
                    System.out.println("Ya se cantó TRUCO, elige otra opción.");
                }
                break;


            default:
                break;
        }
    } while (Mano3PC >= 1 && Mano3PC <= 4);

}

////////////////////////////////////////////////////////////////////////




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
            if(trucoQuerido){
                puntajeUser = puntajeUser + 2;      //se suma el puntaje si es que truco fue cantado 
            } else if (retrucoQuerido){
                puntajeUser = puntajeUser + 3;
            } else if (valeCuatroQuerido){
                puntajeUser = puntajeUser + 4;
            }
            System.out.println("puntaje usuario: " + puntajeUser + ", puntaje PC: " + puntajePC);
            continue;           //se saltea el resto del loop y comienza una nueva iteracion desde el principio
        }else {
            if (manosGanadasPC == 2){
                puntajePC++;
                System.out.println("La PC gana la ronda");
                if(trucoQuerido){
                    puntajePC = puntajePC + 2;      //se suma el puntaje si es que truco fue cantado 
                } else if (retrucoQuerido){
                    puntajePC = puntajePC + 3;
                } else if (valeCuatroQuerido){
                    puntajePC = puntajePC + 4;
                }
                System.out.println("puntaje usuario: " + puntajeUser + ", puntaje PC: " + puntajePC);
                continue;
            }
        }

        } while ((puntajeUser < 5) && (puntajePC < 5)); //el while del loop de la partida entera





        if (puntajeUser >= 5) {
            System.out.println("El ganador de la partida es el usuario");
        } else if (puntajePC >= 5) {
            System.out.println("El ganador de la partida es la PC");
        }
        
        ////////////////////////////////////////////////////////////////////  

        //TO DO:
        //aplicar Joption Pane
    }

    
}