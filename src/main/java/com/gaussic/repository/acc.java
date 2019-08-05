package com.gaussic.repository;


        import java.sql.*;

/**
 * Created by sakura on 16/6/21.
 */
public class acc {
    public static void main(String[] args){
        Connection con = null;
        Statement sta = null;
        ResultSet res = null;
        String sql = null;
        String url = new String("jdbc:mysql://localhost:3306/springdemo?characterEncoding=utf8&useSSL=false");
        try{
            System.out.println("*");
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,"root","root");
            sta = con.createStatement();
            sql = new String("select * from user");
            res = sta.executeQuery(sql);
            System.out.println("name     sex     age");
            while(res.next()){
                System.out.print(res.getString("id"));
                System.out.print("     ");
                System.out.print(res.getString("password"));
                System.out.print("     ");
//                System.out.print(res.getString("age") + "\n");
            }
        }catch (ClassNotFoundException e){
            System.out.println("ClassNotFoundException");

        }catch (SQLException a){
            System.out.println("SQLException");
        }
        catch (Exception b){

        }
        finally {
            try{
                if(con != null)
                    con.close();
                if (sta != null)
                    sta.close();
                if(res != null)
                    res.close();
            }catch (Exception e){

            }
        }
    }
}
