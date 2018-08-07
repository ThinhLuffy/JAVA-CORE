import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {

        double cv, Pi=3.14,r;

        Scanner input = new Scanner(System.in);

        System.out.println("Moi nhap vap ban kinh hinh tron la: ");
        r = input.nextDouble();

        System.out.println("------ Chu Vi Hinh Tron------");

        cv = 2 * Pi * r;
        System.out.println("Chu Vi cua Hinh Tron la: " + cv);

        System.out.println("---- Dien tich hinh tron -----");


        System.out.println("Dien tich hinh tron la:  " + Math.pow(r,2));
    }
}
