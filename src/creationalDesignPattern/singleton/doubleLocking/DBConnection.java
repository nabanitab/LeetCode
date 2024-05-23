package creationalDesignPattern.singleton.doubleLocking;

public class DBConnection {
    private static DBConnection dbConnection;

    private DBConnection() {
    }

     public static DBConnection getDbConnection() {

        if(dbConnection==null) {

            //here t1 ,and t2 two thread will be check at a time that object instance is null or not
            synchronized (DBConnection.class) {
                if (dbConnection == null) {
                    dbConnection = new DBConnection();
                }
            }
        }
        return dbConnection;
    }
}
