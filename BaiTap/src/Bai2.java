import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.println("----- Doi C sang F ----------");


        float Celsius;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Moi nhap vao gia tri Celsius la: ");
        Celsius = scanner.nextFloat();

        System.out.println("--- KET QUA -----");

        float F = ((9*Celsius) / 5) + 32;

        System.out.println(" Day la ket qua ");
        System.out.println("Do F sau khi doi la: " + F);
    }
}
