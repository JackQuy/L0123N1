package Buoi1;

import java.util.Scanner;

public class NhapData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


//        scan.nextLine();
        System.out.print("Nhập vào tên: ");
        String name = scan.nextLine();

        System.out.print("Nhập vào tuổi: ");
        int age = scan.nextInt();

        System.out.println("Tuổi: " + age);
        System.out.println("Tên: " + name);
    }
}
