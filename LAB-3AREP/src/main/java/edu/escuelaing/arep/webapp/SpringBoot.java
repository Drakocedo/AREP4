/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.webapp;


import edu.escuelaing.arep.webapp.betterspring.annotations.Web;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david.caycedo
 */
public class SpringBoot {
    static public void main(String[] args){
        String className="edu.escuelaing.arep.webapp.bettespring.WebServiceHello";
        
        try {
            Class c = Class.forName(className);
            System.out.println(c.getName());
            Method[] methods = c.getDeclaredMethods();
            for (Method m: methods){
                if (m.isAnnotationPresent(Web.class)){
                        System.out.println("En metodo"+m.getName());
                        System.out.println("En clase"+c.getName());
                    try {
                        System.out.println(m.invoke(null));
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(SpringBoot.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalArgumentException ex) {
                        Logger.getLogger(SpringBoot.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InvocationTargetException ex) {
                        Logger.getLogger(SpringBoot.class.getName()).log(Level.SEVERE, null, ex);
                    }
                                
                    }
                }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SpringBoot.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
          
    }
}
