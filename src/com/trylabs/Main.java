package com.trylabs;

import java.util.Scanner;

public class Main {
 static   Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
 System.out.println("Введите дату основания Одессы:");
 int dataOsn = scanner.nextInt();
 if (dataOsn==1794)
 { System.out.println("верно");
    }
    else {
     System.out.println("неверно, дата основания Одессы 1794 год. ");}
 }

}
