package com.mycompany.Clases;

/**
 *
 * @author aspxe
 */
public class Materia {
    
    private int fk_licenciaturaId;
    private String clave;
    private String nombre;
    
    //Constructor vacio
    public Materia(){
        
    }
    
    //Constructor con todos los parametros
    public Materia(int fk_licenciaturaId, String clave, String nombre){
        this.fk_licenciaturaId = fk_licenciaturaId;
        this.clave = clave;
        this.nombre = nombre;
    }
    
    //Metodos get y set

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
    
    
}
