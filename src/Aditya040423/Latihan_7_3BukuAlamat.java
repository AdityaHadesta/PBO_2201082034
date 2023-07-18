/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aditya040423;

/**
 *
 * @author zikainu
 */
public class Latihan_7_3BukuAlamat {
    public static void main(String[] args){
        String[][] entry = {{"Florence", "735-1234", "Manila"},
                {"Joyce", "983-3333", "Quezon City"},
                {"Becca", "456-3322", "Manila"}};
        
        for (String[] data : entry) {
            System.out.println("Name : " + data[0]);
            System.out.println("Tel. # : " + data[1]);
            System.out.println("Address : " + data[2]);
            System.out.println();
        }
    }
  }

                
    

