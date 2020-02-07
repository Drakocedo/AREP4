/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.webapp.bettespring;

import edu.escuelaing.arep.webapp.betterspring.annotations.Web;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * @author david.caycedo
 */

public class WebServiceHello {
     @Web
     public static String hello(){
         
     return 
        " <!doctype html>"

        +"<!doctype html>"
        +"<html lang=en>"
        +"<head>"
        +"<meta charset=utf-8>"
        +"<title>blah</title>"
        +"</head>"
        +"<body>"
        +"<p>I'm the content</p>"
        +"</body>"
        +"</html>";        
     }
    
}
