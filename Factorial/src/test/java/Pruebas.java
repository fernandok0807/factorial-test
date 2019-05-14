/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.factorial.Funcion;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class Pruebas {
    
    
    @Test
    public void prueba1(){
        
        System.out.println("Numeros Negativos");
        
        Object valor = "Esta función solo acepta números positivos o cero!!!";
        double numero=-1;
        Funcion nueva = new Funcion();
        Object respue= nueva.factorial(numero);
        assertTrue("Cadenas", respue instanceof String);
        assertEquals(valor, respue);
        
        
    }
    
    
       @Test
    public void prueba2(){
        
        System.out.println("Numeros Mayores a 100");
        
        long valor = 999999999;
        double numero=102;
        Funcion nueva = new Funcion();
        Object respue= nueva.factorial(numero);
        assertTrue("Cadenas", respue instanceof Long);
        assertEquals(valor, respue);
        
    }
    
    
    @Test
    public void prueba3(){
        
        System.out.println("Numeros Menores a 10");
        double valor=24.0;
        double numero=5;
        Funcion nueva = new Funcion();
        Object respue= nueva.factorial(numero);
        assertTrue(respue instanceof Double);
        assertEquals(respue,valor);
        
    }
    
    
     @Test
    public void prueba4(){
        
        System.out.println("Numeros Negativos con Array");
        
        Object valor = "Esta función solo acepta números positivos o cero!!!";
         ArrayList dat = new ArrayList<>();
         Funcion abrir = new Funcion();
        dat.add(2);
        dat.add(-5);
        Object dat2 = new ArrayList<>();
        dat2=  abrir.factorial(dat);
        assertTrue("Cadenas", dat2 instanceof String);
        assertEquals(valor, dat2);
        
        
    }
    
     @Test
    public void prueba5(){
        
        System.out.println("Numeros Mayores a 100 con Array" );
        
        long valor = 999999999;
         ArrayList dat = new ArrayList<>();
         Funcion abrir = new Funcion();
        dat.add(2);
        dat.add(102);
        Object dat2 = new ArrayList<>();
        dat2=  abrir.factorial(dat);
        assertTrue("Cadenas", dat2 instanceof Long);
        assertEquals(valor, dat2);
        
        
    }
    
     @Test
    public void prueba6(){
        
        System.out.println("Numeros Menores a 10 con Array" );
        
        
        ArrayList dat = new ArrayList<>();
        Funcion abrir = new Funcion();
        dat.add(4);
        dat.add(2);
        Object dat2 = new ArrayList<>();
        dat2=  abrir.factorial(dat);
        assertTrue("Arreglo", dat2 instanceof ArrayList);
        
        
        
    }
    
    
}
