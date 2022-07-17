package PizzaManage.DAO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLDataException;
import java.util.*;

public class MyConnect {
    public static Connection conn = null;
    private String serverName;
    private String dbName;
    private String userName;
    private String password;
    
    public MyConnect(){
        readFileText();
        
        String strConnect = "jbdc:mysql://" + serverName + "/" + dbName + "?useUnicode=true&characterEncoding=utf-8";
        Properties pro = new Properties();
        pro.put("user", userName);
        pro.put("password", password);
        try{
            com.mysql.jdbc.Driver driver = new Driver();
            
        }catch(SQLException ex){
            new MyDialo
        }
    }
    private void readFileText(){
        serverName = "";
        dbName = "";
        userName = "";
        password = "";
        try{
            FileInputStream fis = new FileInputStream("ConnectVariable.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            serverName = br.readLine();
            dbName = br.readLine();
            userName = br.readLine();
            if(password == null){
                password = "";
            }
        }catch(Exception e){
        
        }
    }
}
