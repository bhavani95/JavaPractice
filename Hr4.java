/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr4;

import java.util.Scanner;

/**
 *
 * @author s528143
 */
public class Hr4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b="";
        for(int i=a.length()-1;i>=0;i--){
            b=b+a.charAt(i);
            
        }
      
        if(a.equals(b)){
            System.out.println("yes");
            
        }
        else{
            System.out.println("No");
        }
        
    }
    }
    

