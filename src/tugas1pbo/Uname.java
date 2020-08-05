/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1pbo;

/**
 *
 * @author User
 */
public class Uname {
    String username;
    String password;
    
    public Uname (String username,String password) {
        this.username = username;
        this.password = password;
    }
    
    void username (){
        System.out.println("username required");
    }
    void password (){
        System.out.println("password required");
    }
    void tampilData (){
        System.out.println("username : " + this.username);
        System.out.println("password : " + this.password);
    }
    
}


