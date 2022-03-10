package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class _ConnectionDatabase {
    public static Connection openConnection() throws Exception {
        String hostname = "localhost";
        String portNumber = "1433";
        String username = "sa";
        String password = "12345";
        String dbName = "Lab5_QlySinhVien";

        // tên driver của database sử dụng
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = String.format("jdbc:sqlserver://%s:%s;databaseName=%s;encrypt=true;trustServerCertificate=true;",
                hostname, portNumber, dbName);
        return DriverManager.getConnection(connectionURL, username, password);
    }
}
