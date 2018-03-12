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
public class Exercice10 {


    
    public static void launch(){
        
        int n, a = 0, b = 0, c = 1;

        for(int i = 1; i <= 100; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.println(a);
        }
        
        
        System.out.println("Exo 10 : Combien de développeurs faut-t-il pour remplacer une ampoule grillée ? Aucun, c'est un problème Hardware. ");
    }
}
