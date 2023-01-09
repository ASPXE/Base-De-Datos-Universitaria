package com.mycompany.DataAccessObjects;

import com.mycompany.Clases.Docente;
import com.mycompany.Conexion.Conexion;
import java.sql.Date;
import java.util.*;
//Por alguna razon este import no quita el error de la linea 40, por lo que tuve que 
//hacer el import java.sql.Date y el java.sql.*
import java.sql.*;
/**
 *
 * @author aspxe
 */
public class DocenteDAO {
    
    private static final String SQL_SELECT = "SELECT idDocentes, Nombre, ApellidoP, ApellidoM, DoB FROM Docentes";
    private static final String SQL_INSERT = "INSERT INTO Docentes(Nombre, ApellidoP, ApellidoM, DoB) VALUES(?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE Docentes SET Nombre = ?, ApellidoP = ?, ApellidoM = ?, DoB = ? WHERE idDocentes = ?";
    private static final String SQL_DELETE = "DELETE FROM Docentes WHERE idDocentes = ?";
    
    //Regresa una lista generica de tipo docente
    public List<Docente> seleccionar() throws SQLException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Docente docente = null;
        List<Docente> docentes = new ArrayList<>();
        
        conn = Conexion.getConnection();
        stmt = conn.prepareStatement(this.SQL_SELECT);
        rs = stmt.executeQuery();
        
        //Mientras haya registros en la tabla
        while(rs.next()){
            
            int idDocentes = rs.getInt("idDocentes");
            String nombre = rs.getString("Nombre");
            String apellidoP = rs.getString("ApellidoP");
            String apellidoM = rs.getString("ApellidoM");
            Date DoB = rs.getDate("DoB");
            
            docente = new Docente(nombre, apellidoP, apellidoM, DoB, idDocentes);
            docentes.add(docente);
        }
        //Cerramos en el orden inverso en el que abrimos las conexiones
        Conexion.close(rs);
        Conexion.close(stmt);
        Conexion.close(conn);
        
        return docentes;
        
    }
    
    //Inserta un registro en la tabla de Docentes, perteneciente a la base de datos Visual2022B
    public int insertar(Docente d) throws SQLException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        conn = Conexion.getConnection();
        stmt = conn.prepareStatement(this.SQL_INSERT);
        stmt.setString(1, d.getNombre());
        stmt.setString(2, d.getApellidoP());
        stmt.setString(3, d.getApellidoM());
        stmt.setDate(4, (Date) d.getDoB());
        registros = stmt.executeUpdate();
        Conexion.close(stmt);
        Conexion.close(conn);
        
        return registros;
    }
    
    //Actualiza un registro en la tabla de Docentes, perteneciente a la base de datos Visual2022B
    public int actualizar(Docente d) throws SQLException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        conn = Conexion.getConnection();
        stmt = conn.prepareStatement(this.SQL_UPDATE);
        stmt.setString(1, d.getNombre());
        stmt.setString(2, d.getApellidoP());
        stmt.setString(3, d.getApellidoM());
        stmt.setDate(4, (Date) d.getDoB());
        stmt.setInt(5, d.getIdDocentes());
        registros = stmt.executeUpdate();
        
        Conexion.close(stmt);
        Conexion.close(conn);
        
        return registros;
    }
    
    //Eliminar un registro de la tabla de Docentes, perteneciente a la base de datos Visual2022B
    public int eliminar(Docente d) throws SQLException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        conn = Conexion.getConnection();
        stmt = conn.prepareStatement(this.SQL_DELETE);
        stmt.setInt(1, d.getIdDocentes());
        registros = stmt.executeUpdate();
        
        Conexion.close(stmt);
        Conexion.close(conn);
        
        return registros;
    }
    
    
    
}
