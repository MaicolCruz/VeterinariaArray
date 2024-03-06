/**
 * Clase para probar el funcionamiento del código de la informacion de estudiantes
 * @author Maicol Steven Paez Cruz y Hector Daniel Gonzales Sanzhez
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
    public static List <Mascota> mayorEdad = new ArrayList<>();
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

            //Creamos la mascota y la almacenamos en lista mascota
            //al mismo tiempo guardamos los nombres en la lista nomMascotas
            Mascota mascota = new Mascota(i+1, nombre,  especie,  raza,  edad,  genero,  color,  peso);  
            nomMascotas.add(nombre);
            listaMascota.add(mascota);

        }
        //con el Collections.sort(nomMascotas); ordenamos los nombres de la AZ de la lista nomMascotas
        Collections.sort(nomMascotas);
        List <Mascota> mascota  = new ArrayList<>() ;
        //Realizamos un forech en el cual recorremos la lista de los nombres ordenados y si la nomMascota es = a la posison
        //de Nnommascota la guardamos en la lista mascota de la linea 63
        for (String nomMascota : nomMascotas) {
            mascota.add (obtenerMascota(nomMascota));
            //validamos con el metodo obtener mascota enviandole la el nombre que guardamos en la lista mascota
          
        }
        System.out.println(mascota.toString());
        obtenermayorEdad();
        System.out.println("Mascotas mayores de 10 años:\n"+ mayorEdad);
    }
 
    
    //creamos un metodo el cual recibe el nombre de la mascota y la recorremos en la lista mascota, validando que si 
    // no esta en dicha lista la agregue ordenadamente
    public static  Mascota  obtenerMascota(String nomMascotas){
        Mascota mascotaTmp = null;
        for (Mascota mascTmp : listaMascota){
            if (nomMascotas ==mascTmp.nombre() ) {
                 mascotaTmp = mascTmp;
            }
        }
      return mascotaTmp;
        
    }
    //en esta linea podemos validar las edades de las mascotas que sean iguales o mayores a 10 años y nos indique cuales son.
    public static List<Mascota> obtenermayorEdad() {
        for (Mascota mascota : listaMascota) {
            if (mascota.edad() >= 10) {
                mayorEdad.add(mascota);
            }
        }
        return mayorEdad;
    }
}