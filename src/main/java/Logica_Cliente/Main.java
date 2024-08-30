/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import static Helpers.HelperValidacion.RetornarCEV2;
import static Helpers.HelperValidacion.RetornarLetra;
import static Helpers.HelperValidacion.ValidarVacio;
import Logica_Negocio.Estudiante;
import Logica_Negocio.Universidad;
import java.util.ArrayList;
import java.util.InputMismatchException;
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
       int num_Est = 0,rta,conteo,conte;
       Scanner scan = new Scanner(System.in);
       
       //Pedimos el numero de estudiantes a registrar
       do{
        try {   
       System.out.println("Digite el numero de estudiantes");
        num_Est=scan.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Error:");
       } 
         scan.nextLine();
       }while ( num_Est<=0);
       
       //Pedimos el nombre y identificacion mediante el ciclo for por cada estudiante 
       for (int i = 0; i < num_Est; i++) {
           System.out.println("Digite el nombre del estudiante: ");
            nombre_Est=scan.nextLine();
            rta = Helpers.HelperValidacion.ValidarVacio(nombre_Est);
            
            while (rta > 0) {
                System.out.println("Digite el nombre del estudiante: ");
                nombre_Est=scan.nextLine();
                 rta = Helpers.HelperValidacion.ValidarVacio(nombre_Est);
            }
            
              conteo = Helpers.HelperValidacion.ValidarTodo(nombre_Est);

              while (conteo != 0) {
                System.out.println("Digite el nombre del estudiante: ");
                nombre_Est = scan.nextLine();
                conteo = Helpers.HelperValidacion.ValidarTodo(nombre_Est);
              }
              //pedimos numero de identificacion
           System.out.println("Digite la identificacion del estudiante: ");
           identificacion=scan.next();
             rta = Helpers.HelperValidacion.ValidarTodoLetra(identificacion);
             
             scan.nextLine();
             
              while (rta > 0) {
                System.out.println("Digite la identificacion del estudiante: ");
                identificacion=scan.nextLine();
                 rta = Helpers.HelperValidacion.ValidarTodoLetra(identificacion);
              }
                while (conteo != 0) {
                System.out.println("Digitela identificacion del estudiante: ");
                identificacion= scan.nextLine();
                conteo = Helpers.HelperValidacion.ValidarTodoLetra(identificacion);
              }
           
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
        System.out.println("Digite el nombre de la universidad: ");
        nombre=scan.next();
        rta = Helpers.HelperValidacion.ValidarVacio(nombre);
            
          scan.nextLine();
          
            while (rta > 0) {
            System.out.println("Digite el nombre de la universidad: ");
            nombre=scan.nextLine();
            rta = Helpers.HelperValidacion.ValidarVacio(nombre);
            }
            
              conteo = Helpers.HelperValidacion.ValidarTodo(nombre);

              while (conteo != 0) {
              System.out.println("Digite el nombre de la universidad: ");
              nombre = scan.nextLine();
              conteo = Helpers.HelperValidacion.ValidarTodo(nombre);
              }
        
        System.out.println("Digite el nit de la universidad: ");
        nit=scan.next();
        
             rta = Helpers.HelperValidacion.ValidarTodoLetra(nit);
             
             scan.nextLine();
             
             while (rta > 0) {
             System.out.println("Digite el nit de la universidad: ");
             nit=scan.nextLine();
             rta = Helpers.HelperValidacion.ValidarTodoLetra(nit);
              }
                while (conteo != 0) {
                System.out.println("Digite el nit de la universidad: ");
                nit= scan.nextLine();
                conteo = Helpers.HelperValidacion.ValidarTodoLetra(nit);
              }
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