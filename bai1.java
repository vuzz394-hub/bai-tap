package if_else1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap hang: ");
        String grade = sc.next();
        System.out.println("Vui long nhap luong co ban: ");
        double salary = sc.nextDouble();
        int allowance = 100; //Default la hang other
        if(grade.equalsIgnoreCase("A")){
            allowance = 300;
        } else if(grade.equalsIgnoreCase("B")){
            allowance = 250;
        }
        salary += allowance;
        System.out.println("Luong thuc nhan la: " + salary);
    }        
}
