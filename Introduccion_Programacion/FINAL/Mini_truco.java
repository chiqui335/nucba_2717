package Introduccion_Programacion.FINAL;

import java.util.Scanner;

public class Mini_truco {
    public static void main(String[] args) {

         // Asignar valores a cada elemento de la matriz
       int deck[][] = new int[4][10];

    // 0=espada; 1=basto; 2=oro; 3=copa
    deck[0][0] = 13;   // 1 espada
    deck[0][1] = 8;
    deck[0][2] = 9;
    deck[0][3] = 0;
    deck[0][4] = 1;
    deck[0][5] = 2;
    deck[0][6] = 11;
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
    deck[2][6] = 10;
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

    // Obtén las dimensiones del array
    int filas = deck.length;
    int columnas = deck[0].length;

    // Genera índices aleatorios
    int filaAleatoria = (int) (Math.random() * filas);
    int columnaAleatoria = (int) (Math.random() * columnas);

    // Accede al elemento del array utilizando los índices aleatorios
    int elementoSeleccionado = deck[filaAleatoria][columnaAleatoria];

    // Imprime el elemento seleccionado
    System.out.println("Elemento seleccionado: " + elementoSeleccionado);

    

    String [][] deckImg = new String [4][10];
 
        deckImg[0][0] = "/Cartas/esp1.png";
        deckImg[0][1] = "/Cartas/esp2.png";
        deckImg[0][2] = "/Cartas/esp3.png";
        deckImg[0][3] = "/Cartas/esp4.png";
        deckImg[0][4] = "/Cartas/esp5.png";
        deckImg[0][5] = "/Cartas/esp6.png";
        deckImg[0][6] = "/Cartas/esp7.png";
        deckImg[0][7] = "/Cartas/esp10.png";
        deckImg[0][8] = "/Cartas/esp11.png";
        deckImg[0][9] = "/Cartas/esp12.png";
        deckImg[1][0] = "/Cartas/basto1.png";
        deckImg[1][1] = "/Cartas/basto2.png";
        deckImg[1][2] = "/Cartas/basto3.png";
        deckImg[1][3] = "/Cartas/basto4.png";
        deckImg[1][4] = "/Cartas/basto5.png";
        deckImg[1][5] = "/Cartas/basto6.png";
        deckImg[1][6] = "/Cartas/basto7.png";
        deckImg[1][7] = "/Cartas/basto10.png";
        deckImg[1][8] = "/Cartas/basto11.png";
        deckImg[1][9] = "/Cartas/basto12.png";
        deckImg[2][0] = "/Cartas/oro1.png";
        deckImg[2][1] = "/Cartas/oro2.png";
        deckImg[2][2] = "/Cartas/oro3.png";
        deckImg[2][3] = "/Cartas/oro4.png";
        deckImg[2][4] = "/Cartas/oro5.png";
        deckImg[2][5] = "/Cartas/oro6.png";
        deckImg[2][6] = "/Cartas/oro7.png";
        deckImg[2][7] = "/Cartas/oro10.png";
        deckImg[2][8] = "/Cartas/oro11.png";
        deckImg[2][9] = "/Cartas/oro12.png";
        deckImg[3][0] = "/Cartas/copa1.png";
        deckImg[3][1] = "/Cartas/copa2.png";
        deckImg[3][2] = "/Cartas/copa3.png";
        deckImg[3][3] = "/Cartas/copa4.png";
        deckImg[3][4] = "/Cartas/copa5.png";
        deckImg[3][5] = "/Cartas/copa6.png";
        deckImg[3][6] = "/Cartas/copa7.png";
        deckImg[3][7] = "/Cartas/copa10.png";
        deckImg[3][8] = "/Cartas/copa11.png";
        deckImg[3][9] = "/Cartas/copa12.png";

    }
}


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


        //seccion cartas del usuario
        //genero un random para las cartas del usuario:
        int filaDeckRand1 =  (int) (Math.random() * filaDeck);
        int colDeckRand1 =   (int) (Math.random() * colDeck);

        int filaDeckRand2 =  (int) (Math.random() * filaDeck);
        int colDeckRand2 =   (int) (Math.random() * colDeck);

        int filaDeckRand3 =  (int) (Math.random() * filaDeck);
        int colDeckRand3 =   (int) (Math.random() * colDeck);

        //cartas que tocan al usuario
        int carta_1 = deck[filaDeckRand1][colDeckRand1];
        int carta_2 = deck[filaDeckRand2][colDeckRand2];
        int carta_3 = deck[filaDeckRand3][colDeckRand3];


        //////////////////////////////////77
        int PuntajePC = 0;
        int PuntajeUser = 0;

        do {
            
            //codigo

            //calculo puntaje
            System.out.println("Puntaje pc: " + PuntajePC);
            System.out.println("Puntaje user: " + PuntajeUser);
        } while ((PuntajeUser <= 15) || (PuntajePC <= 15))


        //Como calcular el puntaje
        if (ManosGanadasUser >= ManosGanadasPC){
            PuntajeUser = PuntajeUser + 1;
            System.out.println("El usuario gana la ronda");
        }else{
            PuntajePC = PuntajePC + 1;
            System.out.println("La Pc gana la ronda");
        }


        //puntaje:

        

        //////////////////

        if (cartaJugadaUser >= cartaJugadaPC){
            ManosGanadasUser = ManosGanadasUser + 1;
        } else {
            ManosGanadasPC = ManosGanadasPC + 1;
        }


    public static void actualizarManosGanadas(int cartaJugadaUser, int cartaJugadaPC) {
        if (cartaJugadaUser >= cartaJugadaPC) {
            ManosGanadasUser++;
        } else {
            ManosGanadasPC++;
        }
}


