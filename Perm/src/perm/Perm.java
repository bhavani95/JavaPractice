/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perm;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author S528143
 */
public class Perm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1=new String();
        String str2=new String();
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two strings you want to check");
        str1=sc.next();
        str2=sc.next();
        boolean c;
        
        if(str1.length()==str2.length()){
            
        char[] a=str1.toCharArray();
          char[] b=str2.toCharArray();
          Arrays.sort(a);
          Arrays.sort(b);
          c=Arrays.equals(a, b);
          if(c==true){
              System.out.println("They are same");
          }
          else{
              System.out.println("They are different");
          }
         
          
        
    }
    }
}
