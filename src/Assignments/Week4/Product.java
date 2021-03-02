package Assignments.Week4;
import java.sql.*;
public class Product {
    private Connection con = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    public Product(Connection obj) {
        con = obj;
        try {
            String create=
                    "CREATE TABLE product(" +
                            "id SERIAL PRIMARY KEY," +
                            "product_name VARCHAR(200)," +
                            "price INT" +
                            ")";
            stmt=con.createStatement();
            stmt.executeUpdate(create);
//            System.out.println("Table product created");
        }catch(Exception e) {
            System.out.println(e);
        }
    }
    public void setData(String product_name,int price){
        String set="INSERT INTO product(product_name,price) VALUES ('"+product_name+"','"+price+"')";
        try{
            stmt.executeUpdate(set);
//            System.out.println("Data inserted");
        }catch(Exception e) {
            System.out.println(e);
        }
    }
    public void getData(){
        try{
            String querySelect= "SELECT * FROM product";
            rs=stmt.executeQuery(querySelect);
            while(rs.next()){
                System.out.println(rs.getInt(1)+". "+rs.getString(2)+"\nprice: "+rs.getString(3));
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void deleteData(){
        String del="DELETE * FROM product";
        try{
            stmt.executeUpdate(del);
//            System.out.println("Data deleted");
        }catch(Exception e) {
            System.out.println(e);
        }
    }
    public void deleteTable(){
        String del="DROP TABLE product";
        try{
            stmt.executeUpdate(del);
//            System.out.println("Table product deleted");
        }catch(Exception e) {
            System.out.println(e);
        }
    }
    public void closeConnection(){
        try{
            con.close();
            stmt.close();
            rs.close();
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

