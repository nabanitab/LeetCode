package creationalDesignPattern.singleton.synchronizedSingleton;
//It is very expensive,that is why double locking came
public class DBConnection {
    private static DBConnection dbConnection;

    private DBConnection() {
    }

    synchronized public static DBConnection getDbConnection() {

        if(dbConnection==null){
            return new DBConnection();
        }
        return dbConnection;
    }
}
