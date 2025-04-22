package Controllers;

import Models.Persona;

/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Persona.
 */
public class PersonaController {
    /**
     * Imprimir el arreglo de Persona en consola.
     * Ordena el arreglo por edad
     * imprime el arreglo ordenado
     *
     * Método para ordenar un arreglo de Persona por edad utilizando el algoritmo de
     * inserscion .
     *
     * @param personas Array de Persona a ordenar.
     */
    public void imprimirArreglo(Persona[] personas) {
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
    }
    /**
     * Método para ordenar un arreglo de Persona por edad utilizando el algoritmo de
     * inserción.
     *
     * @param personas Array de Persona a ordenar.
     */
    public void ordenarPorEdad(Persona[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Persona persona = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].getEdad() > persona.getEdad()) {
                personas[j + 1] = personas[j];
                j = j - 1;

            }
            personas[j + 1] = persona;
        }
        
    }
    


    /**
     * Método para buscar la primera persona con una edad específica en un array de
     * Persona.
     * 
     * @param personas Array de Persona donde buscar.
     * @param edad     Edad a buscar.
     * @return La primera Persona con la edad especificada, o null si no se
     *         encuentra.
     */

    public Persona buscarPorEdad(Persona[] personas, int edad) {
        for (Persona persona : personas) {
            if (persona.getEdad() == edad) {
                return persona;
            }
        }
        return null;

    }

}
