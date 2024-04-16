package CUATRIMESTRE_2.POO.EmpresaYo.src2.empresa2;

public class Cliente2 {

    public int numeroPedidos;
    public int id;
    public String Username;
    public boolean enDeuda;

    public void showInfoCliente() {
        System.out.println("id cliente: " + id + "username: " + Username + "enDeuda: " + enDeuda + "numero de pedidos: "
                + numeroPedidos);
    }
}
