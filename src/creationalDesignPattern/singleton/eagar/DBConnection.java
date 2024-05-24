package creationalDesignPattern.singleton.eagar;

public class DBConnection {
    private static DBConnection dbConnection = new DBConnection();

    //private constructor for stoping from initialization
    private DBConnection() {
    }

    public static DBConnection getDbConnection() {
        return dbConnection;
    }
}
