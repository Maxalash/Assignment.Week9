package Assignments.Week9;

import Assignments.Week4.ConnectDB;

import java.sql.*;

public class Singleton {
    private static Singleton instance=null;
    private String stae;
    Connection con;
    Statement stmt;
    ResultSet rs;
    private  Singleton(){
        ConnectDB obj=new ConnectDB();
        con=obj.get_connection();
        String create=
                "CREATE TABLE product(" +
                        "id SERIAL PRIMARY KEY," +
                        "product_name VARCHAR(200)," +
                        "price INT" +
                        ")";
        String set="INSERT INTO product(product_name,price) VALUES ('laptop','900'),('tv','12999900')";
        try {
            stmt=con.createStatement();
            stmt.executeUpdate(create);
            stmt=con.createStatement();
            stmt.executeUpdate(set);
        }catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("Table created");
    }
    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();

            return instance;
    }
        // Finally, any singleton should define some business logic
        // which can be executed on its instance.
        public void query(String state){
            if(instance.stae==null)
                stae=state;
            try{
                instance.rs=stmt.executeQuery(instance.stae);
                while(rs.next()){
                    System.out.println(rs.getInt(1)+". "+rs.getString(2)+"\nprice: "+rs.getString(3));
                }
            }catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    public void deleteTable(){
        String del="DROP TABLE product";
        try{
            stmt.executeUpdate(del);
//            System.out.println("Table product deleted");
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println("tabledeleted");
    }
        // For instance, all Singleton queries of an app go
        // through this method. Therefore, you can place
        // throttling or caching logic here.
        // ...
}
class Application {
    public static void main(String[] args) {
        Singleton foo = Singleton.getInstance();
        foo.query("SELECT id,product_name,price FROM product WHERE id=2");
        Singleton bar = Singleton.getInstance();
        bar.query("SELECT id,product_name,price FROM product WHERE id=1");
        foo.deleteTable();
    }
}