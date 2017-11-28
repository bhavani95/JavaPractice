/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumbers;

import java.util.Scanner;

/**
 *
 * @author S528143
 */
public class PrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //Count var , string for storing prime numbers
      int count;
      String p="";
      Scanner sc=new Scanner(System.in);
     System.out.println("enter the range");
     int n1=sc.nextInt();
     int n2=sc.nextInt();
      for(int i=n1;i<=n2;i++){
           count=0;
          for(int j=i;j>0;j--){
              if(i%j==0){
                 
                  count++;
              }
                 
          }
          if(count==2){
              p= p+i+" ";
              }
          
      }
      
      System.out.println(p);
      
      
                
    }
}
