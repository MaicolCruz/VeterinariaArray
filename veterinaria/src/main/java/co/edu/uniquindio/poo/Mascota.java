/**
 * Clase para probar el funcionamiento del código de la informacion de estudiantes
 * @author Maicol Steven Paez Cruz y Hector Daniel Gonzales Sanzhez
 * @since 2024-03-03
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

public record Mascota(
    int id,
    String nombre,
    String especie,
    String raza,
    int edad,
    String genero,
    String color,
    float peso
) {
    
    @Override
    public String toString() {
        return  "\n"+ "Mascota: " +
                "" + "ID: " + id +
                "" + " Nombre: " + nombre +
                "" + " Especie: " + especie +
                "" + " Raza: " + raza +
                "" + " Edad: " + edad +
                "" + " Genero: " + genero +
                "" + " Color: " + color + 
                "" + " Peso kg: " + peso;
    }


    public Mascota(int id,String nombre, String especie, String raza, int edad, String genero, String color, float peso) {
        this.id =id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.genero = genero;
        this.color = color;
        this.peso = peso;

        // Validar nombre no vacío
        if (nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }

        // Validar especie no vacía
        if (especie.isEmpty()) {
            throw new IllegalArgumentException("La especie no puede estar vacía");
        }

        // Validar raza no vacía
        if (raza.isEmpty()) {
            throw new IllegalArgumentException("La raza no puede estar vacía");
        }

        // Validar edad positiva
        if (edad <= 0) {
            throw new IllegalArgumentException("La edad debe ser un valor positivo");
        }

        // Validar genero no vacío
        if (genero.isEmpty()) {
            throw new IllegalArgumentException("El genero no puede estar vacío");
        }

        // Validar color no vacío
        if (color.isEmpty()) {
            throw new IllegalArgumentException("El color no puede estar vacío");
        }

        // Validar peso positivo
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser un valor positivo");
        }

    }


   
}
