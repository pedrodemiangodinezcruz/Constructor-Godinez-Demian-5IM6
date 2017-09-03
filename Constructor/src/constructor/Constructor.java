package constructor;

/**
 * 
 * @author Demian 5IM6
 * @version 03/09/17
 */
public class Constructor extends Emple {

    public static void main(String[] args) {
        //Creacion del objeto SIN parametros 
        Emple practicante = new Emple();
        //Metodo sueldo con el objeto practicante
        practicante.CalculaSueldo();
        //Desplegao del mensaje
        System.out.println("Su sueldo es " + practicante.getSueldo());
        System.out.println("-----------------");
        //Creación del objeto CON parametros
        Emple practicante2 = new Emple("001", "JUAN", "PRACTICANTE", 18);
        practicante2.CalculaSueldo();
        //Desplegao del mensaje
        System.out.println("Su sueldo es " + practicante2.getSueldo());
    }
}
