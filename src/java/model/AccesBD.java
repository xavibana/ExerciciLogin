/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Xavibana
 */
public class AccesBD {
    private Connection con;
    private Statement sentencia;
    
    
    public AccesBD()throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_proves", "root", "");
        sentencia=con.createStatement();
    }
    
    
    public void comprovarLogin(Usuario u)throws Exception{
        String nick=u.getNick();
        String contrasenya=u.getContrasenya();
        int n=sentencia.executeUpdate("SELECT nick FROM login WHERE nick='"+nick+"' && contrasenya='"+contrasenya+"'  ");
        System.out.println(n);
    }

    
    public void inserirUsuari(Usuario u) throws Exception {
        String nick = u.getNick();
        String contrasenya = u.getContrasenya();
        //a MySQL es guarda un INT 0=false, 1=true
        //ordre a la taula de mysql: numero nom preu necessari
        sentencia.executeUpdate("insert into login values('" + nick + "','" +contrasenya+"')");
    }
}
