package com.mycompany.Clases;

import java.util.Date;

/**
 *
 * @author aspxe
 */
public class Alumno extends Persona{
    
    private int idAlumnos;
    
    //Constructor vacio
    public Alumno(){
        
    }
    
    public Alumno(int idAlumnos){
        this.idAlumnos = idAlumnos;
    }
    
    //Constructor con todos los parametros
    public Alumno(String nombre, String apellidoP, String apellidoM, Date DoB, int idAlumnos){
        super(nombre, apellidoP, apellidoM, DoB);
        this.idAlumnos = idAlumnos;
    }
    
    //Constructor sin idAlumnos
    public Alumno(String nombre, String apellidoP, String apellidoM, Date DoB){
        super(nombre, apellidoP, apellidoM, DoB);
    }
   
    
    //Metodos get y set

    @Override
    public String getNombre() {
        return nombre;
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

    public int getIdAlumnos() {
        return this.idAlumnos;
    }

    public void setIdAlumnos(int idAlumnos) {
        this.idAlumnos = idAlumnos;
    }

    @Override
    public String toString() {
        return super.toString()+" "+"idAlumno: "+getIdAlumnos();
    }
    
    
    
    
    
    
}
