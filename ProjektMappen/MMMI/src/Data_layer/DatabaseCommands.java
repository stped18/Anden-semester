/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_layer;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.*;
import java.util.List;

/**
 *
 * @author steff dette er kun en ide til hvordan man henter og sender data
 *
 */
public class DatabaseCommands {

    String url = "jdbc:postgresql://mmmihosting.ddns.net:3306/mmmidb";
    String username = "pi";
    String password = "morten1234";

    Connection dbConnection = null;
    Statement dbStatement = null;
    ResultSet dbResultSet = null;
    
    

    private void connectToDB() {
        try {

            Class.forName("org.postgresql.Driver");
            dbConnection = DriverManager.getConnection(url, username, password);

            System.out.println("Connectet to MMMI Database");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {

        }
    }

    private void disConnectet() {
        try {
            if (dbStatement != null) {
                dbStatement.close();
            }
            if (dbResultSet != null) {
                dbResultSet.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Disconnectet From MMMI Database");
    }

    public void addData(String statement) {
        connectToDB();
        try {
            dbStatement = dbConnection.createStatement();
            dbStatement.execute(statement);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println(statement + " was executet");
        disConnectet();
    }

    public List<ResultSet> getdataList(String resultString) {
        List<ResultSet> list = new VirtualFlow.ArrayLinkedList<>();
        connectToDB();
        try {
            dbResultSet = dbStatement.executeQuery(resultString);
            while (dbResultSet.next()) {
                list.add(dbResultSet);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("List of data was executet");
        disConnectet();
        return list;
    }
    public void testConnection(){
        System.out.println("Testing connection to database");
        connectToDB();
        disConnectet();
    }

}
