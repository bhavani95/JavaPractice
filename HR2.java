/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr2;

import java.util.Scanner;

/**
 *
 * @author s528143
 */
public class HR2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s;
        int start,end=0;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
       
        start=sc.nextInt();
        end=sc.nextInt();
        String  s1=s.substring(start, end);
        System.out.println(s1);

    }
    
}
