import java.util.Scanner;

public class tienTe {
    public static void main(String[] args) {
        int rate = 230000;

        int USD;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter USD: " );
        USD = scanner.nextInt();

        int VND = USD * rate;

        System.out.println("VND is " + VND);
    }
}
