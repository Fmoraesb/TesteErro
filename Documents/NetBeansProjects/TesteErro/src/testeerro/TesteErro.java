/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeerro;

/**
 *
 * @author Fernando
 */
public class TesteErro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     System.out.println("inicio do main");
    //try{
     metodo1();
    /*}catch(ArrayIndexOutOfBoundsException e){
     *      System.out.println("Ocorreu o erro " + e);
     */       
        
    System.out.println("fim do main");
  }

  static void metodo1() {
    System.out.println("inicio do metodo1");
    //try{
    metodo2();
     /*}catch(ArrayIndexOutOfBoundsException e){
     *      System.out.println("Ocorreu o erro " + e);
     */       
       
    System.out.println("fim do metodo1");
  }

  static void metodo2() {
    System.out.println("inicio do metodo2");
        int[] array = new int[10];
        //try{ Ou
        for (int i = 0; i <= 15; i++) {
        //try{
            array[i] = i;      
        System.out.println(i);
     /*}catch(ArrayIndexOutOfBoundsException e){
     *      System.out.println("Ocorreu o erro " + e);
     */       
        
    }
    System.out.println("fim do metodo2");
  }
}

