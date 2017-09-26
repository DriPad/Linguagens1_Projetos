/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.adriana.bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aluno 17
 */
public class ConnectionFactory {

    public static Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/escola", "root", "");
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
