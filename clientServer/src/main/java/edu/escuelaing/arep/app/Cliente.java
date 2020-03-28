/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Cliente extends Thread{
  private static URL url;
  private static int solicitudes;
  private static ArrayList<Thread> listThread;
  
  public Cliente(URL url){
      this.url=url;
  }
  
  public static void main(String[] args) throws Exception { 
      URL url = new URL(args[0]); 
      solicitudes = Integer.parseInt(args[1]);
      listThread=new ArrayList<Thread>();
      for(int i=0;i<solicitudes;i++){
          listThread.add(new Cliente(url));
      }
      int contador=0;
      for (Thread t:listThread){
          t.start();
          contador++;
      }
      System.out.println("Solicitudes realizadas "+ contador);
        
    }
  
  @Override
  public void run(){
      try{
          BufferedReader reader = new BufferedReader(
          new InputStreamReader(url.openStream()));
          String inputLine = null; 
          while ((inputLine = reader.readLine()) != null) { 
            System.out.println(inputLine); 
          } 
       } catch (IOException x) { 
               System.err.println(x); 
       } 
  }
}
