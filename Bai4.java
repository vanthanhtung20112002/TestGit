/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author 84967
 */
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =  new Scanner(System.in);
        int n,m,s,s1 = 0;
        int[][] a = new int[100][100];
        n = sc.nextInt();
                m = sc.nextInt();
        for(int i=0; i<n; i++){        
          for(int j=0; j<m; j++){
             a[i][j] = sc.nextInt();
          }
        }
        for(int i=0; i<n; i++){
            s=0;
          for(int j=0; j<m; j++){
                s = s+ a[i][j];
            }
            System.out.print(s+" ");
        }
        System.out.print("\n");
          for(int j=0; j<m; j++){
            s1=0;
          for(int i=0; i<n; i++){
                s1 = s1+ a[i][j];
            }
            System.out.print(s1+" ");
        }
          
        }
    
}
