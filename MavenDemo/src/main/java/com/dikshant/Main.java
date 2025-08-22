package com.dikshant;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        int id = 69;
        String name = "Max";
        int marks = 74;

        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "admin";
        String pass = "";
        String query = "insert into student values (?,?,?)";


        Connection con = DriverManager.getConnection(url, user, pass);

        PreparedStatement pST = con.prepareStatement(query);
        pST.setInt(1,id);
        pST.setString(2,name);
        pST.setInt(3,marks);

        pST.execute();

        con.close();

    }
}



