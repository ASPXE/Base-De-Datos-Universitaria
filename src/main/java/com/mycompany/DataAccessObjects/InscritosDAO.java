package com.mycompany.DataAccessObjects;

import com.mycompany.Clases.Inscritos;
import com.mycompany.Conexion.Conexion;
import java.sql.*;
import java.util.*;

/**
 *
 * @author aspxe
 */
public class InscritosDAO {
    
    private static final String SQL_SELECT = "SELECT ins, fk_alumno, fk_docente, fk_materia, ciclo FROM Inscritos";
    private static final String SQL_INSERT = "INSERT INTO Inscritos(fk_alumno, fk_docente, fk_materia, ciclo) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE Inscritos SET fk_alumno = ?, fk_docente = ?, fk_materia = ?, ciclo = ? WHERE ins = ?";
    private static final String SQL_DELETE = "DELETE FROM Inscritos WHERE ins = ?";
    
    //Regresa una lista generica del tipo inscritos
    public List<Inscritos> seleccionar() throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Inscritos inscrito = null;
        List<Inscritos> inscritos = new ArrayList<>();
        
        conn = Conexion.getConnection();
        stmt = conn.prepareStatement(this.SQL_SELECT);
        rs = stmt.executeQuery();
        
        //Mientras hayan registros
        while(rs.next()){
            int ins = rs.getInt("ins");
            int fk_alumno = rs.getInt("fk_alumno");
            int fk_docente = rs.getInt("fk_docente");
            int fk_materia = rs.getInt("fk_materia");
            String ciclo = rs.getString("ciclo");
            
            inscrito = new Inscritos(ins, fk_alumno, fk_docente, fk_materia, ciclo);
            inscritos.add(inscrito);
        }
        //Cerramos conexiones en el orden inverso al que las abrimos
        Conexion.close(rs);
        Conexion.close(stmt);
        Conexion.close(conn);
        
        return inscritos;
    }
    
    //Inserta un registro en la tabla de Inscritos de la base de datos Visual2022B
    public int insertar(Inscritos i) throws SQLException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        conn = Conexion.getConnection();
        stmt = conn.prepareStatement(this.SQL_INSERT);
        stmt.setInt(1, i.getFk_alumno());
        stmt.setInt(2, i.getFk_docente());
        stmt.setInt(3, i.getFk_materia());
        stmt.setString(4, i.getCiclo());
        registros = stmt.executeUpdate();
        
        Conexion.close(stmt);
        Conexion.close(conn);
        
        return registros;    
    }
    //Actualiza un registro en la tabla de Inscritos de la base de datos Visual2022B
    public int actualizar(Inscritos i) throws SQLException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        conn = Conexion.getConnection();
        stmt = conn.prepareStatement(this.SQL_UPDATE);
        stmt.setInt(1, i.getFk_alumno());
        stmt.setInt(2, i.getFk_docente());
        stmt.setInt(3, i.getFk_materia());
        stmt.setString(4, i.getCiclo());
        stmt.setInt(5, i.getIns());
        registros = stmt.executeUpdate();
        
        Conexion.close(stmt);
        Conexion.close(conn);
        
        return registros;
        
    }
    //Elimina un registro en la tabla de Inscritos de al base de datos Visual2022B
    public int eliminar(Inscritos i) throws SQLException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        conn = Conexion.getConnection();
        stmt = conn.prepareStatement(this.SQL_DELETE);
        stmt.setInt(1, i.getIns());
        registros = stmt.executeUpdate();
        
        Conexion.close(stmt);
        Conexion.close(conn);
        
        return registros;
    }
    
}
