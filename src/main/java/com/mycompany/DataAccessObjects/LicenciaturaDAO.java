package com.mycompany.DataAccessObjects;

import com.mycompany.Clases.Licenciatura;
import com.mycompany.Conexion.Conexion;
import java.sql.*;
import java.util.*;

/**
 *
 * @author aspxe
 */
public class LicenciaturaDAO {
    
    private static final String SQL_SELECT = "SELECT idLicenciaturas, clave, REVOE, nombre FROM Licenciaturas";
    private static final String SQL_INSERT = "INSERT INTO Licenciaturas(clave, REVOE, nombre) VALUES(?,?,?)";
    private static final String SQL_UPDATE = "UPDATE Licenciaturas SET clave = ?, REVOE = ?, nombre = ? WHERE idLicenciaturas = ?";
    private static final String SQL_DELETE = "DELETE FROM Licenciaturas WHERE idLicenciaturas = ?";
    
    //Regresa una lista generica de tipo licenciatura
    public List<Licenciatura> seleccionar() throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Licenciatura licenciatura = null;
        List<Licenciatura> licenciaturas = new ArrayList<>();
        
        conn = Conexion.getConnection();
        stmt = conn.prepareStatement(this.SQL_SELECT);
        rs = stmt.executeQuery();
        
        //Mientras haya registros en la tabla
        while(rs.next()){
            
            String clave = rs.getString("clave");
            String revoe = rs.getString("REVOE");
            String nombre = rs.getString("nombre");
            int idLicenciaturas = rs.getInt("idLicenciaturas");
            licenciatura = new Licenciatura(clave, revoe, nombre, idLicenciaturas);
            licenciaturas.add(licenciatura);
            
        }
        
        Conexion.close(rs);
        Conexion.close(stmt);
        Conexion.close(conn);
        
        return licenciaturas;
    }
    
    //Inserta un registro en la tabla Licenciaturas, perteneicente a la base de datos Visual2022B
    public int insertar(Licenciatura l) throws SQLException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        conn = Conexion.getConnection();
        stmt = conn.prepareStatement(this.SQL_INSERT);
        stmt.setString(1, l.getClave());
        stmt.setString(2, l.getREVOE());
        stmt.setString(3, l.getNombre());
        registros = stmt.executeUpdate();
        
        Conexion.close(stmt);
        Conexion.close(conn);
        
        return registros;
    }
    
    //Actualizar un registros en la tabla Licenciaturas, perteneciente a la base de datos Visual2022B
    public int actualizar(Licenciatura l) throws SQLException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        conn = Conexion.getConnection();
        stmt = conn.prepareStatement(this.SQL_UPDATE);
        stmt.setString(1, l.getClave());
        stmt.setString(2, l.getREVOE());
        stmt.setString(3, l.getNombre());
        stmt.setInt(4, l.getIdLicenciaturas());
        registros = stmt.executeUpdate();
        
        Conexion.close(stmt);
        Conexion.close(conn);
        
        return registros;
    }
    
    //Eliminar un registro de la tabla Licenciaturas, perteneciente a la base de datos Visual2022B
    public int eliminar(Licenciatura l) throws SQLException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        conn = Conexion.getConnection();
        stmt = conn.prepareStatement(this.SQL_DELETE);
        stmt.setInt(1, l.getIdLicenciaturas());
        registros = stmt.executeUpdate();
        
        Conexion.close(stmt);
        Conexion.close(conn);
        
        return registros;
    }
}
