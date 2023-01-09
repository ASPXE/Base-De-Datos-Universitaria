package com.mycompany.DataAccessObjects;

import com.mycompany.Clases.Materia;
import com.mycompany.Conexion.Conexion;
import java.sql.*;
import java.util.*;

/**
 *
 * @author aspxe
 */
public class MateriaDAO {
    
    private static final String SQL_SELECT = "SELECT idMaterias, fk_licenciaturaId, Clave, Nomnbre FROM Materias";
    private static final String SQL_INSERT = "INSERT INTO Materias(fk_licenciaturaId = ?, Clave = ?, Nomnbre = ?) VALUES(?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE Materias SET fk_licenciaturaId = ?, Clave = ?, Nomnbre = ? WHERE idMaterias = ?";
    private static final String SQL_DELETE = "DELETE FROM Materias WHERE idMaterias = ?";
    
    //Regresa una lista generica del tipo Materia
    public List<Materia> seleccionar() throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Materia materia = null;
        List<Materia> materias = new ArrayList<>();
        
        conn = Conexion.getConnection();
        stmt = conn.prepareStatement(this.SQL_SELECT);
        rs = stmt.executeQuery();
        
        //Mientras hayan registros
        while(rs.next()){
            int idMaterias = rs.getInt("idMaterias");
            int fk_licenciaturaId = rs.getInt("fk_licenciaturaId");
            String clave = rs.getString("Clave");
            String nombre = rs.getString("Nomnbre");
            
            materia = new Materia(fk_licenciaturaId, idMaterias, clave, nombre);
            materias.add(materia);
        }
        //Cerramos en el orden inverso que abrimos las conexiones
        Conexion.close(rs);
        Conexion.close(stmt);
        Conexion.close(conn);
        
        return materias;
    }
    
    //Inserta un registro en la tabla Materias de la base de datos Visual2022B
    public int insertar(Materia m) throws SQLException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        conn = Conexion.getConnection();
        stmt = conn.prepareCall(this.SQL_INSERT);
        stmt.setInt(1, m.getFk_licenciaturaId());
        stmt.setString(2, m.getClave());
        stmt.setString(3, m.getNombre());
        registros = stmt.executeUpdate();
        
        Conexion.close(stmt);
        Conexion.close(conn);
        
        return registros;
        
    }
    //Actualiza un registro en la tabla Materias de la base de datos Visual2022B
    public int actualizar(Materia m) throws SQLException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        conn = Conexion.getConnection();
        stmt = conn.prepareStatement(this.SQL_UPDATE);
        stmt.setInt(1, m.getFk_licenciaturaId());
        stmt.setString(2, m.getClave());
        stmt.setString(3, m.getNombre());
        stmt.setInt(4, m.getIdMaterias());
        registros = stmt.executeUpdate();
        
        Conexion.close(stmt);
        Conexion.close(conn);
        
        return registros;
        
    }
    //Elimina un registro de la tabla Materias de la base de datos Visual2022B
    public int eliminar(Materia m) throws SQLException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        conn = Conexion.getConnection();
        stmt = conn.prepareStatement(this.SQL_DELETE);
        stmt.setInt(1, m.getIdMaterias());
        registros = stmt.executeUpdate();
        
        Conexion.close(stmt);
        Conexion.close(conn);
        
        return registros;
    }
    
}
