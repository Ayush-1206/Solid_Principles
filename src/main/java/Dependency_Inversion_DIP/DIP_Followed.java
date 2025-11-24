package Dependency_Inversion_DIP;


import javax.xml.crypto.Data;

interface Database{
    void save(String data);
}

class MySQLDatabase implements Database {
    @Override
    public void save(String data){
        System.out.println("Saved in My sql db " + data);
    }
}
class MongoDBDatabase implements Database {
    @Override
    public void save(String data){
        System.out.println("Saved in My Mongo db " + data);
    }
}
class UserService{
    Database db;

    public UserService(Database db){
        this.db = db;
    }

    public void storeUser(String user){
        db.save(user);
    }
}
public class DIP_Followed {
    public static void main(String[] args) {
        MySQLDatabase mySQLdb = new MySQLDatabase();
        MongoDBDatabase mongo = new MongoDBDatabase();

        UserService userService1 = new UserService(mySQLdb);
        userService1.storeUser("ABC");

        UserService userService2 = new UserService(mongo);
        userService2.storeUser("XYZ");
    }
}
