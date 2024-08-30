/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Estudiante;
import Logica_Negocio.Universidad;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1059237155
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nombre_Est,identificacion ;
       String nombre,nit ;
       ArrayList<Estudiante> lsestudiantes= new ArrayList<>();
       int num_Est;
       Scanner scan = new Scanner(System.in);
       //Pedimos el numero de estudiantes a registrar
       System.out.println("Digite el numero de estudiantes");
        num_Est=scan.nextInt();
       //Pedimos el nombre y identificacion mediante el ciclo for por cada estudiante 
       for (int i = 0; i < num_Est; i++) {
           System.out.print("Digite el nombre del estudiante: ");
            nombre_Est=scan.next();
            
           System.out.print("Digite la identificacion del estudiante: ");
           identificacion=scan.next();
           //Creamos un estudiante con los datos que ingreso   
           Estudiante objEstudiante= new Estudiante(nombre_Est,identificacion);
           lsestudiantes.add(objEstudiante);
            
           }      
        /**
         * 
         * Pedimos el nombre y nit de la universidad, 
         * este no necesita un ciclo for 
         * porque solo es para ingresar una universidad
         * 
        */
        System.out.println("Digite el nombre de la universidad");
        nombre=scan.next();
        
        System.out.println("Digite el nit de la universidad");
        nit=scan.next();
        //Aqui crea la universidad con los datos que ingresaron
        Universidad objUniversidad= new Universidad(nombre,nit,lsestudiantes);
        /**
         * 
         * Aqui mostramos el nombre y nit de la universidad,
         * con los datos que nos dieron    
        */
        System.out.println("El nombre de la universidad es:"+"\t"+objUniversidad.getNombre());
        System.out.println("La nit de la universidad es:"+"\t"+objUniversidad.getNit());
        /**
         * 
         * Aqui, mediante el ciclo for mostramos la lista de estudiantes,
         * que han ingresado al listado
         * 
         */ 
        for (int i = 0; i <objUniversidad.getLsestudiantes().size(); i++) {
            
            System.out.println("El nombre del estudiante es:"+"\t"+objUniversidad.getLsestudiantes().get(i).getNombre());
            System.out.println("La identificacion del estudiante es:"+"\t"+objUniversidad.getLsestudiantes().get(i).getIdentificacion());
        }             
    }
}