package com.mycompany.Clases;

/**
 *
 * @author aspxe
 */
public class Licenciatura {
    
    private String clave;
    private String REVOE;
    private String nombre;
    
    //Constructor vacio
    public Licenciatura(){
        
    }
    
    //Constructor con todos los parametros
    public Licenciatura(String clave, String REVOE, String nombre){
        this.clave = clave;
        this.REVOE = REVOE;
        this.nombre = nombre;
    }
    
    //Metodos get y set

    public String getClave() {
        return this.clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getREVOE() {
        return this.REVOE;
    }

    public void setREVOE(String REVOE) {
        this.REVOE = REVOE;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
