package CUATRIMESTRE_3.Prog_avanzada.Clase10;

import java.util.ArrayList;
import java.util.List;

// Singleton DA ERROR PORQUE FALTAN LAS CLASES
public class Biblioteca {
    private static Biblioteca instance; // Variable de clase que contiene la única instancia, obligatorio
    private List<Item> inventario;
    private List<Usuario> usuarios;
    private List<Prestamo> prestamo;

    private Biblioteca() { // Constructor privado
        inventario = new ArrayList<>();
        usuarios = new ArrayList<>();
        prestamo = new ArrayList<>();
    }

    public static Biblioteca getInstance() { // Método público estático para obtener la instancia, obligatorio
        if (instance == null) {
            instance = new Biblioteca();
        }
        return instance;
    }

    // Metodos: 
    public void addItem(Item item){
        inventario.add(Item);
    }

    public void registrarUsuario(Usuario usuario) throws Exception {
        if(usuarios.stream().anymatch(u-> u.getId().equals(usuario.getId()))){ //Metodo lambda, mas corto que el bucle for
            throw new Exception("usuario ya registrado");
        }
        usuario.add(usuario);
    }

    public void prestarItem(Usuario usuario, Item item) throws Exception{
        if(prestamo.stream().anymatch(p->p.getItem().equals(item))){
            throw new Exception("Item no disponible");
        }
        prestamo.add(new prestamo (Usuario, item));
    }

    public void devolverItem(Prestamo prestamo){
        prestamo.remove(prestamo);
    }

    public void mostrarInventario(){
        inventario.forEach(item -> System.out.println("inventario: " item.toString()))
    }
}
