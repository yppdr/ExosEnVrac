/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.programmation.exosEnVrac.algo;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author lowas
 */
public class Exercice12 {
    public static void launch(){
/**
 * PARTRIE RANDOM + INSERT LISTE
 */        
        int w=10;
        int h=10;
         
        // un vector qui contient les valeurs possibles (ici de 1 -> 9)
        Vector<Integer> v=new Vector<Integer>();
        for (int i = 1; i <= w*h ; i++) {
            v.add(i);
        }
             
        // notre tableau
        int t[][]=new int[w][h];
        Random ran=new Random();
         
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                // generation aleatoire de l'indice
                int index=ran.nextInt(v.size());
                // on remplis le tableau avec l'element du vector qui a pour indice (index)
                t[i][j]=v.get(index);
                // on supprime l'element utitlisé pour ne pas avoir de doublons
                v.remove(index);   
            }  
        }
         
       int cal = 0;
        // Affiche les valeur 
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                
                //System.out.println(t[i][j]+ " " );
            }  
            System.out.println();
        }
        
        
        
/**
 * PARTIE AFFICHAGE
 */      

        System.out.println(cal);
        
        System.out.println("Exo 12 : (Blague) " + t.length);
    }
}
