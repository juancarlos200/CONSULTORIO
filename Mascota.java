public class Mascota {
    private String nombre;
    private String raza;
    private String especie;
    private int edad;

    // Constructor
    public Mascota(String nombre, String raza, String especie, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.especie = especie;
        this.edad = edad;
    }

    // Métodos getters
    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }
}