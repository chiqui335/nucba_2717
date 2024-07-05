package CUATRIMESTRE_2.POO.Tp_Integrador;

public class Main {
    public static void main(String[] args){



        Socio yo = new Socio(1,"Gamaliel","Corrientes 2036",8);
		
		Libro lunaDePluton = new Libro(2,"Luna de pluton","dross",true);
	
		Libro Dune = new Libro(13,"Dune","alguien",false);
		
		Libro Mistborn = new Libro(22,"Mistborn","B.Sanderson",true);

		yo.prestarLibro(lunaDePluton);
		yo.prestarLibro(Dune);
		yo.prestarLibro(Mistborn);
    }
}
