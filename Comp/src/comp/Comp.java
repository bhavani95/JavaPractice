/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp;

/**
 *
 * @author S528143
 */
public class Comp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=60;
        int b=30;
        int c=10;
        if(a>b){
            if(a>c){
                System.out.println("A is big");
            }
            else{
                System.out.println("C is big");
            }
            
           
        }
        else if(b>a){
            if(b>c){
                System.out.println("b is big");
                
            }
            else{
                 System.out.println("C is big");
            }
        }
        else{
            System.out.println("c is big");
            
        }
    }
    
}
