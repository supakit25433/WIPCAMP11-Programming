/*
 * Copyright (C) 2019 WipCamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author WipCamp11
 */
public class Stock {

    public static void main(String[] args) {
        int item = 0;
        int limit = 15;
        int menu;
        boolean check = true;

        while (check) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Menu : item : " + item + " , limit : " + limit);
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Check item");
            System.out.println("4. Stop");
            System.out.print("Please enter what you do you want : ");
            menu = sc.nextInt();

            if (menu == 1) {
                System.out.println("-----------------");
                System.out.println("-----------------");
                System.out.println("Menu 1 : ADD ITEM");
                if (item < limit) {
                    System.out.print("Please enter number of item to add : ");
                    int amount = sc.nextInt();
                    if (item + amount > limit) {
                        System.out.println("item เกินลิมิต");
                    } else {
                        item = item + amount;
                        System.out.println("Item : " + item + " , Limit : " + limit);
                    }
                } else {
                    System.out.println("Item เต็ม");
                }
            } else if (menu == 2) {
                System.out.println("-----------------");
                System.out.println("-----------------");
                System.out.println("Menu 2 : REMOVE ITEM");
                if (item > 0) {
                    System.out.print("Please enter number of item to remove : ");
                    int amount = sc.nextInt();
                    if (item - amount < 0) {
                        System.out.println("ไอเท็มมีไม่พอให้ลบได้");
                    } else {
                        item = item - amount;
                        System.out.println("Item : " + item + " , Limit : " + limit);
                    }
                } else {
                    System.out.println("โกดังไม่มีสินค้าอยู่");
                }
            } else if (menu == 3) {
                System.out.println("Item : " + item + " , Limit : " + limit);
            } else if(menu == 4){
                check = false;
            } 
            else {
                System.out.println("Menu is not correct.");
            }
        }
    }

}
