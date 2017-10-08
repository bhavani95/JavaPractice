/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr5;

import java.util.Scanner;

/**
 *
 * @author s528143
 */
public class Hr5 {

    /**
     * @param args the command line arguments
     */
    static Scanner sc=new Scanner(System.in);
    static int b=sc.nextInt();
    static int h=sc.nextInt();
    static{
        try{
            if(b>=0&&h>=0)
            {
                System.out.println(b*h);
            }else{
                throw new Exception("Breadth and height must be positive");
                  }
        }
            catch(Exception e)
                    {
                    System.out.println(e);
                    }
        
    }
    
    
       
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
