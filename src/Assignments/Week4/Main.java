package Assignments.Week4;
import java.sql.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Connection con = null;
         Statement stmt = null;
         ResultSet rs = null;
         ConnectDB obj=new ConnectDB();
         con=obj.get_connection();
        Scanner in=new Scanner(System.in);
        Product product=new Product(con);
        product.setData("Laptop",259990);
        product.setData("iPhone",599990);
        product.setData("Computer",169990);
        product.setData("TV",1199990);
        Orders ord=new Orders(con);
//        ord.setData("max","2542345");
//        product.getData();
//        ord.getData();
//        ord.purchase(1,3);
//        ord.purchase(1,2);
//        ord.purchase(1,1);
//        ord.getOrderlist("max","2542345");
//        ord.getTotal("max","2542345");
        boolean option=true;
        boolean optioner;
        boolean check = true;
        String name;
        String phone;
        System.out.println("Welcome to our shop 'ModernTech'");
            while (option) {
                System.out.println("What you want to do?\n" +
                        "1 – Purchase products\n2 – See my orders\n3 – See my cheque\n4 - Exit" +
                        "\n Enter number of the service:");
                optioner=true;
                while (optioner) {
                    switch (in.nextInt()) {
                        case 1:
                            in.nextLine();
                            System.out.println("Please enter your name and phone number:");
                            name=in.nextLine();
                            if(name==""){
                                System.out.println("Please enter your name again:");
                                name=in.nextLine();
                            }
                            phone=in.nextLine();
                            if(phone==""){
                                System.out.println("Please enter your phone number again:");
                                phone=in.nextLine();
                            }

                            ord.setData(name,phone);
                            System.out.println("Products in our shop:");
                            product.getData();
                            while(check) {
                                System.out.println("Select products that you want to purchase and paste id of the products");
                                ord.purchase(1,in.nextInt());
                                in.nextLine();
                                System.out.println("Do you want to continue?\n If yes paste 'true' else 'false':");
                                check=in.nextBoolean();
                            }
                            System.out.println( "You have successfully placed an order!" );
                            optioner = false;
                            break;
                        case 2:
                            in.nextLine();
                            System.out.println("Please enter your name and phone number:");
                            name=in.nextLine();
                            if(name==""){
                                System.out.println("Please enter your name again:");
                                name=in.nextLine();
                            }
                            phone=in.nextLine();
                            if(phone==""){
                                System.out.println("Please enter your phone number again:");
                                phone=in.nextLine();
                            }
                            ord.getOrderlist(name,phone);
                            optioner = false;
                            break;
                        case 3:in.nextLine();
                            System.out.println("Please enter your name and phone number:");
                            name=in.nextLine();
                            if(name==""){
                                System.out.println("Please enter your name again:");
                                name=in.nextLine();
                            }
                            phone=in.nextLine();
                            if(phone==""){
                                System.out.println("Please enter your phone number again:");
                                phone=in.nextLine();
                            }
                            ord.getTotal(name,phone);
                            optioner = false;
                            break;
                        case 4:
                            optioner = false;
                            option = false;
                            break;
                        default:
                            System.out.println("Please enter one of this options!");
                    }
                }
            }
        ord.deleteTable();
        product.deleteTable();
        ord.deleteTable1();
        product.closeConnection();
        ord.closeConnection();
    }
}
