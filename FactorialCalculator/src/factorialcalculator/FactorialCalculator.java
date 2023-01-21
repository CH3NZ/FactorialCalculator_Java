/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorialcalculator;
import java.util.*;
/**
 *
 * @author DanChen
 */
public class FactorialCalculator {

        // TODO code application logic here
        
        static public int fact(int n){
         int ai,afact=1;  
 
        for(ai=1;ai<=n;ai++){    
            afact=afact*ai;    
        }   
        return afact;
          }
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int aan=0;
           while(aan<5){
     
         
         
         System.out.print("Enter a positive integer: ");
            int n=sc.nextInt();
            if(n>=0){
                  System.out.print(n+"!"+"=");
                  for(int i=1;i<n;i++){
                         System.out.print(i+"*");
                  }System.out.println(n);

                  System.out.println("The factorial of "+n+" is: "+fact(n));
            }
            else{
                 System.out.println("Invalid Input! Program stopped!");
                 break;
            }
            aan+=1;
            }
        }
    }
