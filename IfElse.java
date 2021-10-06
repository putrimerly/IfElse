/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tugas1;


/**
 *
 * @author Putri Merly Deleo Karina
 */
import javax.swing.JOptionPane; 
public class IfElse {           
    
    
    public static void main(String[] args){
        System.out.println("-------------------------------------------------");    
        System.out.println("             PROGRAM PERKALIAN MATRIKS");               
        System.out.println("-------------------------------------------------\n");  
        
        int jumlah = 0,i,j,k;                                
        
        int matriks1 [][] = new int [3][3];         
        int matriks2 [][] = new int [3][3];         
        int hasil [][] = new int [3][3];            
        int pil;                                    
        
        System.out.println("Perhitungan Matriks : \n1. Perkalian Matriks"                         
                + "\n2. Penjumlahan Matriks\n3. Pengurangan Matriks");                            
        
        String input = JOptionPane.showInputDialog("Perhitungan Matriks : \n1. Perkalian Matriks"  
                + "\n2. Penjumlahan Matriks\n3. Pengurangan Matriks\nInput Pilihan : ");           
        pil = Integer.parseInt(input);                                                              
        
        for(i=0;i<3;i++){                                                                                      
            for(j=0;j<3;j++){                                                                                  
                input = JOptionPane.showInputDialog("INPUT MATRIKS 1: \nBaris " + (i+1) + " Kolom " + (j+1));
                matriks1[i][j] = Integer.parseInt(input);                                                      
            }
        }
        
        for(i=0;i<3;i++){                                                                                  
            for(j=0;j<3;j++){                                                                                   
                input = JOptionPane.showInputDialog("INPUT MATRIKS 2: \nBaris " + (i+1) + " Kolom " + (j+1));
                matriks2[i][j] = Integer.parseInt(input);                                                       
            }
        }
        
        System.out.println();
        System.out.println("Matriks 1 : ");                                                                     
        
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(matriks1[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("-----------------------------------------------");                      
        
        System.out.println("Matriks 2 : ");                                                        
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(matriks2[i][j] + "\t");
            }
            System.out.println(" ");
        } 
        System.out.println("-----------------------------------------------");                    
        System.out.println();
        
        if(pil == 1){                                                                          
            System.out.println("Perhitungan Perkalian Matriks ");                              
            System.out.println("Hasil Perkalian : ");
                for(i=0 ; i<3; i++){                                                           
                    for (j=0; j<3; j++){
                        for(k=0; k<3; k++){
                            jumlah = jumlah + matriks1[i][k] * matriks2[k][j];                 
                        }
                        hasil [i][j] = jumlah;                                                 
                        jumlah = 0;
                    }
                }
                for(i=0; i<3;i++){
                    for(j=0;j<3;j++){
                        System.out.print( hasil[i][j] +"\t");                                 
                    }
                    System.out.println();
                }
        }else if(pil == 2){                                                               
            System.out.println("Perhitungan Penjumlahan Matriks ");                            
            System.out.println("Hasil Penjumlahan : ");
                for (i = 0; i < 3; i++) {                                                      
                    
                  for (j = 0; j < 3; j++) {
                        hasil[i][j] = matriks1[i][j] + matriks2[i][j];                       
                        System.out.print(hasil[i][j] + "\t");                                
                    }
                  System.out.println();
                }   
        }else if(pil == 3){                                                                     
            System.out.println("Perhitungan Pengurangan Matriks ");
            System.out.println("Hasil Pengurangan : ");                                         

            for (i = 0; i < 3; i++) {                                                           
              for (j = 0; j < 3; j++) {
                    hasil[i][j] = matriks1[i][j] - matriks2[i][j];                              
                    System.out.print(hasil[i][j] + "\t");                                       
                }
              System.out.println();
            }  
        }else{                                                                                  
            System.out.println("Inputan Anda salah !!!");
            system.out.println("silahkan isikan ulang!!");
        }
    }
}
