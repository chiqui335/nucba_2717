package Introduccion_Programacion.Semana11_2;

public class Estacionamiento {
    Scanner sc = new Scanner(System.in);
        String patentes [] = new String[10];
        patentes[] = "ABX778";
        patentes[] = "THJ778";
        patentes[] = "ABX568";
        
        
        System.out.println("Ingrese patente del vehiculo que ingresa");
        String patIngr=sc.nextLine();
        
        boolean ingresado=false;
        for(int=0; i< patentes.length && ingresado==false; i++){
            if(patentes[i]==null){
                patentes[i]=null;
                ingresado=true;
                System.out.println("vehiculo ingresado");
            }
        }
        
        boolean despachado=false;
        System.out.println("Ingrese la patente del vehiculo que sale");
        String patSal=sc.nextLine();
        for (i=0; i <= patentes.length && despachado==false ; i++){
            p=patentes[i];
            
            if(p!=null && p.equalsIgnorCase(patSal)){
                patentes[i]=null;
                despachado=true;
                pos=i;
            }
        }
        if (despachado==true){
            System.out.println("Hasta pronto, se libero el lugar");
        } else{
            System.out.println("vehiculo no registrado");
        }
}
