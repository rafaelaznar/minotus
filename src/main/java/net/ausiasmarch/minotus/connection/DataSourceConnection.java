package net.ausiasmarch.minotus.connection;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DataSourceConnection implements GenericConnectionType {

    @Override
    public Connection crearConexion(String host, String port, String dbname, String username, String pass) throws SQLException, ClassNotFoundException {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setServerName(host);
        dataSource.setPortNumber(Integer.parseInt(port));
        dataSource.setDatabaseName(dbname);
        dataSource.setUser(username);
        dataSource.setPassword(pass);
        return dataSource.getConnection();
    }

}
