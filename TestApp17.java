package com.vtech.coreApps;

import java.util.Scanner;

interface DBConnection{
    public abstract void connect();
}

class OracleDBConnection implements DBConnection {

    public void connect(){
        System.out.println("connected to oracle database...!");
    }
}

class MySqlDBConnection implements DBConnection{
    public void connect(){
        System.out.println("connected to mysql database.....!");
    }
}

public class TestApp17 {

    public static void main(String[] args) {

        DBConnection ob = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Which database you want to communicate :");
        String ch = sc.next();

        if(ch.equals("oracle"))
            ob = new OracleDBConnection();
        else
            ob = new MySqlDBConnection();

        ob.connect();
    }
}
