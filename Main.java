/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.user;

/**
 *
 * @author Tedii
 */
public class Main {
    public static void main(String[] args){
     User petani = new User();
                 
      petani.setUsername("Tedii");
      petani.setPassword("rawr12");
      
      System.out.println("username :" +petani.getUsername());
      System.out.println("password :" +petani.getPassword());
}
}
