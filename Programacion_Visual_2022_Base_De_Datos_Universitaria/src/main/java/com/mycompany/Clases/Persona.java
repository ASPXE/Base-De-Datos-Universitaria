package com.mycompany.Clases;

import java.util.Date;

/**
 *
 * @author aspxe
 */
public class Persona {
    
    protected String nombre;
    protected String apellidoP;
    protected String apellidoM;
    //Investigar como funciona esta cosa de Date en java
    protected Date DoB;
    
    
    //Constructor vacio
    public Persona(){
        
    }
    
    //Constructor con todas las variables
    public Persona(String nombre, String apellidoP, String apellidoM, Date DoB){
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.DoB = DoB;
    }
    
    //Metodos get y set

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return this.apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return this.apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public Date getDoB() {
        return this.DoB;
    }

    public void setDoB(Date DoB) {
        this.DoB = DoB;
    }
    
    
}
