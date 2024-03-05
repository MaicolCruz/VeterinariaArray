/**
 * Clase para probar el funcionamiento del código de la informacion de estudiantes
 * @author Maicol Steven Paez Cruz
 * @since 2024-03-03
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    public static List <Mascota> listaMascota = new ArrayList<>();
    public static List <String> nomMascotas = new ArrayList<>();
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuantas mascotas desea ingresar?");
        int cantMascotas = entrada.nextInt();

        
        for (int i = 0; i < cantMascotas; i ++){
                     
            System.out.println("¿Cual es el nombre de la mascota?");
            String nombre = entrada.next();

            System.out.println("¿Que especie es la mascota?");
            String especie = entrada.next();
            
            System.out.println("¿Que raza es la mascota?");
            String raza = entrada.next();

            System.out.println("¿Que edad tiene es la mascota?");
            int edad = entrada.nextInt();
            
            System.out.println("¿Que genero es la mascota?");
            String genero = entrada.next();

            System.out.println("¿Que color tiene la mascota?");
            String color = entrada.next();

            System.out.println("¿Que peso tiene la mascota?");
            float peso = entrada.nextFloat();

            Mascota mascota = new Mascota(i+1, nombre,  especie,  raza,  edad,  genero,  color,  peso);  
            nomMascotas.add(nombre);
            listaMascota.add(mascota);

        }
        Collections.sort(nomMascotas);
        List <Mascota> mascota  = new ArrayList<>() ;

        for (String nomMascota : nomMascotas) {
            mascota.add (obtenerMascota(nomMascota));
          
        }
        System.out.println(mascota.toString());
 
    }

    public static  Mascota  obtenerMascota(String nomMascotas){
        Mascota mascotaTmp = null;
        for (Mascota mascTmp : listaMascota){
            if (nomMascotas ==mascTmp.nombre() ) {
                 mascotaTmp = mascTmp;
            }
        }
      return mascotaTmp;
        
    }
}