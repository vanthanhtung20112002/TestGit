/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author 84967
 */
public class Bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n, max;
        int[] a = new int[100];
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        max = a[0];
        int vitri = 0;
        	for(int i=0; i<n; i++){
			if(a[i]>max){
				max = a[i];
			  vitri  = i+1;
			}
		}
         System.out.println(vitri);
    }
    
}
