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
public class PhoneManager  {
    ArrayList<PhoneBook> phoneList = new ArrayList();
    public int checksdt(String sdt){
        for(int i =0; i< phoneList.size(); i++){
            if( phoneList.get(i).phoneNumber.equals(sdt)){
                return i;
            }
        } return -1;
    }
    
       public int checkname(String name){
        for(int i =0; i< phoneList.size(); i++){
            if( phoneList.get(i).name.equals(name)){
                return i;
            }
        } return -1;
    }
       
    public void input(){
        PhoneBook phone = new PhoneBook();
        boolean j = true;
        do {
            phone.insertPhone();
            if (checksdt(phone.phoneNumber) >= 0){
                System.out.println("trùng sdt, hãy nhập lại");
            }
            else {
                phoneList.add(phone);
                j = false;  
            }
            }while(j);
        }
   
     public void displayPhone(){
   
         System.out.println("danh sách đt");
           for(int i = 0; i < phoneList.size(); i++){         
               phoneList.get(i).displayPhone();
           }
    }
     
     
    public ArrayList<PhoneBook> findPhone(String ten){
            ArrayList<PhoneBook> templist = new ArrayList();
              for(int i = 0; i <  phoneList.size(); i++){     
                  if( checkname(ten)>= 0){ 
                      templist.add(phoneList.get(i));
              }    
           }  
           for(int i = 0; i < templist.size(); i++){
             System.out.println("STT" + i);
           templist.get(i).displayPhone();
           }
           return templist ;
      }
    public void removePhone(){
         Scanner sc = new Scanner(System.in);
           System.out.println("nhập tên cần xóa");
          String ten;
          ten = sc.nextLine();
          ArrayList<PhoneBook> tempList =  findPhone(ten); 
          if(tempList.size() == 0){
            System.out.println("không có  tên cần xóa");
          }else {
             for(int i = 0; i < tempList.size(); i++){  
             int ixPhone = checksdt(tempList.get(i).phoneNumber);
                 phoneList.remove(ixPhone);
             }
          }
    }        
    
   
    public void updatePhone(){
          Scanner sc = new Scanner(System.in);
           System.out.println("nhập tên cần sửa");
          String ten;
          ten = sc.nextLine();
          String sdt;
          ArrayList<PhoneBook> templist = findPhone(ten);
          if(templist.size() == 0){
            System.out.println("không có  tên cần xóa");
          }else {
              System.out.println("chọn số cần xóa ");
              int chon = sc.nextInt();
           for( int i = 0; i <  templist.size(); i++){
                if( i == chon){
                   PhoneBook temp = templist.get(i);
                     System.out.println("nhập sdt muốn sửa:");
                     sdt  = sc.nextLine();
                   temp.phoneNumber = sdt; 
                   int ixPho = checksdt(templist.get(i).phoneNumber);
                   phoneList.set(ixPho, temp);
                }
           }
          }
           
          }
}
    

