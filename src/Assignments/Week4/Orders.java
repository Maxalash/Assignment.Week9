package Assignments.Week4;
import java.sql.*;
public class Orders {
    private Connection con = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    public Orders(Connection obj) {
        con = obj;
        String create=
                "CREATE TABLE orders(" +
                        "id SERIAL PRIMARY KEY," +
                        "customer_name VARCHAR(200)," +
                        "customer_phone VARCHAR(200)" +
                        ")";
        String creatte="CREATE TABLE order_details(" +
                "order_id INT REFERENCES Orders(id)," +
                "product_id INT REFERENCES product(id)" +
                ")";
        try {
            stmt=con.createStatement();
            stmt.executeUpdate(create);
//            System.out.println("Table order created");
            stmt=con.createStatement();
            stmt.executeUpdate(creatte);
//            System.out.println("Table order detail created");
        }catch(Exception e) {
            System.out.println(e);
        }
    }
    public void setData(String customer_name,String customer_phone) {
        String set = "INSERT INTO orders(customer_name,customer_phone) VALUES ('" + customer_name + "','" + customer_phone + "')";
        try {stmt=con.createStatement();
            stmt.executeUpdate(set);
//            System.out.println("Data inserted");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void getData(){
        String querySelect= "SELECT * FROM orders";
        try{stmt=con.createStatement();
            rs=stmt.executeQuery(querySelect);
            while(rs.next()){
                System.out.println(rs.getInt(1)+". "+rs.getString(2)+": "+rs.getString(3));
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void purchase(int oid,int pid){
        String del="INSERT INTO order_details(order_id,product_id) VALUES ("+oid+","+pid+")";
        try{stmt=con.createStatement();
            stmt.executeUpdate(del);
            System.out.println("purchase was successful!");
        }catch(Exception e) {
            System.out.println(e);
        }
    }
    public void getOrderlist(String name,String phone){
        String querySelect= "SELECT product.product_name,product.price FROM orders" +
                "                INNER JOIN order_details ON Orders.id=order_details.order_id" +
                "                INNER JOIN product ON order_details.product_id=product.id " +
                "WHERE orders.customer_name = '"+name+"' AND orders.customer_phone = '"+phone+"'";
        try{stmt=con.createStatement();
            rs=stmt.executeQuery(querySelect);
            while(rs.next()){
                System.out.println("Your order:\n"+rs.getString(1)+": "+rs.getString(2));
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void getTotal(String name,String phone){
        String querySelect= "SELECT SUM(product.price) AS total_price FROM orders" +
                "                                INNER JOIN order_details ON Orders.id=order_details.order_id" +
                "                                INNER JOIN product ON order_details.product_id=product.id  WHERE " +
                "orders.customer_name = '"+name+"' AND orders.customer_phone = '"+phone+"'";
        try{stmt=con.createStatement();
            rs=stmt.executeQuery(querySelect);
            while(rs.next()){
                System.out.println("Total: "+rs.getInt(1));
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void deleteData(){
        String del="DELETE FROM orders";
        try{stmt=con.createStatement();
            stmt.executeUpdate(del);
//            System.out.println("Data deleted");
        }catch(Exception e) {
            System.out.println(e);
        }
    }
    public void deleteTable1(){
        String del="DROP TABLE orders";
        try{
            stmt=con.createStatement();
            stmt.executeUpdate(del);
//            System.out.println("Table order deleted");
        }catch(Exception e) {
            System.out.println(e);
        }
    }
    public void deleteTable(){
        String dell="DROP TABLE order_details";
        try{
            stmt=con.createStatement();
            stmt.executeUpdate(dell);
//            System.out.println("Table ord detail deleted");
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
