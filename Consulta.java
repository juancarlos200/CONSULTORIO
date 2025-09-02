public class Consulta {
    private String motivoConsulta;
    private int fechaConsulta; 
    private float pesoMascota;
    private String tratamientoPrescrito;

    // Constructor
    public Consulta(String motivoConsulta, int fechaConsulta, float pesoMascota, String tratamientoPrescrito) {
        this.motivoConsulta = motivoConsulta;
        this.fechaConsulta = fechaConsulta;
        this.pesoMascota = pesoMascota;
        this.tratamientoPrescrito = tratamientoPrescrito;
    }

    // Métodos getters
    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public int getFechaConsulta() {
        return fechaConsulta;
    }

    public float getPesoMascota() {
        return pesoMascota;
    }

    public String getTratamientoPrescrito() {
        return tratamientoPrescrito;
    }
}