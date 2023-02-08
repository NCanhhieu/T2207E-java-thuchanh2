/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhBa;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PhoneBook implements Phone{
    String name;
    String phoneNumber;

    public PhoneBook() {
        this.name = "";
        this.phoneNumber = "";
    }

    public PhoneBook(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    
    @Override
     public void insertPhone(){
         System.out.println("nhập tên người: ");
          Scanner sc = new Scanner(System.in);
          this.name = sc.nextLine();
          System.out.println(" nhập số đt: ");
          this.phoneNumber = sc.nextLine();
     }
    
     @Override
    public void displayPhone(){
         System.out.println(" Tên: "  + this.name );
         System.out.println("số đt: " + this.phoneNumber);
    }
}
