/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jatek;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author SzalaiZoltánGábor(Sz
 */
public class Jatek {
    
   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Random random = new Random();
       //System.out.println("Egész : ");
       //int egesz = sc.nextInt();
       //System.out.println("A bekért szám duplája : " + egesz*2);
       //sc.nextLine();
       //System.out.print("Szöveg : ");
       //String szoveg = sc.nextLine();
       //System.out.println("A bekért szöveg : " + szoveg);
       System.out.println("Döntésed: ");
       String userChoice = sc.nextLine();
       System.out.println("A döntésed: " + userChoice);
       
       String[] randomChoices = ("kő, papír, olló");
       int compIndex = random.nextInt(3);
       System.out.println("A döntésed: " + computerChoice);
       
       
       
    }
    
}
