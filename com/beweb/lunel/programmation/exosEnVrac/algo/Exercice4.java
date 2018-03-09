/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.programmation.exosEnVrac.algo;

/**
 *
 * @author yannis
 */
public class Exercice4 {
    
    public static void launch(){
        
        boolean flag = true;
        int var = 0;
        
        if (flag) {
            --var;
        }else{
            ++var;
        }
        flag = !flag;
        
        System.out.println("Exo 4 : Que dit-on à un poisson qui parle trop fort ? Baisse d’un thon !" + var);
        
    }    
    
}
