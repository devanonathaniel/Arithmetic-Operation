/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kasir;

/**
 *
 * @author devan
 */
import java.util.Scanner;
public class Kasir {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        
        System.out.print("ES Companie Portal - Cashier App \n============================== \n Input item's name : ");
        String name = scn.nextLine();
        
        System.out.print("Input item's price [ Use Decimal Number ] : $");
        Double price = scn.nextDouble();
        
        System.out.print("Input item's quantity [1..20] : ");
        Integer quantity = scn.nextInt();
        
        System.out.print("Input item discount [1..50] : ");
        Integer discount = scn.nextInt();
        
        Double quantity1 = (double)quantity;
        Double discount1 = (double)discount;
        
        Double Total = price * quantity1 * (100 - discount1)/100;
        System.out.println(" ");
        System.out.println("ES Companie Portal - Cashier App \n============================== \n items's name :" +name);
        
        System.out.println(" ");
        
        System.out.println("Input your money [Use Decimal Number] : $ ");
        
        Double money = scn.nextDouble();
        
        Double Totalprice = money - Total;
        
        System.out.println("Thanks for purchasing!\n Your change : $" +Totalprice);
}
}
