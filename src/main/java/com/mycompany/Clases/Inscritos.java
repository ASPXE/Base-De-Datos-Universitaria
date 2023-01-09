package com.mycompany.Clases;

/**
 *
 * @author aspxe
 */
public class Inscritos {
    
    private int ins;
    private int fk_alumno;
    private int fk_docente;
    private int fk_materia;
    private String ciclo;
    
    //Constructor vacio
    public Inscritos(){
        
    }
    
    //Constructor con todos los parametros
    public Inscritos(int ins, int fk_alumno, int fk_docente, int fk_materia, String ciclo){
        this.fk_alumno = fk_alumno;
        this.fk_docente = fk_docente;
        this.fk_materia = fk_materia;
        this.ciclo = ciclo;
    }
    
    //Constructor solo con ins
    public Inscritos(int ins){
        this.ins = ins;
    }
    
    //Metodos get y set

    public int getIns() {
        return this.ins;
    }

    public void setIns(int ins) {
        this.ins = ins;
    }
    
    public int getFk_alumno() {
        return this.fk_alumno;
    }

    public void setFk_alumno(int fk_alumno) {
        this.fk_alumno = fk_alumno;
    }

    public int getFk_docente() {
        return this.fk_docente;
    }

    public void setFk_docente(int fk_docente) {
        this.fk_docente = fk_docente;
    }

    public int getFk_materia() {
        return this.fk_materia;
    }

    public void setFk_materia(int fk_materia) {
        this.fk_materia = fk_materia;
    }

    public String getCiclo() {
        return this.ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }
    
    
}
