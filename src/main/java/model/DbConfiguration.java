package model;

import java.sql.*;

public class DbConfiguration {
    private static final String userName = "root";  // jeżeli coś jest finalne nie można tego zmienić podczas trwania
    // programu
    private static final String userPassword = "rd3290";
    private static final String url = "jdbc:mysql://localhost:3306/library";

    public static Connection connection = null;

    public static void dbConnection() {
        try {
            connection = DriverManager.getConnection(url, userName, userPassword);
            Statement statement = connection.createStatement();
        } catch (SQLException e) {
            System.out.println("Invalid database configuration");
            e.printStackTrace();
        }
    }


    public static void dbConnectionClose() throws Exception {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    public ResultSet dbExecuteQuery(String queryStatment) throws Exception {
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            dbConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(queryStatment);
        } catch (SQLException ex) {
            System.out.println("Error");
            throw ex;
//        } finally {
//            dbConnectionClose();
        }
        return resultSet;
    }

    public ResultSet dbExecuteUpdateQuery(String queryStatment) throws SQLException {
        Statement statement = null;
       // try {
            dbConnection();
            statement = connection.createStatement();
            statement.executeUpdate(queryStatment);  //executeUpdate metoda klasy (interface) Statmen, która
            // umożliwia wykonanie zapytania sql
            System.out.println("A new object has been added successfully");

//        } catch (SQLException e) {
//            System.out.println("Sql command error");  // błąd w poleceniu sql
//        }
        return null;
    }


}