//truco con suma de puntos etc
    if(TrucoCantado){
        switch (truco) {
            case 1:
                System.out.println("Quiero");
                break;
            
            case 2:
                System.out.println("No quiero");
                break;
        
            default:
                break;
        }
    }

    
        

    if (PuntajeEnvUser > PuntajeEnvPC) {
        System.out.println("El usuario gana el envido");
        System.out.println("user: " + PuntajeEnvUser + " " + "PC: " + PuntajeEnvPC);
    } else {
        System.out.println("La PC gana el envido");
        System.out.println("user: " + PuntajeEnvUser + " " + "PC: " + PuntajeEnvPC);
    }


    public static void Envido(
        int filaDeckEnv1, int filaDeckEnv2, int filaDeckEnv3,
        int filaDeckRandPC1, int filaDeckRandPC2, int filaDeckRandPC3,
        int cartaEnv_1, int cartaEnv_2, int cartaEnv_3,
        int cartaEnv_1_PC, int cartaEnv_2_PC, int cartaEnv_3_PC) {

    
        int PuntajeEnvPC = 0;
        int PuntajeEnvUser = 0;

        if (filaDeckEnv1 == filaDeckEnv2) {
            PuntajeEnvUser = cartaEnv_1 + cartaEnv_2 + 20;
        } else if (filaDeckEnv2 == filaDeckEnv3) {
            PuntajeEnvUser = cartaEnv_2 + cartaEnv_3 + 20;
        } else {
            PuntajeEnvUser = cartaEnv_1 + cartaEnv_3 + 20;
        }

        if (filaDeckRandPC1 == filaDeckRandPC2) {
            PuntajeEnvPC = cartaEnv_1_PC + cartaEnv_2_PC + 20;
        } else if (filaDeckRandPC2 == filaDeckRandPC3) {
            PuntajeEnvPC = cartaEnv_2_PC + cartaEnv_3_PC + 20;  
        } else {
            PuntajeEnvPC = cartaEnv_1_PC + cartaEnv_3_PC + 20;
        }
    }


    public static void Truco(int cartaJugadaUser, int cartaJugadaPC, int manosGanadasUser, int manosGanadasPC) {
        
        
        if (cartaJugadaUser >= cartaJugadaPC) {
            puntajeUser = puntajeUser + 2;
        } else {
            puntajePC = puntajePC + 2;
        }

        if(trucoCantado){
            System.out.println("cantaste truco");
            int decisionPCtruco = (int) (Math.random()* 3) + 1;
            int decisionUserREtruco = 0;
            boolean trucoQuerido = false;
            boolean retrucoQuerido = false;
            boolean valeCuatroQuerido = false;

            switch (decisionPCtruco) {
                case 1:
                    System.out.println("La PC dice QUIERO");
                    trucoQuerido = true; 
                    break;

                case 2:
                    System.out.println("La PC dice NO QUIERO");
                    puntajeUser++;
                    break;
                
                case 3:
                    System.out.println("La PC dice RETRUCO");
                    System.out.println("1 = quiero, 2 = NO quiero, 3 = VALECUATRO");


                    switch (decisionUserREtruco) {
                        case 1:
                            System.out.println("El usuario dice QUIERO");
                            retrucoQuerido = true;
                            break;
                        
                        case 2:
                            System.out.println("El usuario dice NO QUIERO");
                            puntajePC++;
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
                                continue;
                            }

                        default:
                            break;
                    }
            
                default:
                    break;
            }





        }


    }


