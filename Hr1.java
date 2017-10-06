/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr1;

import java.util.Scanner;

/**
 *
 * @author s528143
 */
public class Hr1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1;
        String str2;
        Scanner sc=new Scanner(System.in);
        str1=sc.next();
        str2=sc.next();
        int a= str1.length()+str2.length();
        System.out.println(a);
        if(str1.compareTo(str2)>0)
        {
            System.out.println("yes");
            
            
        }
        else{
            System.out.println("No");
        }
        System.out.println(str1.substring(0,1).toUpperCase()+str1.substring(1));
         System.out.println(str2.substring(0,1).toUpperCase()+str2.substring(1));
        
    
    }
    
}

