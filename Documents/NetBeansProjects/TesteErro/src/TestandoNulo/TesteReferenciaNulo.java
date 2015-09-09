/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestandoNulo;

/**
 *
 * @author Fernando
 */
public class TesteReferenciaNulo {
   public static void main(String[] args){
       Conta c = null;
       System.out.println("Seu saldo atual é: "+ c.getSaldo());   
   } 
}
