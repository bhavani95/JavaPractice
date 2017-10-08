/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author s528143
 */
public class Hr6 {

    /**
     * @param args the command line arguments
     */
    
  
        static boolean isAnagram(String a, String b) {
      int count=0;
        boolean bo=false;
          if(a.length()==b.length())
          {
             a=a.toUpperCase();
              b=b.toUpperCase();
              char[] chars;
              chars=a.toCharArray();
               char[] charst;
             charst=b.toCharArray();
              Arrays.sort(chars);
              
              Arrays.sort(charst);
             
             for(int i=0;i<chars.length;i++)
             {
              if(chars[i]==charst[i]){
                  count++;
                  
              }
              else{
                  count--;
              }
              if(count==chars.length)
              {
                  bo=true;
              }
             }
              
              
              
          }
        return bo;
    }
    public static void main(String[] args) {
        // TODO code application logic here
       
        
          Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String r=sc.next();
    boolean ret = isAnagram(s, r);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
   
    
    }
    
    
}
