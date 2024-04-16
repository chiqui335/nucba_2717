package empresa;

public class Empleado {
	//declaración de variables(atributos) SIN ENCAPSULAR
	public String nombreEmpleado;
	public int id;
	public String apellidoEmpleado;
	public double salario;
	public Direccion d1;//vinculación entre clases!!!!
	
	//declaración de métodos(operaciones)
	public void mostrarInfo() {
		System.out.println("Nombre:"+ nombreEmpleado + "\nID:"+id
				+"\nApellido:"+apellidoEmpleado+ "\nSalario:"+salario);
		
	}
	
	
	
	
	
	

}
