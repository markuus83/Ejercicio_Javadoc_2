/**
 * Iniciamos la clase en el paquete 'estudiante'
 */

package estudiante;
/**
 * La clase Estudiante representa a un estudiante con su nombre, edad y calificación.
 */
public class Estudiante {

    /** 
     * El nombre del estudiante *
     */
    private String nombre;

    /** 
     * La edad del estudiante 
     */
    private int edad;

    /** 
     * La calificación del estudiante 
     */
    private double calificacion;

    /**
     * Constructor diseñado para crear un nuevo estudiante con nombre y edad.
     * @param nombre El nombre del estudiante.
     * @param edad La edad del estudiante.
     */
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = 0.0;
    }

    /**
     * Establece la calificación del estudiante.
     * @param calificacion La calificación del estudiante.
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Obtiene el nombre del estudiante.
     * @return el nombre del estudiante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del estudiante.
     * @param nombre, el nombre del estudiante.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad del estudiante.
     * @return la edad del estudiante.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del estudiante.
     * @param edad La edad del estudiante.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene la calificación del estudiante.
     * @return la calificación del estudiante.
     */
    public double getCalificacion() {
        return calificacion;
    }

    /**
     * Comprueba si el estudiante aprobó con una calificación mayor o igual a 5.0.
     * @return true si el estudiante aprobó, false de lo contrario.
     */
    public boolean aprobo() {
        return calificacion >= 5.0;
    }

    /**
     * Calcula la edad escolar del estudiante dividiendo su edad por 12.
     * @return La edad escolar del estudiante.
     */
    public int edadEscolar() {
        return edad / 12;
    }

    /**
     * Comprueba si el estudiante es mayor de 18.
     * @return true si el estudiante es mayor de edad, de no serlo.
     */
    public boolean esUniversitario() {
        return edad >= 18;
    }

    /**
     * Imprime toda la información del estudiante.
     */
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calificación: " + calificacion);
    }
}
