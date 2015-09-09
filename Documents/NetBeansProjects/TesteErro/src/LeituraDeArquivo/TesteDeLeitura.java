/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeituraDeArquivo;
import java.io.*;

/**
 *
 * @author Fernando
 */
public class TesteDeLeitura {
   public static void main(String[] args){
       metodo();
   }
public static void metodo(){
       try{
        new java.io.FileInputStream("notasav1.txt");
       }catch(java.io.FileNotFoundException file){
          System.out.println("Não foi possível abrir o arquivo, seu corno!");
       } 
   }    
}