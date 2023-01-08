package com.mycompany.DataAccessObjects;

import com.mycompany.Clases.Alumno;
import com.mycompany.Clases.Persona;
import com.mycompany.Conexion.Conexion;
import java.sql.*;
import java.sql.Date;
import java.util.*;

/**
 *
 * @author aspxe
 */
public class AlumnoDAO {
    
    private static final String SQL_SELECT = "SELECT idAlumnos, Nombre, ApellidoP, ApellidoM, DoB FROM Alumnos";
    private static final String SQL_INSERT = "INSERT INTO Alumnos(Nombre, ApellidoP, ApellidoM, DoB) VALUES(?,?,?,?)";
    private static final String SQL_DELETE = "DELETE FROM Alumnos WHERE idAlumnos = ?";
    private static final String SQL_UPDATE = "UPDATE Alumnos SET Nombre = ?, ApellidoP = ?, ApellidoM = ?, DoB = ? WHERE idAlumnos = ?";
    
    //Regresa una lista generica de objetos tipo Alumno
    public List<Alumno> seleccionar() throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Alumno alumno = null;
        List<Alumno> alumnos = new ArrayList<>();
        
        conn = Conexion.getConnection();
        stmt = conn.prepareStatement(this.SQL_SELECT);
        rs = stmt.executeQuery();
        
        //Mientras haya registros que iterar
        while(rs.next()){
            int idAlumnos = rs.getInt("idAlumnos");
            String nombre = rs.getString("Nombre");
            String apellidoP = rs.getString("ApellidoP");
            String apellidoM = rs.getString("ApellidoM");
            //Debemos de importar la clase de java.sql.Date para eliminar el error que nos marca
            Date DoB = rs.getDate("DoB");
            alumno = new Alumno(nombre, apellidoP, apellidoM, DoB, idAlumnos);
            
            alumnos.add(alumno);
        }
        //Cerramos en el orden inverso en el que declaramos las instancias
        Conexion.close(rs);
        Conexion.close(stmt);
        Conexion.close(conn);
        
        return alumnos;
        
    }
    
    //Insertar en la base de datos
    public int insertar(Alumno a) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        conn = Conexion.getConnection();
        stmt = conn.prepareStatement(this.SQL_INSERT);
        stmt.setString(1, a.getNombre());
        stmt.setString(2, a.getApellidoP());
        stmt.setString(3, a.getApellidoM());
        stmt.setDate(4, (Date) a.getDoB());
        registros = stmt.executeUpdate();//Este metodo puede ejecutar sentencias insert, delete o update
        Conexion.close(stmt);
        Conexion.close(conn);
        return registros;
    }
    
    //Eliminar un registro en la base de datos
    
    public int eliminar(Alumno a) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        conn = Conexion.getConnection();
        stmt = conn.prepareStatement(this.SQL_DELETE);
        stmt.setInt(1, a.getIdAlumnos());
        registros = stmt.executeUpdate();
        Conexion.close(stmt);
        Conexion.close(conn);
        
        return registros;
    }
    
    public int actualizar(Alumno a) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        conn = Conexion.getConnection();
        stmt = conn.prepareStatement(this.SQL_UPDATE);
        stmt.setString(1, a.getNombre());
        stmt.setString(2, a.getApellidoP());
        stmt.setString(3, a.getApellidoM());
        stmt.setDate(4, (Date) a.getDoB());
        stmt.setInt(5, a.getIdAlumnos());
        registros = stmt.executeUpdate();
        
        Conexion.close(stmt);
        Conexion.close(conn);
        
        return registros;
    }
}
