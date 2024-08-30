/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1059237155
 */
public class Estudiante {
    
    //Atributos
    private String Nombre,Identificacion;
    
    //constructor no parametrizado

    public Estudiante() {
    }
    //constructor parametrizado

    public Estudiante(String Nombre, String Identificacion) {
        this.Nombre = Nombre;
        this.Identificacion = Identificacion;
    }
    //sets y gets

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }   
}
