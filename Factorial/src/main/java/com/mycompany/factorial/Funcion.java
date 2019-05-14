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
public class Funcion {
    
    
    public void Funcion(){
    
}
    
    
    public Object factorial(double num){
        
        
        Object resp;
        double res=1;
        long res2=999999999;
        if(num<0){
            resp="Esta función solo acepta números positivos o cero!!!";
        }
        else{
            if(num<11 && num>0){
                for(int i=1;i<num;i++){
                res = res * i;
            }
             resp=res;
            }
            else{
                resp=res2;   
                
            }
        }
        
        
        
        return resp;
    }
    
    public Object factorial(ArrayList valores){
        
        ArrayList calculos = new ArrayList<>();
        double resp=1;
        
        Object res=null;
        for(int i=0;i<valores.size();i++){
            double num= Double.parseDouble(valores.get(i).toString());
               res = factorial(num);
               if(res instanceof String){
                   
                    return res;
               }
               else{
                   if(res instanceof Long){
                       return res;
                    }
                    else{
                       calculos.add(i, resp);
                    }
               }
               
        }
        
        res = calculos;
        return res;
    }
    
    
}
