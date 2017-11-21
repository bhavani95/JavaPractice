/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniq;

import java.util.Scanner;

/**
 *
 * @author S528143
 */
public class Uniq {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str=new String();
        boolean b=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        str=sc.next();
        for(int i=0;i<str.length();i++){
            for(int j=0;j<i;j++){
                if(str.charAt(i)==str.charAt(j)){
                    
                    b=true;
                }
            }
            
        }
        if(b==true){
            System.out.println("String have same characters");
        }
        else{
            System.out.println("String have different characters");
        }
    }
    
}
