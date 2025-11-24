package Dependency_Inversion_DIP;

class MySqlDB{
    public void saveToSQL(String data){
        System.out.println("Saved in sql :" + data);
    }
}
class MongoDB{
    public void saveToMongo(String data){
        System.out.println("Saved in Mongo DB :" + data);
    }
}

class UserSrvice{
    private final MySqlDB mySqlDB = new MySqlDB();
    private final MongoDB mongoDB = new MongoDB();

    public void storeUserTOSQL(String user){
        mySqlDB.saveToSQL(user);
    }
    public void storeUserTOMongoDB(String user){
        mongoDB.saveToMongo(user);
    }
}

public class DIP_Voilated {
    public static void main(String[] args) {
        UserSrvice service = new UserSrvice();
        service.storeUserTOMongoDB("ABC");
        service.storeUserTOSQL("XYZ");
    }
}
