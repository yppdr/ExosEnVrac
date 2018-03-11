/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.programmation.exosEnVrac.algo;

/**
 *
 * @author lowas
 */
public class Exercice8 {
    
    public static void launch(){
       
        for (int j = 243; j > 0; j--) {
            if (j%2 == 0) {
                System.out.println("Nombre paire " + j);
            }if(j%5 == 0){
                System.out.println("Multiple de 5 " + j);
            }if(j%10 == 0){
                System.out.println("Multiple de 1 " + j);
            }
        }
        
        System.out.println("Exo 8 : return $UneBlague");
    }
    
}
