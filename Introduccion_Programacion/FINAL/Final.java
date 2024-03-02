package Introduccion_Programacion.FINAL;

import javax.swing.*; 
public class Final {
    public static void main(String[] args){

        int respuesta = JOptionPane.showConfirmDialog(
            null,
            "Bienvenido al juego de truco. ¿Deseas jugar una partida?",
            "Inicio del juego",
            JOptionPane.YES_NO_OPTION
        );

        if (respuesta == JOptionPane.NO_OPTION){
            System.exit(0);
        }

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
 
        
        deckImg[0][0] = new ImageIcon ("./Cartas/esp1.png"); //AGREGAR Introduccion_Programacion/FINAL y quitar el punto para ejecutarlo desde vscode
        deckImg[0][1] = new ImageIcon ("./Cartas/esp2.png");    // dejar asi para ejecutar desde terminal
        deckImg[0][2] = new ImageIcon ("./Cartas/esp3.png");
        deckImg[0][3] = new ImageIcon ("./Cartas/esp4.png");
        deckImg[0][4] = new ImageIcon ("./Cartas/esp5.png");
        deckImg[0][5] = new ImageIcon ("./Cartas/esp6.png");
        deckImg[0][6] = new ImageIcon ("./Cartas/esp7.png");
        deckImg[0][7] = new ImageIcon ("./Cartas/esp10.png");
        deckImg[0][8] = new ImageIcon ("./Cartas/esp11.png");
        deckImg[0][9] = new ImageIcon ("./Cartas/esp12.png");
        deckImg[1][0] = new ImageIcon ("./Cartas/basto1.png"); 
        deckImg[1][1] = new ImageIcon ("./Cartas/basto2.png");
        deckImg[1][2] = new ImageIcon ("./Cartas/basto3.png"); 
        deckImg[1][3] = new ImageIcon ("./Cartas/basto4.png");
        deckImg[1][4] = new ImageIcon ("./Cartas/basto5.png");
        deckImg[1][5] = new ImageIcon ("./Cartas/basto6.png");
        deckImg[1][6] = new ImageIcon ("./Cartas/basto7.png");
        deckImg[1][7] = new ImageIcon ("./Cartas/basto10.png");
        deckImg[1][8] = new ImageIcon ("./Cartas/basto11.png");
        deckImg[1][9] = new ImageIcon ("./Cartas/basto12.png");
        deckImg[2][0] = new ImageIcon ("./Cartas/oro1.png");
        deckImg[2][1] = new ImageIcon ("./Cartas/oro2.png");
        deckImg[2][2] = new ImageIcon ("./Cartas/oro3.png");
        deckImg[2][3] = new ImageIcon ("./Cartas/oro4.png");
        deckImg[2][4] = new ImageIcon ("./Cartas/oro5.png");
        deckImg[2][5] = new ImageIcon ("./Cartas/oro6.png");
        deckImg[2][6] = new ImageIcon ("./Cartas/oro7.png");
        deckImg[2][7] = new ImageIcon ("./Cartas/oro10.png");
        deckImg[2][8] = new ImageIcon ("./Cartas/oro11.png");
        deckImg[2][9] = new ImageIcon ("./Cartas/oro12.png");
        deckImg[3][0] = new ImageIcon ("./Cartas/copa1.png");
        deckImg[3][1] = new ImageIcon ("./Cartas/copa2.png");
        deckImg[3][2] = new ImageIcon ("./Cartas/copa3.png");
        deckImg[3][3] = new ImageIcon ("./Cartas/copa4.png");
        deckImg[3][4] = new ImageIcon ("./Cartas/copa5.png");
        deckImg[3][5] = new ImageIcon ("./Cartas/copa6.png");
        deckImg[3][6] = new ImageIcon ("./Cartas/copa7.png");
        deckImg[3][7] = new ImageIcon ("./Cartas/copa10.png");
        deckImg[3][8] = new ImageIcon ("./Cartas/copa11.png");
        deckImg[3][9] = new ImageIcon ("./Cartas/copa12.png");

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

        //hago coincidir deck con deckImg
        int filaDeckImgPCRand1 = filaDeckRandPC1;
        int colDeckImgPCRand1 = colDeckRandPC1;

        int filaDeckImgPCRand2 = filaDeckRandPC2;
        int colDeckImgPCRand2 = colDeckRandPC2;

        int filaDeckImgPCRand3 = filaDeckRandPC3;
        int colDeckImgPCRand3 = colDeckRandPC3;

        

        //Valor de las cartas para envido PC
        int cartaEnv_1_PC = deckEnvido[filaDeckEnvPC1][colDeckEnvPC1];
        int cartaEnv_2_PC = deckEnvido[filaDeckEnvPC2][colDeckEnvPC2];
        int cartaEnv_3_PC = deckEnvido[filaDeckEnvPC3][colDeckEnvPC3];
        
        //imgs de las cartas usuario
        ImageIcon carta_1_imgPC = deckImg[filaDeckImgPCRand1][colDeckImgPCRand1];
        ImageIcon carta_2_imgPC = deckImg[filaDeckImgPCRand2][colDeckImgPCRand2];
        ImageIcon carta_3_imgPC = deckImg[filaDeckImgPCRand3][colDeckImgPCRand3];

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

        boolean continuarLoop1 = true;
        boolean continuarLoop2 = true;
        boolean continuarLoop3 = true;

        boolean continuarLoopENV = true;

        boolean continuarLoopTRUCO1 = true;
        boolean continuarLoopTRUCO2 = true;
        boolean continuarLoopTRUCO3 = true;




        ImageIcon ImgCartaJugadaUser = null;
        ImageIcon ImgCartaJugadaPC = null;

        ImageIcon WHITE = new ImageIcon ("Introduccion_Programacion/FINAL/Cartas/WHITEIMG.png");

        //Array de opciones para cuando la pc canta truco
        String[] opcionesUSERtruco = {"Quiero", "No quiero", "Quiero RETRUCO"};

        //test para saber si las cartas de la pc estan bien
        // JPanel manopc = new JPanel();
        // manopc.add(new JLabel(carta_1_imgPC));
        // manopc.add(new JLabel(carta_2_imgPC));
        // manopc.add(new JLabel(carta_3_imgPC));

        // String[] PC = {"Ok", "cancel"};

        // int MostrarmanoPC = JOptionPane.showOptionDialog(
        //     null,
        //     manopc,

        //     "cartas PC",
        //     JOptionPane.DEFAULT_OPTION, 
        //     JOptionPane.INFORMATION_MESSAGE,
        //     null,
        //     PC,
        //     PC[0]
        // );
        

        //MANO 1 USER
        int seleccionMano1; // le doy un valor por defecto a la variable para que el switch no se queje

        String[] opcionesMano1 = {"Jugar primera carta", "Jugar segunda carta", "Jugar tercera carta", "Cantar truco", "Cantar Envido"};

        // Crear un panel para contener las imágenes
        JPanel CartasMano1 = new JPanel();
        CartasMano1.add(new JLabel(carta_1_img));
        CartasMano1.add(new JLabel(carta_2_img));    //en vez de "panel" uso CartasMano1 para distinguir entre manos
        CartasMano1.add(new JLabel(carta_3_img));
       

        do {

            //array de objetos que representa las opciones que se mostrarán al usuario

            // Mostrar el panel en JOptionPane
            seleccionMano1 = JOptionPane.showOptionDialog(
                    null,
                    CartasMano1, 
                    "Tus cartas - 1ra mano", //titulo
                    JOptionPane.YES_NO_CANCEL_OPTION, //muestra los botones
                    JOptionPane.INFORMATION_MESSAGE, 
                    null, //ícono que se mostrará junto al mensaje, qui se utiliza null para usar el ícono predeterminado
                    opcionesMano1, 
                    opcionesMano1[0]); //Indica cuál de las opciones es la predeterminada

            
            switch (seleccionMano1) {
                case 0:
                    if (!carta1Seleccionada) {
                        System.out.println("elegiste carta 1");
                        carta1Seleccionada = true;
                        continuarLoop1= false; 

                        cartaJugadaUser = carta_1;
                        ImgCartaJugadaUser = carta_1_img;

                        System.out.println("la carta jugada es: " + cartaJugadaUser);
                    } else {
                        System.out.println("ya elegiste la carta 1");
                    }
                        break;

                case 1:
                    if (!carta2Seleccionada) {
                        System.out.println("elegiste carta 2");
                        carta2Seleccionada = true;
                        continuarLoop1= false; 

                        cartaJugadaUser = carta_2;
                        ImgCartaJugadaUser = carta_2_img;


                    } else {
                        System.out.println("ya elegiste la carta 2");
                    }
                        break;

                case 2:
                    if (!carta3Seleccionada) {
                        System.out.println("elegiste carta 3");
                        carta3Seleccionada = true;
                        continuarLoop1= false; 
                    
                        cartaJugadaUser = carta_3;
                        ImgCartaJugadaUser = carta_3_img;


                    } else {
                        System.out.println("ya elegiste la carta 3");
                    }
                        break;

                case 3:
                    System.out.println("elegiste truco");
                    continuarLoop1= false; 
                    TrucoCantado = true;
                    break;

                case 4:
                    System.out.println("elegiste envido");
                    continuarLoop1= false; 
                    EnvidoCantado = true;
                    break;

                default:
                    System.out.println("Opción no válida.");
                    System.exit(0);
                    continue;
            }
        } while (continuarLoop1 == true);
        
        //ENVIDO USER
        if (EnvidoCantado == true && EnvidoEjecutado == false) {

            EnvidoEjecutado = true;

            if (filaDeckRandPC1 == filaDeckRandPC2 || filaDeckRandPC2 == filaDeckRandPC3 || filaDeckRandPC1 == filaDeckRandPC3){
                JOptionPane.showMessageDialog(null, "La PC dice QUIERO");

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
                    JOptionPane.showMessageDialog(
                        null,
                        "El usuario gana el envido\n" +
                        "Puntaje Usuario: " + PuntajeEnvUser + "\n" +
                        "Puntaje PC: " + PuntajeEnvPC,
                        "Resultado del Envido",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    
                    System.out.println("El usuario gana el envido");
                    puntajeUser = puntajeUser + 2;
                    System.out.println("user: " + PuntajeEnvUser + " " + "PC: " + PuntajeEnvPC);
                }else{
                    JOptionPane.showMessageDialog(
                        null,
                        "La PC gana el envido\n" +
                        "Puntaje Usuario: " + PuntajeEnvUser + "\n" +
                        "Puntaje PC: " + PuntajeEnvPC,
                        "Resultado del Envido",
                        JOptionPane.INFORMATION_MESSAGE
                    );

                    puntajePC = puntajePC + 2;
                    System.out.println("user: " + PuntajeEnvUser + " " + "PC: " + PuntajeEnvPC);
                }
            } else {
                JOptionPane.showMessageDialog(null, "La PC dice NO QUIERO");
                puntajeUser++;
            }


            do {

                String[] NuevasopcionesMano1 = {"Jugar primera carta", "Jugar segunda carta", "Jugar tercera carta", "Cantar truco"};
                opcionesMano1 = NuevasopcionesMano1;

                seleccionMano1 = JOptionPane.showOptionDialog(
                    null,
                    CartasMano1, 
                    "Tus cartas - 1ra mano", //titulo
                    JOptionPane.YES_NO_CANCEL_OPTION, //muestra los botones
                    JOptionPane.INFORMATION_MESSAGE, 
                    null, //ícono que se mostrará junto al mensaje, qui se utiliza null para usar el ícono predeterminado
                    opcionesMano1, 
                    opcionesMano1[0]); //Indica cuál de las opciones es la predeterminada

            
            switch (seleccionMano1) {
                case 0:
                    if (!carta1Seleccionada) {
                        System.out.println("elegiste carta 1");
                        carta1Seleccionada = true;
                        continuarLoopENV= false; 

                        cartaJugadaUser = carta_1;
                        ImgCartaJugadaUser = carta_1_img;

                        System.out.println("la carta jugada es: " + cartaJugadaUser);
                    } else {
                        System.out.println("ya elegiste la carta 1");
                    }
                        break;

                case 1:
                    if (!carta2Seleccionada) {
                        System.out.println("elegiste carta 2");
                        carta2Seleccionada = true;
                        continuarLoopENV= false; 

                        cartaJugadaUser = carta_2;
                        ImgCartaJugadaUser = carta_2_img;

                    } else {
                        System.out.println("ya elegiste la carta 2");
                    }
                        break;

                case 2:
                    if (!carta3Seleccionada) {
                        System.out.println("elegiste carta 3");
                        carta3Seleccionada = true;
                        continuarLoopENV= false; 
                    
                        cartaJugadaUser = carta_3;
                        ImgCartaJugadaUser = carta_3_img;

                    } else {
                        System.out.println("ya elegiste la carta 3");
                    }
                        break;

                case 3:
                    System.out.println("elegiste truco");
                    continuarLoopENV= false; 
                    TrucoCantado = true;
                    break;

                default:
                    System.out.println("Opción no válida.");
                    System.exit(0);
                    break;
                }
            } while (continuarLoopENV == true);
        }

        ////////////////////////////////

       

        //TRUCO USER
        if(TrucoCantado == true && TrucoEjecutado == false){

            TrucoEjecutado = true;

            System.out.println("cantaste truco");
            int decisionPCtruco = (int) (Math.random()* 3) + 1;

            switch (decisionPCtruco) {
                case 1:
                    JOptionPane.showMessageDialog(null, "La PC dice QUIERO");
                    trucoQuerido = true; 

                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "La PC dice NO QUIERO");
                    puntajeUser++;
                    // TrucoCantado = false;
                    JOptionPane.showMessageDialog(
                        null,
                        "Puntaje Usuario: " + puntajeUser + "\n" +
                        "Puntaje PC: " + puntajePC,
                        null,
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    continue;
                
                case 3:
                    System.out.println("La PC dice RETRUCO");
                    System.out.println("1 = quiero, 2 = NO quiero, 3 = VALECUATRO");
                    
                    trucoQuerido = true; 

                    String[] opcionesUserREtruco = {"Quiero", "No quiero", "QUIERO VALE CUATRO"};

                    int decisionUserREtruco = JOptionPane.showOptionDialog(
                        null,
                        "La PC te cantó RETRUCO",
                        "Elije tu jugada",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        opcionesUserREtruco,
                        opcionesUserREtruco[0]);
                
                   
                    switch (decisionUserREtruco) {
                        case 0:
                            JOptionPane.showMessageDialog(null, "El Usuario dice QUIERO");
                            retrucoQuerido = true;
                            trucoQuerido = true; 
                            break;
                        
                        case 1:
                            JOptionPane.showMessageDialog(null, "El Usuario dice NO QUIERO");
                            puntajePC++;
                            // TrucoCantado = false;
                            
                            JOptionPane.showMessageDialog(
                                null,
                                "Puntaje Usuario: " + puntajeUser + "\n" +
                                "Puntaje PC: " + puntajePC,
                                null,
                                JOptionPane.INFORMATION_MESSAGE
                            );    
                                                    
                            continue;

                        case 2:
                            System.out.println("El usuario dice VALECUATRO");

                            trucoQuerido = true; 


                            int decisionPCvalecuatro = (int) (Math.random()* 2) + 1;
                            if (decisionPCvalecuatro == 1){
                                JOptionPane.showMessageDialog(null, "La PC dice QUIERO");
                                valeCuatroQuerido = true;
                            } else {
                                JOptionPane.showMessageDialog(null, "La PC dice NO QUIERO");
                                puntajeUser = puntajeUser + 3;
                                // TrucoCantado = false;

                                JOptionPane.showMessageDialog(
                                null,
                                "Puntaje Usuario: " + puntajeUser + "\n" +
                                "Puntaje PC: " + puntajePC,
                                null,
                                JOptionPane.INFORMATION_MESSAGE
                            );
                                continue;
                            }

                        default:
                        System.exit(0);
                            break;
                    }
                default:
                    break;
            }

            String[] NuevasopcionesMano1 = {"Jugar primera carta", "Jugar segunda carta", "Jugar tercera carta"};
                opcionesMano1 = NuevasopcionesMano1;

        do {
            
            
            // Mostrar el panel en JOptionPane
            seleccionMano1 = JOptionPane.showOptionDialog(
                    null,
                    CartasMano1, 
                    "Tus cartas - 1ra mano", //titulo
                    JOptionPane.YES_NO_CANCEL_OPTION, //muestra los botones
                    JOptionPane.INFORMATION_MESSAGE, 
                    null,            //ícono que se mostrará junto al mensaje, qui se utiliza null para usar el ícono predeterminado
                    opcionesMano1, 
                    opcionesMano1[0]); //Indica cuál de las opciones es la predeterminada

            
            switch (seleccionMano1) {
                case 0:
                    if (!carta1Seleccionada) {
                        System.out.println("elegiste carta 1");
                        carta1Seleccionada = true;
                        continuarLoopTRUCO1 = false;

                        cartaJugadaUser = carta_1;
                        ImgCartaJugadaUser = carta_1_img;

                        System.out.println("la carta jugada es: " + cartaJugadaUser);
                    } else {
                        System.out.println("ya elegiste la carta 1");
                    }
                        break;

                case 1:
                    if (!carta2Seleccionada) {
                        System.out.println("elegiste carta 2");
                        carta2Seleccionada = true;
                        continuarLoopTRUCO1 = false;


                        cartaJugadaUser = carta_2;
                        ImgCartaJugadaUser = carta_2_img;

                    } else {
                        System.out.println("ya elegiste la carta 2");
                    }
                        break;

                case 2:
                    if (!carta3Seleccionada) {
                        System.out.println("elegiste carta 3");
                        carta3Seleccionada = true;
                        continuarLoopTRUCO1 = false;

                    
                        cartaJugadaUser = carta_3;
                        ImgCartaJugadaUser = carta_3_img;

                    } else {
                        System.out.println("ya elegiste la carta 3");
                    }
                        break;

                case 3:
                    if(TrucoCantado == false){
                        System.out.println("En usuario canta TRUCO");
                        TrucoCantado = true;
                        continuarLoopTRUCO1 = false;


                    } else if(TrucoCantado == true){
                        JOptionPane.showMessageDialog(null, "Ya se cantó TRUCO, elige otra opción.");
                    }
                    break;

                case 4:
                    if(EnvidoCantado == false ){System.out.println("elegiste envido");
                    EnvidoCantado = true;
                    continuarLoopTRUCO1 = false;


                    } else {
                        JOptionPane.showMessageDialog(null, "Ya se cantó ENVIDO, elige otra opción.");
                    }
                    break;

                default:
                    System.out.println("Opción no válida.");
                    System.exit(0);
                    break;
            }
        } while (continuarLoopTRUCO1 == true);
        }

        ////////////////////////////////////////////////////////////////////////////////

        //MANO 1 PC
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
                        ImgCartaJugadaPC = carta_1_imgPC;

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
                        ImgCartaJugadaPC = carta_2_imgPC;

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
                        ImgCartaJugadaPC = carta_3_imgPC;

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
                    if ((EnvidoCantado == false && TrucoCantado == false)){
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
        
        //ENVIDO PC
        if (EnvidoCantado == true && EnvidoEjecutado == false) {

            EnvidoEjecutado = true;

            //la dejo aca para que no se inicialice en vano, consumiendo recursos
            String[] opcionesUserenvido = {"Quiero", "No Quiero"};

            int decisionUSERenvido = JOptionPane.showOptionDialog(
                null,
                "La PC te cantó Envido",
                "Elige tu jugada",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcionesUserenvido,
                opcionesUserenvido[0]
            );

            int PuntajeEnvPC = 0;
            int PuntajeEnvUser= 0;

            if (decisionUSERenvido == 0) {
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
                    JOptionPane.showMessageDialog(
                        null,
                        "El usuario gana el envido\n" +
                        "Puntaje Usuario: " + PuntajeEnvUser + "\n" +
                        "Puntaje PC: " + PuntajeEnvPC,
                        "Resultado del Envido",
                        JOptionPane.INFORMATION_MESSAGE
                    );

                    puntajeUser = puntajeUser + 2;

                }else{
                    JOptionPane.showMessageDialog(
                        null,
                        "La PC gana el envido\n" +
                        "Puntaje Usuario: " + PuntajeEnvUser + "\n" +
                        "Puntaje PC: " + PuntajeEnvPC,
                        "Resultado del Envido",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    
                    puntajePC = puntajePC + 2;

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
                        ImgCartaJugadaPC = carta_1_imgPC;

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
                        ImgCartaJugadaPC = carta_2_imgPC;

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
                        ImgCartaJugadaPC = carta_3_imgPC;

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

            //tal vez este array de string se pueda poner al ppio del codigo para optimizar
            // String[] opcionesUSERtruco = {"Quiero", "No quiero", "Quiero RETRUCO"};
            
            int decisionPCREtruco = 0;
            int decisionUSERtruco = JOptionPane.showOptionDialog(
                null,
                "La PC te cantó TRUCO",
                "Elije tu jugada",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcionesUSERtruco,
                opcionesUSERtruco[0]
            );
            

            switch (decisionUSERtruco) {
                case 0:
                    System.out.println("El usuario dice QUIERO");
                    trucoQuerido = true; 
                    
                    break;

                case 1:
                    JOptionPane.showMessageDialog(null,"El usuario dice NO QUIERO");
                    puntajePC++;
                    // TrucoCantado = false;

                    JOptionPane.showMessageDialog(
                        null,
                        "Puntaje Usuario: " + puntajeUser + "\n" +
                        "Puntaje PC: " + puntajePC,
                        null,
                        JOptionPane.INFORMATION_MESSAGE
                    );

                    continue;
                
                case 2:
                    System.out.println("El Usuario dice RETRUCO");

                    decisionPCREtruco = (int) (Math.random()* 3) + 1;

                    switch (decisionPCREtruco) {
                        case 1:
                            JOptionPane.showMessageDialog(null,"La PC dice QUIERO");
                            retrucoQuerido = true;
                            break;
                        
                        case 2:
                            JOptionPane.showMessageDialog(null,"La PC dice NO QUIERO");
                            puntajeUser++;
                            // TrucoCantado = false;

                            JOptionPane.showMessageDialog(
                                null,
                                "Puntaje Usuario: " + puntajeUser + "\n" +
                                "Puntaje PC: " + puntajePC,
                                null,
                                JOptionPane.INFORMATION_MESSAGE
                            );

                            continue;

                        case 3:
                            JOptionPane.showMessageDialog(null,"La PC dice VALECUATRO");

                            String[] opcionesUSERvalecuatro = {"Quiero", "No quiero"};

                            int decisionUSERvalecuatro = JOptionPane.showOptionDialog(
                                null,
                                "La PC te cantó VALECUATRO",
                                "Elije tu jugada",
                                JOptionPane.YES_NO_CANCEL_OPTION,
                                JOptionPane.INFORMATION_MESSAGE,
                                null,
                                opcionesUSERvalecuatro,
                                opcionesUSERvalecuatro[0]);

                            if (decisionUSERvalecuatro == 1){
                                JOptionPane.showMessageDialog(null,"El usuario dice QUIERO");
                                valeCuatroQuerido = true;
                            } else {
                                JOptionPane.showMessageDialog(null,"El Usuario dice NO QUIERO");
                                puntajePC = puntajePC + 3;
                                // TrucoCantado = false;

                                JOptionPane.showMessageDialog(
                                    null,
                                    "Puntaje Usuario: " + puntajeUser + "\n" +
                                    "Puntaje PC: " + puntajePC,
                                    null,
                                    JOptionPane.INFORMATION_MESSAGE
                                );

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
                            ImgCartaJugadaPC = carta_1_imgPC;

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
                            ImgCartaJugadaPC = carta_2_imgPC;

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
                            ImgCartaJugadaPC = carta_3_imgPC;

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
        
        

        JPanel Check1 = new JPanel();
        Check1.add(new JLabel(ImgCartaJugadaUser)); //Muestro las cartas jugadas por user y pc
        Check1.add(new JLabel(ImgCartaJugadaPC));



        if (cartaJugadaUser >= cartaJugadaPC) {
            manosGanadasUser++;
            JOptionPane.showMessageDialog(
                null,
                Check1,
                "El usuario gana la primer mano",
                JOptionPane.PLAIN_MESSAGE);

        } else {                                      //aca se checkea cual carta jugada entre user y pc gana la mano, y se suma al contador manosganadas
            manosGanadasPC++;
            JOptionPane.showMessageDialog(
                null,
                Check1,
                "La PC gana la primer mano",
                JOptionPane.PLAIN_MESSAGE);
        }

        
        //MANO 2 USER
        int seleccionMano2;


        String [] opcionesMano2 = {"Jugar primera carta", "Jugar segunda carta", "Jugar tercera carta", "Cantar truco"};

        if (TrucoCantado == true){
            String[] NuevasopcionesMano2 = {"Jugar primera carta", "Jugar segunda carta", "Jugar tercera carta"};
            opcionesMano2 = NuevasopcionesMano2;
        }

        JPanel CartasMano2 = new JPanel();

        if (carta1Seleccionada == false) {
            CartasMano2.add(new JLabel(carta_1_img));
        } else {
            CartasMano2.add(new JLabel(WHITE));
        }
        
        // Agregar la segunda carta si no está seleccionada
        if (carta2Seleccionada == false) {
            CartasMano2.add(new JLabel(carta_2_img));
        } else {
            CartasMano2.add(new JLabel(WHITE));
        }
        
        // Agregar la tercera carta si no está seleccionada
        if (carta3Seleccionada == false) {
            CartasMano2.add(new JLabel(carta_3_img));
        } else {
            CartasMano2.add(new JLabel(WHITE));
        }

        // if (TrucoCantado == false && TrucoEjecutado == false){
        //     opcionesMano2[3] = "cantar truco";
        // }


        do {
  
            seleccionMano2 = JOptionPane.showOptionDialog(
                    null,
                    CartasMano2, 
                    "Tus cartas - 2da mano", //titulo
                    JOptionPane.YES_NO_CANCEL_OPTION, //muestra los botones
                    JOptionPane.INFORMATION_MESSAGE, 
                    null, //ícono que se mostrará junto al mensaje, qui se utiliza null para usar el ícono predeterminado
                    opcionesMano2, 
                    opcionesMano2[0]);

            System.out.print("Ingresa el número de la carta (1, 2, 3 o 4): ");

            switch (seleccionMano2) {
                case 0:
                    if (!carta1Seleccionada) {
                        System.out.println("elegiste carta 1");
                        carta1Seleccionada = true;
                        continuarLoop2 = false;

                        cartaJugadaUser = carta_1;
                        ImgCartaJugadaUser = carta_1_img;

                    } else {
                        JOptionPane.showMessageDialog(null, "Ya elegiste esa carta");
                    }
                        break;

                case 1:
                    if (!carta2Seleccionada) {
                        System.out.println("elegiste carta 2");
                        carta2Seleccionada = true;
                        continuarLoop2 = false;

                        cartaJugadaUser = carta_2;
                        ImgCartaJugadaUser = carta_2_img;

                    } else {
                        JOptionPane.showMessageDialog(null, "Ya elegiste esa carta");
                    }
                        break;

                case 2:
                    if (!carta3Seleccionada) {
                        System.out.println("elegiste carta 3");
                        carta3Seleccionada = true;
                        continuarLoop2 = false; 

                        cartaJugadaUser = carta_3;
                        ImgCartaJugadaUser = carta_3_img;
                    } else {
                        JOptionPane.showMessageDialog(null, "Ya elegiste esa carta");
                    }
                        break;

                case 3:
                if(TrucoCantado == false){
                    System.out.println("En usuario canta TRUCO");
                    TrucoCantado = true;
                    continuarLoop2 = false;

                } else if(TrucoCantado == true){
                    JOptionPane.showMessageDialog(null, "Ya se cantó TRUCO, elige otra opción.");

                }
                    break;

                default:
                    System.out.println("Opción no válida.");
                    System.exit(0);
                    break;
            }
            System.out.println("ASAFGAFGS " + continuarLoop2);
        } while (continuarLoop2 == true);

            //TRUCO USER 2
            if(TrucoCantado == true && TrucoEjecutado == false){

                TrucoEjecutado = true;
    
                System.out.println("cantaste truco");
                int decisionPCtruco = (int) (Math.random()* 3) + 1;
                
    
                switch (decisionPCtruco) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "La PC dice QUIERO");
                        trucoQuerido = true; 
                        
                        
                        break;
    
                    case 2:
                        JOptionPane.showMessageDialog(null, "La PC dice NO QUIERO");
                        puntajeUser++;
                        // TrucoCantado = false;
                        JOptionPane.showMessageDialog(
                            null,
                            "Puntaje Usuario: " + puntajeUser + "\n" +
                            "Puntaje PC: " + puntajePC,
                            null,
                            JOptionPane.INFORMATION_MESSAGE
                        );
                        continue;
                    
                    case 3:
                        System.out.println("La PC dice RETRUCO");
                        System.out.println("1 = quiero, 2 = NO quiero, 3 = VALECUATRO");
                        
    
                        String[] opcionesUserREtruco = {"Quiero", "No quiero", "QUIERO VALE CUATRO"};
    
                        int decisionUserREtruco = JOptionPane.showOptionDialog(
                            null,
                            "La PC te cantó RETRUCO",
                            "Elije tu jugada",
                            JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.INFORMATION_MESSAGE,
                            null,
                            opcionesUserREtruco,
                            opcionesUserREtruco[0]);
                    
                       
                        switch (decisionUserREtruco) {
                            case 0:
                                JOptionPane.showMessageDialog(null, "El Usuario dice QUIERO");
                                retrucoQuerido = true;
                                break;
                            
                            case 1:
                                JOptionPane.showMessageDialog(null, "El Usuario dice NO QUIERO");
                                puntajePC++;
                                // TrucoCantado = false;
                                
                                JOptionPane.showMessageDialog(
                                    null,
                                    "Puntaje Usuario: " + puntajeUser + "\n" +
                                    "Puntaje PC: " + puntajePC,
                                    null,
                                    JOptionPane.INFORMATION_MESSAGE
                                );    
                                                        
                                continue;
    
                            case 2:
                                System.out.println("El usuario dice VALECUATRO");
    
                                int decisionPCvalecuatro = (int) (Math.random()* 2) + 1;
                                if (decisionPCvalecuatro == 1){
                                    JOptionPane.showMessageDialog(null, "La PC dice QUIERO");
                                    valeCuatroQuerido = true;
                                } else {
                                    JOptionPane.showMessageDialog(null, "La PC dice NO QUIERO");
                                    puntajeUser = puntajeUser + 3;
                                    // TrucoCantado = false;
    
                                    JOptionPane.showMessageDialog(
                                    null,
                                    "Puntaje Usuario: " + puntajeUser + "\n" +
                                    "Puntaje PC: " + puntajePC,
                                    null,
                                    JOptionPane.INFORMATION_MESSAGE
                                );
                                    continue;
                                }
    
                            default:
                            System.exit(0);
                                break;
                        }
                    default:
                        break;
                }

                if (TrucoCantado == true){
                    String[] NuevasopcionesMano2 = {"Jugar primera carta", "Jugar segunda carta", "Jugar tercera carta"};
                    opcionesMano2 = NuevasopcionesMano2;
                }

                do {
                    // Mostrar el panel en JOptionPane
                    seleccionMano2 = JOptionPane.showOptionDialog(
                            null,
                            CartasMano2, 
                            "Tus cartas - 2da mano", //titulo
                            JOptionPane.YES_NO_CANCEL_OPTION, //muestra los botones
                            JOptionPane.INFORMATION_MESSAGE, 
                            null,            //ícono que se mostrará junto al mensaje, qui se utiliza null para usar el ícono predeterminado
                            opcionesMano2, 
                            opcionesMano2[0]); //Indica cuál de las opciones es la predeterminada
        
                    
                    switch (seleccionMano2) {
                        case 0:
                            if (!carta1Seleccionada) {
                                System.out.println("elegiste carta 1");
                                carta1Seleccionada = true;
                                continuarLoopTRUCO2 = false; // Establecer continuarLoop2 = false para salir del bucle

                                cartaJugadaUser = carta_1;
                                ImgCartaJugadaUser = carta_1_img;
        
                                System.out.println("la carta jugada es: " + cartaJugadaUser);
                            } else {
                                JOptionPane.showMessageDialog(null, "ya elegiste esta carta");
                            }
                                break;
        
                        case 1:
                            if (!carta2Seleccionada) {
                                System.out.println("elegiste carta 2");
                                carta2Seleccionada = true;
                                continuarLoopTRUCO2 = false;

                                cartaJugadaUser = carta_2;
                                ImgCartaJugadaUser = carta_2_img;
        
                            } else {
                                JOptionPane.showMessageDialog(null, "ya elegiste esta carta");
                            }
                                break;
        
                        case 2:
                            if (!carta3Seleccionada) {
                                System.out.println("elegiste carta 3");
                                carta3Seleccionada = true;
                                continuarLoopTRUCO2 = false;

                                cartaJugadaUser = carta_3;
                                ImgCartaJugadaUser = carta_3_img;
        
                            } else {
                                JOptionPane.showMessageDialog(null, "ya elegiste esta carta");
                            }
                                break;
        
                        case 3:
                            if(TrucoCantado == false){
                                System.out.println("En usuario canta TRUCO");
                                continuarLoopTRUCO2 = false;

                                TrucoCantado = true;
                            } else if(TrucoCantado == true){
                                JOptionPane.showMessageDialog(null, "Ya se cantó TRUCO, elige otra opción.");
                            }
                                break;
        
        
                        default:
                            System.out.println("Opción no válida.");
                            System.exit(0);
                            break;
                    }
                    System.out.println(continuarLoopTRUCO2);
                } while (continuarLoopTRUCO2 == true);

        }
            ///////////////////////////////////////////////////////////////////////////////////////////

        //MANO 2 PC
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
                        ImgCartaJugadaPC = carta_1_imgPC;

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
                        ImgCartaJugadaPC = carta_2_imgPC;

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
                        ImgCartaJugadaPC = carta_3_imgPC;

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


        // TRUCO PC 2
        if(TrucoCantado == true && TrucoEjecutado == false){

            TrucoEjecutado = true;
            
            int decisionPCREtruco = 0;
            int decisionUSERtruco = JOptionPane.showOptionDialog(
                null,
                "La PC te cantó TRUCO",
                "Elije tu jugada",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcionesUSERtruco,
                opcionesUSERtruco[0]
            );
            

            switch (decisionUSERtruco) {
                case 0:
                    JOptionPane.showMessageDialog(null, "El usuario dice QUIERO");
                    trucoQuerido = true; 
                    
                    break;

                case 1:
                    JOptionPane.showMessageDialog(null, "El usuario dice NO QUIERO");
                    puntajePC++;

                    JOptionPane.showMessageDialog(
                        null,
                        "Puntaje Usuario: " + puntajeUser + "\n" +
                        "Puntaje PC: " + puntajePC,
                        null,
                        JOptionPane.INFORMATION_MESSAGE
                    );

                    continue;
                
                case 2:
                    System.out.println("El Usuario dice RETRUCO");

                    decisionPCREtruco = (int) (Math.random()* 3) + 1;

                    switch (decisionPCREtruco) {
                        case 1:
                            JOptionPane.showMessageDialog(null,"La PC dice QUIERO");
                            retrucoQuerido = true;
                            break;
                        
                        case 2:
                            JOptionPane.showMessageDialog(null,"La PC dice NO QUIERO");
                            puntajeUser++;

                            JOptionPane.showMessageDialog(
                                null,
                                "Puntaje Usuario: " + puntajeUser + "\n" +
                                "Puntaje PC: " + puntajePC,
                                null,
                                JOptionPane.INFORMATION_MESSAGE
                            );

                            continue;

                        case 3:
                            JOptionPane.showMessageDialog(null,"La PC dice VALECUATRO");

                            String[] opcionesUSERvalecuatro = {"Quiero", "No quiero"};

                            int decisionUSERvalecuatro = JOptionPane.showOptionDialog(
                                null,
                                "La PC te cantó VALECUATRO",
                                "Elije tu jugada",
                                JOptionPane.YES_NO_CANCEL_OPTION,
                                JOptionPane.INFORMATION_MESSAGE,
                                null,
                                opcionesUSERvalecuatro,
                                opcionesUSERvalecuatro[0]);

                            if (decisionUSERvalecuatro == 1){
                                JOptionPane.showMessageDialog(null,"El usuario dice QUIERO");
                                valeCuatroQuerido = true;
                            } else {
                                JOptionPane.showMessageDialog(null,"El Usuario dice NO QUIERO");
                                puntajePC = puntajePC + 3;

                                JOptionPane.showMessageDialog(
                                    null,
                                    "Puntaje Usuario: " + puntajeUser + "\n" +
                                    "Puntaje PC: " + puntajePC,
                                    null,
                                    JOptionPane.INFORMATION_MESSAGE
                                );

                                continue;
                            }

                        default:
                            break;
                    }
                default:
                    break;
            }

            do {
                Mano2PC = (int) (Math.random()* 3) + 1;
    
                switch (Mano2PC) {
                    case 1:
                        if (!carta1SeleccionadaPC) {
                            System.out.println("elegiste carta 1");
                            carta1SeleccionadaPC = true;
                            Mano2PC = 0;
    
                            cartaJugadaPC = carta_1_PC;
                            ImgCartaJugadaPC = carta_1_imgPC;

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
                            ImgCartaJugadaPC = carta_2_imgPC;

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
                            ImgCartaJugadaPC = carta_3_imgPC;

                        } else {
                            System.out.println("ya elegiste la carta 3");
                        }
                            break;

                    default:
                        break;
                }
            } while (Mano2PC >= 1 && Mano2PC <= 3);

        }
        
        ////////////////////////////////////////////////////////////////////////

        JPanel Check2 = new JPanel();
        Check2.add(new JLabel(ImgCartaJugadaUser));
        Check2.add(new JLabel(ImgCartaJugadaPC));

        if (cartaJugadaUser >= cartaJugadaPC) {
            manosGanadasUser++;
            JOptionPane.showMessageDialog(
                null,
                Check2,
                "El usuario gana la segunda mano",
                JOptionPane.PLAIN_MESSAGE);

        } else {                                      //aca se checkea por 2da vez cual carta jugada entre user y pc gana la mano, y se suma al contador manosganadas
            manosGanadasPC++;
            JOptionPane.showMessageDialog(
                null,
                Check2,
                "La PC gana la segunda mano",
                JOptionPane.PLAIN_MESSAGE);
        }

        if(manosGanadasUser == 2) {
            puntajeUser++;
            JOptionPane.showMessageDialog(null, "El usuario gana la ronda");
            if(trucoQuerido){
                puntajeUser = puntajeUser + 2;      //se suma el puntaje si es que truco fue cantado 
            } else if (retrucoQuerido){
                puntajeUser = puntajeUser + 3;
            } else if (valeCuatroQuerido){
                puntajeUser = puntajeUser + 4;
            }
            JOptionPane.showMessageDialog(
                null,
                "Puntaje Usuario: " + puntajeUser + "\n" +
                "Puntaje PC: " + puntajePC,
                null,
                JOptionPane.INFORMATION_MESSAGE
            );

            continue;           //se saltea el resto del loop y comienza una nueva iteracion desde el principio

        }else {
            if (manosGanadasPC == 2){
                puntajePC++;
                JOptionPane.showMessageDialog(null, "La PC gana la ronda");
                if(trucoQuerido){
                    puntajePC = puntajePC + 2;      //se suma el puntaje si es que truco fue cantado 
                } else if (retrucoQuerido){
                    puntajePC = puntajePC + 3;
                } else if (valeCuatroQuerido){
                    puntajePC = puntajePC + 4;
                }
                JOptionPane.showMessageDialog(
                    null,
                    "Puntaje Usuario: " + puntajeUser + "\n" +
                    "Puntaje PC: " + puntajePC,
                    null,
                    JOptionPane.INFORMATION_MESSAGE
                );                

                continue;

            }
        }

        //MANO 3 USER
        int seleccionMano3;

        String [] opcionesMano3 = {"Jugar primera carta", "Jugar segunda carta", "Jugar tercera carta", "Cantar truco"};

        if (TrucoCantado == true){
            String[] NuevasopcionesMano3 = {"Jugar primera carta", "Jugar segunda carta", "Jugar tercera carta"};
            opcionesMano3 = NuevasopcionesMano3;
        }
        JPanel CartasMano3 = new JPanel();

        if (carta1Seleccionada == false) {
            CartasMano3.add(new JLabel(carta_1_img));
        } else {
            CartasMano3.add(new JLabel(WHITE));
        }
        
        // Agregar la segunda carta si no está seleccionada
        if (carta2Seleccionada == false) {
            CartasMano3.add(new JLabel(carta_2_img));
        } else {
            CartasMano3.add(new JLabel(WHITE));
        }
        
        // Agregar la tercera carta si no está seleccionada
        if (carta3Seleccionada == false) {
            CartasMano3.add(new JLabel(carta_3_img));
        } else {
            CartasMano3.add(new JLabel(WHITE));
        }

        do {

            seleccionMano3 = JOptionPane.showOptionDialog(
                    null,
                    CartasMano3, 
                    "Tus cartas - 3ra mano", //titulo
                    JOptionPane.YES_NO_CANCEL_OPTION, //muestra los botones
                    JOptionPane.INFORMATION_MESSAGE, 
                    null, //ícono que se mostrará junto al mensaje, qui se utiliza null para usar el ícono predeterminado
                    opcionesMano3, 
                    opcionesMano3[0]);

            System.out.print("Ingresa el número de la carta (1, 2 o 3): ");

            switch (seleccionMano3) {
                case 0:
                    if (!carta1Seleccionada) {
                        System.out.println("elegiste carta 1");
                        carta1Seleccionada = true;
                        continuarLoop3 = false;

                        cartaJugadaUser = carta_1;
                        ImgCartaJugadaUser = carta_1_img;

                    } else {
                        JOptionPane.showMessageDialog(null, "Ya elegiste esa carta");
                    }
                        break;

                case 1:
                    if (!carta2Seleccionada) {
                        System.out.println("elegiste carta 2");
                        carta2Seleccionada = true;
                        continuarLoop3 = false;

                        cartaJugadaUser = carta_2;
                        ImgCartaJugadaUser = carta_2_img;

                    } else {
                        JOptionPane.showMessageDialog(null, "Ya elegiste esa carta");
                    }
                        break;

                case 2:
                    if (!carta3Seleccionada) {
                        System.out.println("elegiste carta 3");
                        carta3Seleccionada = true;
                        continuarLoop3 = false; 

                        cartaJugadaUser = carta_3;
                        ImgCartaJugadaUser = carta_3_img;
                    } else {
                        JOptionPane.showMessageDialog(null, "Ya elegiste esa carta");
                    }
                        break;

                case 3:
                    if(TrucoCantado == false){
                        System.out.println("En usuario canta TRUCO");
                        continuarLoop3 = false;

                        TrucoCantado = true;
                    } else if(TrucoCantado == true){
                        JOptionPane.showMessageDialog(null, "Ya se cantó TRUCO, elige otra opción.");
                    }
                        break;

                default:
                    System.out.println("Opción no válida.");
                    System.exit(0);
            }
        } while (continuarLoop3 == true);

            //TRUCO USER
            if(TrucoCantado == true && TrucoEjecutado == false){

                TrucoEjecutado = true;
    
                System.out.println("cantaste truco");
                int decisionPCtruco = (int) (Math.random()* 3) + 1;
                
    
                switch (decisionPCtruco) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "La PC dice QUIERO");
                        trucoQuerido = true; 
                        
                        
                        break;
    
                    case 2:
                        JOptionPane.showMessageDialog(null, "La PC dice NO QUIERO");
                        puntajeUser++;
                        JOptionPane.showMessageDialog(
                            null,
                            "Puntaje Usuario: " + puntajeUser + "\n" +
                            "Puntaje PC: " + puntajePC,
                            null,
                            JOptionPane.INFORMATION_MESSAGE
                        );
                        continue;
                    
                    case 3:
                        System.out.println("La PC dice RETRUCO");
                        System.out.println("1 = quiero, 2 = NO quiero, 3 = VALECUATRO");
                        
    
                        String[] opcionesUserREtruco = {"Quiero", "No quiero", "QUIERO VALE CUATRO"};
    
                        int decisionUserREtruco = JOptionPane.showOptionDialog(
                            null,
                            "La PC te cantó RETRUCO",
                            "Elije tu jugada",
                            JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.INFORMATION_MESSAGE,
                            null,
                            opcionesUserREtruco,
                            opcionesUserREtruco[0]);
                    
                       
                        switch (decisionUserREtruco) {
                            case 0:
                                JOptionPane.showMessageDialog(null, "El Usuario dice QUIERO");
                                retrucoQuerido = true;
                                break;
                            
                            case 1:
                                JOptionPane.showMessageDialog(null, "El Usuario dice NO QUIERO");
                                puntajePC++;
                                
                                JOptionPane.showMessageDialog(
                                    null,
                                    "Puntaje Usuario: " + puntajeUser + "\n" +
                                    "Puntaje PC: " + puntajePC,
                                    null,
                                    JOptionPane.INFORMATION_MESSAGE
                                );    
                                                        
                                continue;
    
                            case 2:
                                System.out.println("El usuario dice VALECUATRO");
    
                                int decisionPCvalecuatro = (int) (Math.random()* 2) + 1;

                                if (decisionPCvalecuatro == 1){
                                    JOptionPane.showMessageDialog(null, "La PC dice QUIERO");
                                    valeCuatroQuerido = true;

                                } else {
                                    JOptionPane.showMessageDialog(null, "La PC dice NO QUIERO");
                                    puntajeUser = puntajeUser + 3;
    
                                    JOptionPane.showMessageDialog(
                                    null,
                                    "Puntaje Usuario: " + puntajeUser + "\n" +
                                    "Puntaje PC: " + puntajePC,
                                    null,
                                    JOptionPane.INFORMATION_MESSAGE
                                );
                                    continue;
                                }
    
                            default:
                            System.exit(0);
                                break;
                        }
                    default:
                        break;
                }

                if (TrucoCantado == true){
                    String[] NuevasopcionesMano3 = {"Jugar primera carta", "Jugar segunda carta", "Jugar tercera carta"};
                    opcionesMano3 = NuevasopcionesMano3;
                }

            do {
                seleccionMano3 = JOptionPane.showOptionDialog(
                            null,
                            CartasMano3, 
                            "Tus cartas - 3ra mano", //titulo
                            JOptionPane.YES_NO_CANCEL_OPTION, //muestra los botones
                            JOptionPane.INFORMATION_MESSAGE, 
                            null,            //ícono que se mostrará junto al mensaje, qui se utiliza null para usar el ícono predeterminado
                            opcionesMano3, 
                            opcionesMano3[0]); //Indica cuál de las opciones es la predeterminada
        
                    
                    switch (seleccionMano3) {
                        case 0:
                            if (!carta1Seleccionada) {
                                System.out.println("elegiste carta 1");
                                carta1Seleccionada = true;
                                continuarLoopTRUCO3 = false;  
        
                                cartaJugadaUser = carta_1;
                                ImgCartaJugadaUser = carta_1_img;
        
                                System.out.println("la carta jugada es: " + cartaJugadaUser);
                            } else {
                                System.out.println("ya elegiste la carta 1");
                            }
                                break;
        
                        case 1:
                            if (!carta2Seleccionada) {
                                System.out.println("elegiste carta 2");
                                carta2Seleccionada = true;
                                continuarLoopTRUCO3 = false;  
        
                                cartaJugadaUser = carta_2;
                                ImgCartaJugadaUser = carta_2_img;
        
                            } else {
                                System.out.println("ya elegiste la carta 2");
                            }
                                break;
        
                        case 2:
                            if (!carta3Seleccionada) {
                                System.out.println("elegiste carta 3");
                                carta3Seleccionada = true;
                                continuarLoopTRUCO3 = false;  
                            
                                cartaJugadaUser = carta_3;
                                ImgCartaJugadaUser = carta_3_img;
        
                            } else {
                                System.out.println("ya elegiste la carta 3");
                            }
                                break;
        
                        case 3:
                            System.out.println("elegiste truco");
                            continuarLoop3 = false;
                            TrucoCantado = true;
                            break;
        
        
                        default:
                            System.out.println("Opción no válida.");
                            System.exit(0);
                            break;
                    }
                } while (continuarLoopTRUCO3 == true);
        }
            /////////////////////////////////




        //MANO 3 PC
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
                        ImgCartaJugadaPC = carta_1_imgPC;

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
                        ImgCartaJugadaPC = carta_2_imgPC;
                        
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
                        ImgCartaJugadaPC = carta_3_imgPC;

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
    int decisionPCREtruco = 0;
    int decisionUSERtruco = JOptionPane.showOptionDialog(
        null,
        "La PC te cantó TRUCO",
        "Elije tu jugada",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.INFORMATION_MESSAGE,
        null,
        opcionesUSERtruco,
        opcionesUSERtruco[0]

    );


    switch (decisionUSERtruco) {
        case 0:
            JOptionPane.showMessageDialog(null, "El usuario dice QUIERO");
            trucoQuerido = true; 
            
            break;

        case 1:
            JOptionPane.showMessageDialog(null, "El usuario dice NO QUIERO");
            puntajePC++;
            // TrucoCantado = false;
            
            JOptionPane.showMessageDialog(
                null,
                "Puntaje Usuario: " + puntajeUser + "\n" +
                "Puntaje PC: " + puntajePC,
                null,
                JOptionPane.INFORMATION_MESSAGE
            );

            continue;
        
        case 2:
            System.out.println("El usuario dice RETRUCO");

            decisionPCREtruco = (int) (Math.random()* 3) + 1;

            switch (decisionPCREtruco) {
                case 1:
                    JOptionPane.showMessageDialog(null, "La PC dice QUIERO");
                    retrucoQuerido = true;
                    break;
                
                case 2:
                    JOptionPane.showMessageDialog(null,"La PC dice NO QUIERO");
                    puntajeUser++;
                    // TrucoCantado = false;
                    
                    JOptionPane.showMessageDialog(
                        null,
                        "Puntaje Usuario: " + puntajeUser + "\n" +
                        "Puntaje PC: " + puntajePC,
                        null,
                        JOptionPane.INFORMATION_MESSAGE
                    );                    
                    
                    continue;

                case 3:
                JOptionPane.showMessageDialog(null,"La PC dice VALECUATRO");

                String[] opcionesUSERvalecuatro = {"Quiero", "No quiero"};


                    int decisionUSERvalecuatro = JOptionPane.showOptionDialog(
                                null,
                                "La PC te cantó VALECUATRO",
                                "Elije tu jugada",
                                JOptionPane.YES_NO_CANCEL_OPTION,
                                JOptionPane.INFORMATION_MESSAGE,
                                null,
                                opcionesUSERvalecuatro,
                                opcionesUSERvalecuatro[0]);

                    if (decisionUSERvalecuatro == 1){
                                JOptionPane.showMessageDialog(null,"El usuario dice QUIERO");
                                valeCuatroQuerido = true;
                            } else {
                                JOptionPane.showMessageDialog(null,"El Usuario dice NO QUIERO");
                                puntajePC = puntajePC + 3;
                                // TrucoCantado = false;

                                JOptionPane.showMessageDialog(
                                    null,
                                    "Puntaje Usuario: " + puntajeUser + "\n" +
                                    "Puntaje PC: " + puntajePC,
                                    null,
                                    JOptionPane.INFORMATION_MESSAGE
                                );

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
                    ImgCartaJugadaPC = carta_1_imgPC;
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
                    ImgCartaJugadaPC = carta_2_imgPC;
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
                    ImgCartaJugadaPC = carta_3_imgPC;
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

        JPanel Check3 = new JPanel();
        Check3.add(new JLabel(ImgCartaJugadaUser));
        Check3.add(new JLabel(ImgCartaJugadaPC));



        if (cartaJugadaUser >= cartaJugadaPC) {
            manosGanadasUser++;
            JOptionPane.showMessageDialog(
                null,
                Check3,
                "El usuario gana la tercer mano",
                JOptionPane.PLAIN_MESSAGE);        
            } else {                                      //aca se checkea por 3ra vez cual carta jugada entre user y pc gana la mano, y se suma al contador manosganadas
            manosGanadasPC++;
            JOptionPane.showMessageDialog(
                null,
                Check3,
                "La PC gana la tercer mano",
                JOptionPane.PLAIN_MESSAGE);
        }




        
        if(manosGanadasUser == 2) {
            puntajeUser++;

            JOptionPane.showMessageDialog(null, "El usuario gana la ronda");

            if(trucoQuerido){
                puntajeUser = puntajeUser + 2;      //se suma el puntaje si es que truco fue cantado 
            } else if (retrucoQuerido){
                puntajeUser = puntajeUser + 3;
            } else if (valeCuatroQuerido){
                puntajeUser = puntajeUser + 4;
            }

            JOptionPane.showMessageDialog(
                null,
                "Puntaje Usuario: " + puntajeUser + "\n" +
                "Puntaje PC: " + puntajePC,
                null,
                JOptionPane.INFORMATION_MESSAGE
            );            
            continue;           //se saltea el resto del loop y comienza una nueva iteracion desde el principio

        }else {
            if (manosGanadasPC == 2){
                puntajePC++;

                JOptionPane.showMessageDialog(null, "La PC gana la ronda");
                
                if(trucoQuerido){
                    puntajePC = puntajePC + 2;      //se suma el puntaje si es que truco fue cantado 
                } else if (retrucoQuerido){
                    puntajePC = puntajePC + 3;
                } else if (valeCuatroQuerido){
                    puntajePC = puntajePC + 4;
                }

                JOptionPane.showMessageDialog(
                    null,
                    "Puntaje Usuario: " + puntajeUser + "\n" +
                    "Puntaje PC: " + puntajePC,
                    null,
                    JOptionPane.INFORMATION_MESSAGE
                );                

                continue;

            }
        }

        } while ((puntajeUser < 15) && (puntajePC < 15)); //el while del loop de la partida entera





        if (puntajeUser >= 15) {
            JOptionPane.showMessageDialog(
                null,
                "Eres el ganador de la partida!",
                "FELICIDADES!",
                JOptionPane.INFORMATION_MESSAGE
            );

        } else if (puntajePC >= 15) {
            JOptionPane.showMessageDialog(
                null,
                "El ganador de la partida es la PC.",
                "Lastima!",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
        
        ////////////////////////////////////////////////////////////////////  

        //TO DO:
    }

    
}










