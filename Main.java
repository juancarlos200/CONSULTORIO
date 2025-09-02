public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso de las clases

        // Crear un encargado
        Encargado encargado = new Encargado("Carlos Pérez", 12345678, "carlos@example.com");

        // Crear una mascota
        Mascota mascota = new Mascota("Firulais", "Labrador", "Perro", 5);

        // Crear una consulta
        Consulta consulta = new Consulta("Chequeo general", 20250801, 25.3f, "Vitaminas y dieta balanceada");

        // Crear un reporte
        Reporte reporte = new Reporte(12);

        // Mostrar información
        System.out.println("Encargado: " + encargado.getNombreCompleto());
        System.out.println("Mascota: " + mascota.getNombre() + " (" + mascota.getEspecie() + ")");
        System.out.println("Consulta: " + consulta.getMotivoConsulta() + " - Tratamiento: " + consulta.getTratamientoPrescrito());
        System.out.println("Consultas este mes: " + reporte.getCantidadMensual());
    }
}