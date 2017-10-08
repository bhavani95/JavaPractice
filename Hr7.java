/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr7;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author s528143
 */
public class Hr7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        String s=sc.nextLine();
       String delims = "[ !,?._'@]+";
        String[] c=s.split(delims);
        System.out.println(c.length);
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
    
    }
    
}
