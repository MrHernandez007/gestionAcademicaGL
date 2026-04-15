package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Login login = new Login();

        System.out.println(login.login("admin@mail.com", "1234"));
        
    }
}

