import Controllers.PersonaController;
import Models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26),
        };

        PersonaController controller = new PersonaController();
        controller.ordenarPorEdad(personas);

        System.out.println("Personas ordenadas por edad:");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " : " + persona.getEdad());
        }
        System.out.println("--------------------------------------------------");
        int edadBuscada = 40;
        Persona encontrada = controller.buscarPorEdad(personas, edadBuscada);
        System.out.println("Buscando persona con edad " + edadBuscada + "...");
        if (encontrada != null) {
            System.out.println("Persona encontrada: " + encontrada.getNombre() + " - " + encontrada.getEdad());
        } else {
            System.out.println("No se encontró una persona con la edad " + edadBuscada);
        }
        System.out.println("--------------------------------------------------");
        //buscar persona con edad 99
        edadBuscada = 99;
        encontrada = controller.buscarPorEdad(personas, edadBuscada);
        System.out.println("Buscando persona con edad " + edadBuscada + "...");
        if (encontrada != null) {
            System.out.println("Persona encontrada: " + encontrada.getNombre() + " - " + encontrada.getEdad());
        } else {
            System.out.println("No se encontró una persona con la edad " + edadBuscada);
        }
    }
}