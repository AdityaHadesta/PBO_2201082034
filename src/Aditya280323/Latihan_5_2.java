/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aditya280323;

import javax.swing.JOptionPane; 
/**
 *
 * @author zikainu
 */
public class Latihan_5_2 {
    public static void main (String[] args)
	{
		//input OptionPane1
	String name = "";
	name = JOptionPane.showInputDialog("Please enter your words 1");
	
		//input OptionPane2
	String nama = "";
	nama = JOptionPane.showInputDialog("Please enter your words 2");
	
		//input OptionPane3
	String namawa = "";
	namawa = JOptionPane.showInputDialog("Please enter your words 3 ");
	
	String msg = name +" "+ nama +" "+ namawa ;
	JOptionPane.showMessageDialog(null, msg);
		}	
}
