package com.mycompany.Clases;

import java.util.Date;

/**
 *
 * @author aspxe
 */

public class Docente extends Persona{
    
    private int idDocentes;

    //Constructor vacio
    public Docente(){
        
    }
    
    //Constructor con todos los parametros
    public Docente(String nombre, String apellidoP, String apellidoM, Date DoB, int idDocentes){
        super(nombre, apellidoP, apellidoM, DoB);
        this.idDocentes = idDocentes;
    }
    
    //Constructor que no toma en cuenta el idDocentes
    public Docente(String nombre, String apellidoP, String apellidoM, Date DoB){
        super(nombre, apellidoP, apellidoM, DoB);
    }
    
    //Metodos get y set de Docente

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellidoP() {
        return apellidoP;
    }

    @Override
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    @Override
    public String getApellidoM() {
        return apellidoM;
    }

    @Override
    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    @Override
    public Date getDoB() {
        return DoB;
    }

    @Override
    public void setDoB(Date DoB) {
        this.DoB = DoB;
    }
    
    
    
    
}
