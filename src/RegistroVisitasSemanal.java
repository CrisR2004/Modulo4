import java.util.Scanner;

public class RegistroVisitasSemanal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables para almacenar información del visitante
        String nombre;
        int edad;

        // Variables para registrar las vistas
        int totalVisitas = 0;
        int tiempoTotal = 0;

        // Bucle para registrar las visitas de la semana
        for (int dia = 1; dia <= 7; dia++) {
            System.out.println("\n**Día " + dia + "**");

            // Registro de la hora de entrada
            System.out.println("Ingrese la hora de entrada (formato 24h): ");
            int horaEntrada = scanner.nextInt();

            // Registro de la hora de salida
            System.out.println("Ingrese la hora de salida (formato 24h): ");
            int horaSalida = scanner.nextInt();

            // Cálculo del tiempo de estadía
            int tiempoEstadia = horaSalida - horaEntrada;

            // Validación del tiempo de estadía
            if (tiempoEstadia < 0) {
                System.out.println("La hora de salida debe ser posterior a la hora de entrada.");
                dia--;
                continue;
            }

            // Actualización del total de visitas y tiempo total
            totalVisitas++;
            tiempoTotal += tiempoEstadia;
        }

        // Cálculo del tiempo promedio de estadía
        float tiempoPromedio = (float) tiempoTotal / totalVisitas;

        // Registro de la edad del visitante
        System.out.println("\nIngrese su nombre: ");
        nombre = scanner.next();
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(scanner.next());

        // Impresión de la información del visitante
        System.out.println("\n**Información del visitante:**");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

        // Impresión de las estadísticas de las visitas
        System.out.println("\n**Estadísticas de las visitas:**");
        System.out.println("Total de visitas: " + totalVisitas);
        System.out.println("Tiempo total de estadía: " + tiempoTotal + " minutos");
        System.out.println("Tiempo promedio de estadía: " + tiempoPromedio + " minutos/visita");

        // Mensaje sobre la mayoría de edad
        if (edad >= 18) {
            System.out.println("El visitante es mayor de edad.");
        } else {
            System.out.println("El visitante es menor de edad.");
        }
    }
}