package persistence;

import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class Pool {

    private static Pool instancia;
    private DataSource dataSource;

    private Pool() {
        inicializaDataSource();
    }

    public static synchronized Pool getInstance() {
        if (instancia == null) {
            instancia = new Pool();
        }
        return instancia;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    private void inicializaDataSource() {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver"); // ✅ nuevo driver
        basicDataSource.setUsername("Betsy");
        basicDataSource.setPassword("TiendaBetsyyVanessa25*");
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/bdtienda?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC");
        basicDataSource.setMaxTotal(50); // ✅ reemplaza setMaxActive
        basicDataSource.setMinIdle(5);   // opcional: mantiene conexiones activas mínimas
        basicDataSource.setMaxIdle(10);  // opcional: máximo de conexiones inactivas
        basicDataSource.setMaxWaitMillis(10000); // espera máxima antes de lanzar error
        this.dataSource = basicDataSource;
    }
}
