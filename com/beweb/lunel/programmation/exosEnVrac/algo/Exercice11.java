/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.programmation.exosEnVrac.algo;

import java.util.Arrays;

/**
 *
 * @author lowas
 */
public class Exercice11 {


    
    public static void launch(){
        
        int[] suite = new int[1000];
        int[] nombrespairs = new int[1000];
        int[] nombresimpairs = new int[1000];
        int[] multiplesdecinq = new int[1000];
        int[] multiplesdetroix = new int[1000];
        
        int n, a = 0, b = 0, c = 1;
        int w = 0, x=0, y=0, z=0;

        for(int i = 1; i <= 1000; i++)
        {
            a = b;
            b = c;
            c = a + b;
            suite[i-1] = a;
     
            if (a%2 == 0) {
              nombrespairs[w] = a;
              w++;
            }else{
              nombresimpairs[x] = a;
              x++;
            } 
            if (a%3 == 0) {
                multiplesdetroix[y] = a;
                y++;
            }
            if (a%5 == 0) {
                multiplesdecinq[z] = a;
                z++;
            }
            
        }
        System.out.println(Arrays.toString(suite));
        System.out.println(Arrays.toString(nombrespairs));
        System.out.println(Arrays.toString(nombresimpairs));
        System.out.println(Arrays.toString(multiplesdetroix));
        System.out.println(Arrays.toString(multiplesdecinq));
        
        System.out.println("Exo 11 : Comment ramasse-t-on la papaye? Avec une foufourche");
    }
}
