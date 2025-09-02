public class Encargado {
    private String nombreCompleto;
    private int numeroDeTelefono;
    private String correoElectronico;

    // Constructor
    public Encargado(String nombreCompleto, int numeroDeTelefono, String correoElectronico) {
        this.nombreCompleto = nombreCompleto;
        this.numeroDeTelefono = numeroDeTelefono;
        this.correoElectronico = correoElectronico;
    }

    // Métodos getters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
}