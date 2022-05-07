/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author 84967
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int s = 0,n;
         n = sc.nextInt();
         if(n==0){
             System.out.println(0);
         }
         else{
             for(int i=1; i<n; i++){
            if(n%i==0){
                s = s+i;
            }
        }
        System.out.println(s);
         }
        
    }
    
}
