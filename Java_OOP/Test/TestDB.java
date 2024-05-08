package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDB {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/rentalmanagement";
        String user = "root";
        String password = "";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Đã kết nối đến cơ sở dữ liệu: " + conn.getCatalog());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
