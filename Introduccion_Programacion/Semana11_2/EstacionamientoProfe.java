import java.util.Scanner;
public class EstacionamientoProfe
{
    //
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String patentes[]=new String[10];
        patentes[0]="ABX778";
        patentes[2]="THJ778";
        patentes[3]="ABX568";
        
        String nombres[]=new String[10];
        nombres[0]="Ariel G.";
        nombres[2]="Boris A.";
        nombres[3]="Andres G.";
        
        int edades[]=new int[10];
        edades[0]=23;
        edades[2]=33;
        edades[3]=18;
        
        boolean clienRec[]=new boolean[10];
        clienRec[0]=true;
        clienRec[2]=true;
        clienRec[3]=false;
        
        int pos=-1;
        boolean ingresado=false;
        
        System.out.println("Ingrese patente");
        String patIng=sc.nextLine();
        
        System.out.println("Ingrese nombre");
        String nomIng=sc.nextLine();
        
        System.out.println("Ingrese edad");
        int edadIng=sc.nextInt();
        
        System.out.println("¿es cliente recurrente?");
        boolean cr=sc.nextBoolean();
        
        String p;
        for(int i=0;edadIng>=18 && i<patentes.length && ingresado==false;i++){
            p=patentes[i];
            if(p==null){
                patentes[i]=patIng;
                nombres[i]=nomIng;
                edades[i]=edadIng;
                clienRec[i]=cr;
                ingresado=true;
                pos=i;
            }
        }
        if(edadIng<18){
            System.out.println("Menor de edad no puede estacionar");
        }else{ 
            if(ingresado==true){
                System.out.println("Dirjase a posicion "+pos);
            }else{
                System.out.println("no hay espacios disponibles");
            }
        }
        
        
        
        
        
        
        
        
        //inciso b
        pos=-1;
        boolean despachado=false;
        System.out.println("Ingrese patente del vehiculo que sale");
        String patSal=sc.nextLine();
        for(int i=0;i<patentes.length && despachado==false;i++){
            p=patentes[i];
            /*
            if(p==null) {
               continue; 
            }
            
            if(p!=null){
                if(p.equalsIgnoreCase(patSal)){
                    //
                }
            }
            */
            if(p!=null && p.equalsIgnoreCase(patSal)){
                patentes[i]=null;
                despachado=true;
                pos=i;
            }
        }
        if(despachado==true){
            System.out.println("Hasta pronto. Se libero el lugar "+pos);
        }else{
            System.out.println("vehiculo no fue registrado ");
        }
    }
}