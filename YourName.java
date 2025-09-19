/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.yourname;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class YourName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        System.out.println("Hello, " + name + "!");
    }
}
