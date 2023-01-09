package com.mycompany.Clases;

/**
 *
 * @author aspxe
 */
public class Licenciatura {
    
    private int idLicenciaturas;
    private String clave;
    private String REVOE;
    private String nombre;
    
    //Constructor vacio
    public Licenciatura(){
        
    }
    
    //Constructor con todos los parametros
    public Licenciatura(String clave, String REVOE, String nombre, int idLicenciaturas){
        this.clave = clave;
        this.REVOE = REVOE;
        this.nombre = nombre;
        this.idLicenciaturas = idLicenciaturas;
    }
    
    //Constructor con solo idLicenciaturas
    public Licenciatura(int idLicenciaturas){
        this.idLicenciaturas = idLicenciaturas;
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

    public int getIdLicenciaturas() {
        return this.idLicenciaturas;
    }

    public void setIdLicenciaturas(int idLicenciaturas) {
        this.idLicenciaturas = idLicenciaturas;
    }

    @Override
    public String toString() {
        return "Licenciatura{" + "idLicenciaturas=" + idLicenciaturas + ", clave=" + clave + ", REVOE=" + REVOE + ", nombre=" + nombre + '}';
    }
    
    

}
