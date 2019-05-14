/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.factorial;

import java.util.ArrayList;

/**
 *
 * @author enmanuel
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Funcion abrir = new Funcion();
        
        //System.out.println(abrir.factorial(11));
        
       // System.out.println(abrir.factorial(-5));
        
       // System.out.println(abrir.factorial(101));
        
        ArrayList dat = new ArrayList<>();
        dat.add(2);
        dat.add(-5);
        Object dat2 = new ArrayList<>();
        dat2=  abrir.factorial(dat);
        
        System.out.println(dat2);
        
        
        
    }
    
}
