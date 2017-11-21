/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtruncation;

import java.util.Scanner;

/**
 *
 * @author S528143
 */
public class StringTruncation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
        
    }
    static String super_reduced_string(String s){
        // Complete this function
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                s=s.substring(0,i-1)+ s.substring(i+1);
                i=0;
            }
            if(s.length()==0){
               s="Empty String";
            }
        }
        return s;
    }
        
    
}
