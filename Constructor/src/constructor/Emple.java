
package constructor;

/**
 * Esta clase contiene los datos del trabajador y su sueldo en relacion a su edad  
 * @author Demian 5IM6
 * @version 03/09/17
 */
public class Emple {
    //Inicialización de las varibales (Se encapsulan)
    private String codigo;
    private String nombre;
    private String puesto;
    private int edad;
    private double sueldo;
    
/**
 *@param codigo Codigo exclusivo del trabajadora.
 * @param nombre Nombre del cliente.
 * @param puesto Puesto en la empresa.
 * @param edad Edad del cliente.
 */
    public Emple(String codigo, String nombre, String puesto, int edad) //Constructor con parametros
    {
       this.codigo = codigo;
        this.nombre = nombre;
        this.puesto = puesto;
        this.edad = edad;
    }
    public void CalculaSueldo() //Metodo para el sueldo
    {
    sueldo = 500 + edad*1.10;
    }

    public  Emple(){ //Constructor vacio
    sueldo = 30;
    }
    
    //Sets y Gets de las variables
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
