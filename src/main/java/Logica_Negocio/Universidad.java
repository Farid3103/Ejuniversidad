/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author 1059237155
 */
public class Universidad {
    //Atributos
    private String Nombre,Nit;
    private   ArrayList<Estudiante>lsestudiantes;
    
    //constructor no parametrizado

    public Universidad() {
    }
    //constructor parametrizado

    public Universidad(String Nombre, String Nit, ArrayList<Estudiante> lsestudiantes) {
        this.Nombre = Nombre;
        this.Nit = Nit;
        this.lsestudiantes = lsestudiantes;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNit() {
        return Nit;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }

    public ArrayList<Estudiante> getLsestudiantes() {
        return lsestudiantes;
    }

    public void setLsestudiantes(ArrayList<Estudiante> lsestudiantes) {
        this.lsestudiantes = lsestudiantes;
    }

  
   
            
}
