/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylst;

import java.util.ArrayList;

/**
 *
 * @author S528143
 */
public class Arraylst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] words=new String[]{"Durga ","Bhavani ","Kuppagiri "};
        ArrayList<String> a=new ArrayList<String>();
        a=stringAdd(words);
        for(String ap: a){
        System.out.print(ap+" ");
        }
    
       
       
    }
    static ArrayList<String> stringAdd(String[] words){
        ArrayList<String> s=new ArrayList<String>();
        for(String w: words){
            
          s.add(w);
            
            
        }
        return s;
        
    }
    
}
