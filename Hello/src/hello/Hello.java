/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author S528143
 */
public class Hello {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) throws bhavanisException {
        // TODO code application logic here
        System.out.println("Hi this is Bhavani");
        int a=0;
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    if(a>10)
    {
      throw new bhavanisException("Hi you are giving an integer which is greater than 10");
    }
    else{
        System.out.println();
    }
    }
    /**
     * @author
     */
   
    
}
