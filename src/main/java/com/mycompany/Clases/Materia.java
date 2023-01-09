package com.mycompany.Clases;

/**
 *
 * @author aspxe
 */
public class Materia {
    
    private int idMaterias;
    private int fk_licenciaturaId;
    private String clave;
    private String nombre;
    
    //Constructor vacio
    public Materia(){
        
    }
    
    //Constructor con todos los parametros
    public Materia(int fk_licenciaturaId, int idMaterias, String clave, String nombre){
        this.fk_licenciaturaId = fk_licenciaturaId;
        this.idMaterias = idMaterias;
        this.clave = clave;
        this.nombre = nombre;
    }
    
    //Constructor con solo la llave foranea
    public Materia(int fk_licenciaturaId){
        this.fk_licenciaturaId = fk_licenciaturaId;
    }
    
    //Constructor con idMaterias y fk_licenciaturaId
    public Materia(int fk_licenciaturaId, int idMaterias){
        this.fk_licenciaturaId = fk_licenciaturaId;
        this.idMaterias = idMaterias;
    }
    //Metodos get y set

    public int getIdMaterias() {
        return this.idMaterias;
    }

    public void setIdMaterias(int idMaterias) {
        this.idMaterias = idMaterias;
    }

    public int getFk_licenciaturaId() {
        return this.fk_licenciaturaId;
    }

    public void setFk_licenciaturaId(int fk_licenciaturaId) {
        this.fk_licenciaturaId = fk_licenciaturaId;
    }

    public String getClave() {
        return this.clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Materia{" + "idMaterias=" + idMaterias + ", fk_licenciaturaId=" + fk_licenciaturaId + ", clave=" + clave + ", nombre=" + nombre + '}';
    }
    
    
    
}
