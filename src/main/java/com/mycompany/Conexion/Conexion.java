package com.mycompany.Conexion;

import java.sql.*;

/**
 *
 * @author aspxe
 */

/*
ESTE CODIGO ES REUTILIZABLE EN DIFERENTES PROYECTOS
*/
public class Conexion {                                           //IMPORTANTE: Poner el nombre de la base de datos
    private static final String JDBC_URL = "jdbc:mysql://localhost:8080/Visual2022B?useSSL=false&useTimeZone=true&serverTimeZone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "ElPatron";
    private static final String JDBC_PASSWORD = "weed420hood:v";
    
    //Obtenemos conexion hacia la base de datos
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }
    
    //Sobre-escribimos el metodo para cerrar los diferentes objetos de conexion
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    public static void close(Statement stmt) throws SQLException{
        stmt.close();
    }
    
    public static void close(PreparedStatement stmt) throws SQLException{
        stmt.close();
    }
    
    public static void close(Connection conc) throws SQLException{
        conc.close();
    }
    
}
