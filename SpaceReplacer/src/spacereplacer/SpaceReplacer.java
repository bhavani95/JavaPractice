/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacereplacer;

import java.util.Scanner;

/**
 *
 * @author S528143
 */
public class SpaceReplacer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                str=str.substring(0, i)+"20%"+str.substring(i+1);
                
            }
        }
        System.out.println(str);
        
        
    }
    
}
