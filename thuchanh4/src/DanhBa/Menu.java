/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhBa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Menu {
    public static void main(String[] args) {
        PhoneManager dt = new PhoneManager();
         Scanner sc = new Scanner(System.in);
        int menuID;
        do{
            System.out.println("nhập menu");
            System.out.println("1 - thêm .2 - hiện thị . 3 - sửa . 4- xóa. 5- tìm. 6 - thoát");
            menuID = sc.nextInt();
            switch(menuID){
                case 1:
                    System.out.println("nhập thêm danh bạ ");
                    dt.input();
                    break;
                case 2:
                    dt.displayPhone();
                    break;
                  case 3:
                      System.out.println("sửa danh bạ");
                    dt.updatePhone();
                    break;
                      case 4:
                          System.out.println("xóa danh bạ");
                    dt.removePhone();
                    break;
                      case 5:
                          System.out.println("tìm danh bạ");
                          String S;
                          System.out.println("nhập tên cần tìm :");
                          S = sc.nextLine();
                           ArrayList<PhoneBook> tempList = dt.findPhone(S);
                           for(PhoneBook tmep: tempList ){
                               tmep.displayPhone();
                           }
                    break;
                      case 6:
                          System.out.println("bye");
                          break;
                      default: 
                          System.out.println("nhập từ 1-6");
            }
                }while(menuID !=6);
         
         
         
         
         
    }
}
