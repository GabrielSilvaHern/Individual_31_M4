//Ingresando subclase Eventual
public class Eventual extends Trabajador {


    private String disponibilidad;
    private String correoElectronico;

    public Eventual(){

    }

    public Eventual (String nombres, String apellidos, String run, String telefono, int edad, String disponibilidad, String correoElectronico) {
        super(nombres,apellidos,run,telefono,edad);
        this.disponibilidad = disponibilidad;
        this.correoElectronico = correoElectronico;

    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }

    @Override
    public String toString() {
        return "Eventual{" +
                "disponibilidad='" + disponibilidad + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }
}