/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author 84967
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n;
        int[] a = new int[100];
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
    }
        int max = a[0],min = a[0];
        for(int i=0; i<n-1; i++){
        	if(max < a[i]){
			max = a[i];
		}
		if(min > a[i]){
			min = a[i];
		}
        }
        System.out.println(max+" "+min+" "+(n-1));
    
}}
