package CUATRIMESTRE_2.POO.Modelo_parcial2;

public class Cliente {
    private int id;
    private String name;
    private String address;
    private int tel;
    private String email;
    private boolean esCliente;

    //constructores
    public Cliente(){

    }

    public Cliente(int id, String name, String address, int tel, String email, boolean esCliente){
        this.id = id;
        this.name = name;
        this.address = address;
        this.tel = tel;
        this.email = email;
        this.esCliente = esCliente;
    }

    // Setter y Getter para id
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    // Setter y Getter para name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Setter y Getter para address
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    // Setter y Getter para tel
    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getTel() {
        return tel;
    }

    // Setter y Getter para email
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    //Setter y Getter para esCilente
    public void setCliente(boolean esCliente){
        this.esCliente = esCliente;
    }

    public boolean getEsCliente(){
        return esCliente;
    }


}
