package com.udgs123.demo3gs;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHelper {
    String IP,IS, DB, DBUserName, DBPassword;
    @SuppressLint("NewApi")
    public Connection connections () {
        //From your Local or website
        DB = "App_Giasu";
        DBUserName = "sa";
        DBPassword = "123";

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        java.sql.Connection connection = null;
        String ConnectionURL = null;
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            ConnectionURL="jdbc:jtds:sqlserver://192.168.1.3"+ ";databaseName=" + DB + ";user=" + DBUserName + ";password=" + DBPassword + ";";
            connection = DriverManager.getConnection(ConnectionURL);
        } catch (SQLException se) {
            Log.e("Error From SQL", se.getMessage());
        }
        catch (ClassNotFoundException e) {
            Log.e("Error From Class", e.getMessage());
        }
        catch (Exception e) {
            Log.e("Error From Exception", e.getMessage());
        }
        return connection;
    }

}
